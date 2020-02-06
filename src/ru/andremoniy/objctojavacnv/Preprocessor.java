package ru.andremoniy.objctojavacnv;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.andremoniy.objctojavacnv.antlr.Macros;
import ru.andremoniy.objctojavacnv.antlr.output.PreprocessorLexer;
import ru.andremoniy.objctojavacnv.antlr.output.PreprocessorParser;
import ru.andremoniy.objctojavacnv.context.ProjectContext;
import ru.andremoniy.objctojavacnv.tokenize.StringToken;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: Andremoniy
 * Date: 06.07.12
 * Time: 9:46
 */
public final class Preprocessor {

    private static final Logger log = LoggerFactory.getLogger(Preprocessor.class);

    public static final String VERSIONS_PATH = File.separator + "Versions" + File.separator;
    public static final String HEADERS_PATH1 = ".framework";
    public static final String HEADERS_PATH2 = File.separator + "Headers" + File.separator;

//    private static final List<String> doNotAppend = Arrays.asList("@", ".", "#");

    private Preprocessor() {
    }

    public static boolean preprocessFile(ProjectContext context, String fileName, List<String> processedImports, boolean onlyIfs, String rootPath) throws IOException, RecognitionException {
        File mFile = new File(fileName);

        if (rootPath != null && context.imports != null && mFile.getName().endsWith(".m")) {
            String importPath = mFile.getPath().substring(rootPath.length(), mFile.getPath().length() - 2).replace(File.separator, ".");
            String className = mFile.getName().substring(0, mFile.getName().length() - 2);
            Set<String> importsList = context.imports.get(className);
            if (importsList == null) {
                importsList = new HashSet<>();
                context.imports.put(className, importsList);
            }
            importsList.add(importPath);
        }

        // накапливаем список категорий для каждого файла
        if (mFile.getName().endsWith(".h") && mFile.getName().contains("+")) {
            String baseName = mFile.getName().substring(0, mFile.getName().indexOf("+"));
            Set<String> categoriesList = context.categories.get(baseName);
            if (categoriesList == null) {
                categoriesList = new HashSet<>();
                context.categories.put(baseName, categoriesList);
            }
            categoriesList.add(mFile.getPath());
        }

        String input = FileUtils.readFileToString(mFile, ConverterProperties.PROPERTIES.getProperty(ConverterProperties.ENCODING));

        try {
            preprocessInternal(context.macrosMap, fileName, processedImports, onlyIfs, input, context.isSkipSDK());
        } catch (Exception e) {
            log.info("Failed to preprocess file: " + fileName);
            log.error(e.getMessage(), e);
        }

        return false;
    }

    private static void preprocessInternal(Map<String, List<Macros>> macrosMap, String fileName, List<String> processedImports, boolean onlyIfs, String input, boolean skipSDK) throws RecognitionException, IOException {
        boolean parseManyTimes;
        Map<String, List<Macros>> localMap = new HashMap<>();

        parseManyTimes:
        do {
            if (input.trim().isEmpty()) {
                macrosMap.putAll(localMap);
                return;
            }

            parseManyTimes = false;
            PreprocessorParser.code_return result = getResult(input);

            // это переменная для хранения кода после обработки препроцессором (if-ы и прочее)
            childIterator:
            for (Object child : ((CommonTree) result.getTree()).getChildren()) {
                CommonTree childTree = (CommonTree) child;
                if (!onlyIfs) {
                    switch (childTree.token.getType()) {
                        case PreprocessorParser.T_DEFINE:
                            Macros macros = Macros.build(childTree, fileName);
                            List<Macros> macrosList = macrosMap.get(macros.getName());
                            if (macrosList == null) {
                                macrosList = new ArrayList<>();
                                macrosMap.put(macros.getName(), macrosList);
                            }
                            if (!macrosList.contains(macros)) {
                                macrosList.add(macros);
                            }
                            break;
                        case PreprocessorParser.T_IMPORT:
                            if (!skipSDK) {
                                localMap.putAll(loadFromFile(processedImports, childTree));
                            }
                            break;
                        case PreprocessorParser.T_INCLUDE:
                            break;
                    }
                } else {
                    switch (childTree.token.getType()) {
                        case PreprocessorParser.T_IF_DEFINE:
                            input = processCommonIfDefine(macrosMap, fileName, processedImports, input, childTree, true, skipSDK);
                            parseManyTimes = true;
                            break childIterator;
                        case PreprocessorParser.T_IF_NOT_DEFINE:
                            input = processCommonIfDefine(macrosMap, fileName, processedImports, input, childTree, false, skipSDK);
                            parseManyTimes = true;
                            break childIterator;
                        case PreprocessorParser.T_IF_SIMPLE:
                            input = processSimpleIfs(input, childTree, macrosMap);
                            writeObjCode(new File(fileName + "p"), input);
                            preprocessInternal(macrosMap, fileName, processedImports, false, input, skipSDK);
                            parseManyTimes = true;
                            break childIterator;
                    }
                }
            }
        } while (parseManyTimes);
        macrosMap.putAll(localMap);
    }

    public static PreprocessorParser.code_return getResult(String input) throws RecognitionException {
        CharStream cs = new ANTLRStringStream(input);
        PreprocessorLexer lexer = new PreprocessorLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        PreprocessorParser parser = new PreprocessorParser(tokens);

        return parser.code();
    }

    private static String processCommonIfDefine(Map<String, List<Macros>> macrosMap, String fileName, List<String> processedImports, String input, CommonTree childTree, boolean defineDirection, boolean skipSdk) throws RecognitionException, IOException {
        input = processDefineIfs(input, childTree, macrosMap, defineDirection);
        writeObjCode(new File(fileName + "p"), input);
        preprocessInternal(macrosMap, fileName, processedImports, false, input, skipSdk);
        return input;
    }

    private static void writeObjCode(File file, String input) {
        try {
            FileUtils.writeStringToFile(file, input, ConverterProperties.PROPERTIES.getProperty(ConverterProperties.ENCODING));
        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }
    }

    private static String processDefineIfs(String input, CommonTree tree, Map<String, List<Macros>> macrosMap, boolean defineDirection) {
        boolean isDefined = defineDirection ? testIfDefined(tree, macrosMap) : !testIfDefined(tree, macrosMap);

        return commonIfInternal(input, tree, isDefined);
    }

    private static String processSimpleIfs(String input, CommonTree tree, Map<String, List<Macros>> macrosList) {
        CommonTree expressionTree = (CommonTree) tree.getFirstChildWithType(PreprocessorParser.T_EXPRESSION);
        boolean expression = processExpr(expressionTree, macrosList);
        return commonIfInternal(input, tree, expression);
    }

    private static boolean processExpr(CommonTree expressionTree, Map<String, List<Macros>> macrosList) {
        boolean expression = true;
        for (Object child : expressionTree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_EX_OR:
                    expression = processExOr(childTree, macrosList);
                    break;
            }
        }
        return expression;
    }

    private static boolean processExOr(CommonTree tree, Map<String, List<Macros>> macrosList) {
        boolean expression = false;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_EX_AND:
                    expression = processExAnd(tree, macrosList);
                    break;
                case PreprocessorParser.T_EXPRESSION:
                    expression = expression && processExpr(tree, macrosList);
                    break;

            }
        }

        return expression;
    }

    private static boolean processExAnd(CommonTree tree, Map<String, List<Macros>> macrosList) {
        boolean expression = false;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_EX_NOT:
                    expression = processExNot(tree, macrosList);
                    break;
            }
        }

        return expression;
    }

    private static boolean processExNot(CommonTree tree, Map<String, List<Macros>> macrosList) {
        boolean expression = false;
        boolean wasExc = tree.getFirstChildWithType(PreprocessorLexer.EXC) != null;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_EX_COND:
                    expression = !wasExc && processExCond(tree, macrosList);
                    break;
            }
        }

        return expression;
    }

    private static boolean processExCond(CommonTree tree, Map<String, List<Macros>> macrosList) {
        int expression = 0;
        String op = null;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_EX_SNGL:
                    int expression1 = processExSngl(tree, macrosList);
                    if (op == null) {
                        expression = expression1;
                    } else {
                        switch (op) {
                            case "==":
                                return expression == expression1;
                            case ">=":
                                return expression >= expression1;
                            case ">":
                                return expression > expression1;
                            case "<":
                                return expression < expression1;
                            case "<=":
                                return expression <= expression1;
                        }
                    }
                    break;
                case PreprocessorParser.T_COND_OP:
                    op = childTree.getChild(0).getText();
                    break;
            }
        }

        return expression != 0;
    }

    private static Integer processExSngl(CommonTree tree, Map<String, List<Macros>> macrosList) {
        Integer expression = 0;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_EX_MATH:
                    expression = processExMath(childTree, macrosList);
                    break;
                case PreprocessorParser.T_EX_DEF:
                    expression = processExDef(childTree, macrosList);
                    break;
            }
        }
        return expression;
    }

    private static Integer processExDef(CommonTree tree, Map<String, List<Macros>> macrosList) {
        return processExpr(tree, macrosList) ? 1 : 0;
    }

    private static Integer processExMath(CommonTree tree, Map<String, List<Macros>> macrosList) {
        Integer expression = 0;
        boolean doMinus = false;
        String lastOp = "";
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_NAME:
                    List<Macros> macros = macrosList.get(childTree.getChild(0).getText());
                    int nextExpression1 = (doMinus ? -1 : 1) * ((macros != null && macros.size() > 0 && !macros.get(0).getReplace().isEmpty()) ? Integer.parseInt(macros.get(0).getReplace()) : 0);
                    expression = mathOp(expression, nextExpression1, lastOp);
                    break;
                case PreprocessorParser.T_EX_OP:
                    lastOp = childTree.getChild(0).getText();
                    break;
                default:
                    if (((CommonTree) child).getText().equals("-")) {
                        doMinus = true;
                    } else {
                        int nextExpression2 = (doMinus ? -1 : 1) * Integer.parseInt(((CommonTree) child).getText());
                        expression = mathOp(expression, nextExpression2, lastOp);
                    }
            }
        }
        return expression;
    }

    private static Integer mathOp(Integer e1, Integer e2, String op) {
        switch (op) {
            case "":
                return e2;
            case "+":
                return e1 + e2;
            case "*":
                return e1 * e2;
            case "-":
                return e1 - e2;
        }
        return e2;
    }

    private static String commonIfInternal(String input, CommonTree tree, boolean positive) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (positive) {
                switch (childTree.token.getType()) {
                    case PreprocessorParser.T_IF_MAIN:
                        StringBuilder block = getBlock((CommonTree) childTree.getChild(0));
                        input = replaceIfBlock(input, tree, block);
                        return input;
                }
            } else {
                switch (childTree.token.getType()) {
                    case PreprocessorParser.T_IF_ELSE:
                        StringBuilder block = getBlock((CommonTree) childTree.getChild(0));
                        input = replaceIfBlock(input, tree, block);
                        return input;
                }
            }
        }

        input = replaceIfBlock(input, tree, new StringBuilder());
        return input;
    }

    private static String replaceIfBlock(String input, CommonTree tree, StringBuilder block) {
        int startLine = tree.getLine();
        int endLine = tree.getFirstChildWithType(PreprocessorLexer.ENDIF).getLine();

        String[] lines = input.split("\r|\n");
        StringBuilder newInput = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            if (i < startLine - 1 || i >= endLine) {
                newInput.append(lines[i]).append("\n");
            } else {
                if (i == startLine) {
                    newInput.append(block);
                }
            }
        }
        return newInput.toString();
    }

    private static StringBuilder getBlock(CommonTree tree) {
        StringBuilder block = new StringBuilder();
        int prevPos = -1;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getChildCount() > 0) {
                block.append(getBlock(childTree));
            } else {
                int thisPos = childTree.getCharPositionInLine();
                if (thisPos > prevPos) {
                    block.append(" ");
                }
                String text = ((CommonTree) child).getText();
                block.append(text);
                prevPos = thisPos + text.length();
            }
        }
        block.append(" "); // add " " in the end
        return block;
    }

    private static boolean testIfDefined(CommonTree tree, Map<String, List<Macros>> macrosMap) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_NAME:
                    String dName = childTree.getChild(0).getText();
                    return macrosMap.get(dName) != null;
            }
        }
        return false;
    }

    private static Map<String, List<Macros>> loadFromFile(List<String> processedImports, CommonTree childTree) throws IOException, RecognitionException {
        String hpath = getBlock(childTree).toString().replaceAll("\\s+", "");

        if (processedImports.contains(hpath)) return new HashMap<>();
        processedImports.add(hpath);

        hpath = hpath.substring(hpath.indexOf("<") + 1, hpath.lastIndexOf(">")).trim();
        if (!hpath.contains("/")) return new HashMap<>();
        String frameworkName = hpath.substring(0, hpath.indexOf("/"));
        String headerFile = hpath.substring(hpath.indexOf("/") + 1);

        log.info("Importing " + hpath);

        String path = ConverterProperties.PROPERTIES.getProperty(ConverterProperties.FRAMEWORKS) + frameworkName + HEADERS_PATH1;

        String fileName;
        do {
            path += VERSIONS_PATH;
            File hdir = new File(path);
            if (!hdir.exists() || !hdir.isDirectory()) return new HashMap<>();

            for (File dir : hdir.listFiles()) {
                if (dir.isDirectory()) {
                    path += dir.getName();
                    break;
                }
            }
            fileName = path + File.separator + HEADERS_PATH2 + headerFile;
        } while (!new File(fileName).exists());

        ProjectContext localContext = new ProjectContext();
        preprocessFile(localContext, fileName, processedImports, Converter.NOT_IFS, null);
        preprocessFile(localContext, fileName, processedImports, Converter.ONLY_IFS, null);
        return localContext.macrosMap;
    }

    public static String replace(String input, ProjectContext ctx, String fileName) {
        // first, let's do uniform of all defines, replacing any #define\\s+ by #define<white_space>:
        input = input.replaceAll("#define\\s+", "#define ");
        // commenting all defines in code
        for (List<Macros> macrosList : ctx.macrosMap.values()) {
            for (Macros macros : macrosList) {
                if (macros.getFileName() != null && macros.getFileName().equals(fileName)) {
                    if (macros.getReplace().contains("//#%#%")) {
                        String macrosDefine = "#define " + macros.getName();
                        int macrosStart = input.indexOf(macrosDefine);
                        // find all "\" after macros declaration:
                        int linesNumber = macros.getReplace().split("//#%#%").length;
                        // macros replace can start in same line, in which #define is declared
                        // or it can start on next line, then we need to add one line to linesNumber variable
                        int firstRetIndex = input.indexOf("\n", macrosStart);
                        // this is the tail of the first line with #define directive till first ret
                        int tailStart = macrosStart + macrosDefine.length();
                        if (!macros.getParams().isEmpty()) tailStart = input.indexOf(")", tailStart) + 1;
                        String firstLine = input.substring(tailStart, firstRetIndex).trim().replace("\\", "");
                        if (firstLine.isEmpty()) linesNumber++;

                        int lastLineIndex = macrosStart;
                        for (int i = 0; i < linesNumber; i++) {
                            lastLineIndex = input.indexOf("\n", lastLineIndex + 1);
                        }
                        input = input.substring(0, macrosStart) + input.substring(lastLineIndex + 1);
                    } else {
                        input = input.replace("#define " + macros.getName(), "//define " + macros.getName());
                    }
                }
            }
        }
        boolean changed;
//        do {
        changed = false;
        ru.andremoniy.objctojavacnv.tokenize.StringTokenizer st = new ru.andremoniy.objctojavacnv.tokenize.StringTokenizer(input);
        StringToken token;
        StringBuilder newInput = new StringBuilder();
        tokens_loop:
        while ((token = st.nextToken()) != null) {
            if (!token.isDelimeter) {
                List<Macros> macrosList = ctx.macrosMap.get(token.value);
                if (macrosList != null) {
                    for (int i1 = macrosList.size() - 1; i1 >= 0; i1--) {
                        Macros macros = macrosList.get(i1);
                        if (macros.getParams().isEmpty()) {
                            if (!(macrosList.size() > 1 && macros.getReplace().trim().isEmpty())) {
                                String replace = macros.getReplace();
                                boolean do_rereplace;
                                Set<String> processedMacroses = new HashSet<>();
                                processedMacroses.add(macros.getName());
                                do_rereplace:
                                do {
                                    do_rereplace = false;
                                    List<Macros> rereplaceMacrosList = ctx.macrosMap.get(replace);
                                    if (rereplaceMacrosList != null && rereplaceMacrosList.size() > 0) {
                                        for (Macros rereplaceMacros : rereplaceMacrosList) {
                                            if (rereplaceMacros.getParams().isEmpty()) {
                                                if (processedMacroses.contains(rereplaceMacros.getName()))
                                                    break do_rereplace;
                                                processedMacroses.add(rereplaceMacros.getName());
                                                replace = rereplaceMacros.getReplace();
                                                if (replace.equals(rereplaceMacros.getName())) break do_rereplace;
                                                do_rereplace = true;
                                                break;
                                            }
                                        }
                                    }
                                } while (do_rereplace);
                                newInput.append(replace);
                                changed = true;
                                continue tokens_loop;
                            }
                        }
                        {
                            StringToken prevToken = token;
                            token = st.nextToken();
                            if (token.toString().equals("(")) {
                                String replacement = macros.getReplace();
                                List<String> params = macros.getParams();
                                for (int i = 0, paramsSize = params.size(); i < paramsSize; i++) {
                                    String param = params.get(i);
                                    StringToken paramToken;
                                    // считываем все до ближайшего НЕ пробела
                                    while ((paramToken = st.nextToken()).value.matches("\\s")) {
                                    }

                                    // чтобы получить реальный токен для замены
                                    // нужно считать все до следующей запятой или скобки (если это последний параметр)
                                    // т.к. это может быть все что угодно (вызов функции, строка, выражение и прочее)
                                    //List<StringToken> paramTokenList = new ArrayList<>();
                                    // добавляем туда то, что только что получили
                                    StringBuilder paramString = new StringBuilder();
                                    paramString.append(paramToken.value);

                                    // счетчик открытых скобок
                                    int bracketsCounter = 0;
                                    if (paramToken.value.equals("(")) bracketsCounter++;

                                    do {
                                        paramToken = st.nextToken();
                                        if (paramToken == null) return input;
                                        // все скобки закрыты?
                                        if (bracketsCounter == 0) {
                                            // не последний параметр? значит ожидаем запятую
                                            if (i < paramsSize - 1 && paramToken.value.equals(",")) break;
                                            // последний параметр? значит ожидаем закрывающую скобку
                                            if (i == paramsSize - 1 && paramToken.value.equals(")")) break;
                                        }

                                        if (paramToken.value.equals("(")) bracketsCounter++;
                                        if (paramToken.value.equals(")")) bracketsCounter--;

                                        paramString.append(paramToken.value);
                                    } while (true);

                                    String trimmedParamString = paramString.toString().trim();
                                    if (trimmedParamString.equals(param)) continue;
                                    if (param.equals("...")) {
                                        // do nothing, replacing all in brackets...
                                    } else {
                                        String paramRegexp = "[^A-Za-z_]+(" + param + ")[^A-Za-z\\d_]+";
                                        Pattern paramPattern = Pattern.compile(paramRegexp);
                                        Matcher paramMatcher = paramPattern.matcher(replacement);
                                        List<Integer> paramIndexes = new ArrayList<>();
                                        while (paramMatcher.find()) {
                                            int paramIndex = replacement.indexOf(param, paramMatcher.start());
                                            if (paramIndex >= 0) {
                                                paramIndexes.add(paramIndex);
                                            }
                                        }
                                        int shift = 0;
                                        for (Integer paramIndex : paramIndexes) {
                                            replacement = replacement.substring(0, paramIndex + shift) + trimmedParamString + replacement.substring(paramIndex + shift + param.length());
                                            shift += trimmedParamString.length() - param.length();
                                        }
                                    }
                                }
                                newInput.append(replacement);
                                changed = true;
                                continue tokens_loop;
                            } else {
                                newInput.append(prevToken.value);
                            }
                        }
                    }
                }
            }
            newInput.append(token.value);
        }
        input = newInput.toString();
//        } while (changed);

//        Map<String, Macros> macrosList = ctx.macrosMap;
//        for (Macros macros : macrosList.values()) {
//            if (macros.getFileName().equals(fileName)) {
//                // вычищаем объявление макроса из кода
//                input = input.replaceAll("\\#define\\s+" + macros.getName(), "//define");
//                if (macros.getReplace().contains("\n")) {
//                    input = input.replace(macros.getReplace().replace("//#%#%", "\\"), "//define\n");
//                }
//            }
//            if (macros.getParams().isEmpty()) {
///*
//                Pattern splitPattern = Pattern.compile("[^A-Za-z\\d_](" + macros.getName() + ")[^A-Za-z\\d_]");
//                Matcher splitMatcher = splitPattern.matcher(input);
//                String newInput = "";
//                int lastSIndex = 0;
//                while (splitMatcher.find()) {
//                    newInput += input.substring(lastSIndex, splitMatcher.start() + 1);
//                    newInput += macros.getReplace();
//                    lastSIndex = splitMatcher.end() - 1;
//                }
//                if (lastSIndex > 0) {
//                    newInput += input.substring(lastSIndex);
//                    input = newInput;
//                }
//*/
//            } else {
//                if (macros.getPattern() == null) {
//                    String regexp = macros.getName() + "\\(";
//                    if (macros.getParams().size() == 1 && (macros.getReplace().equals(macros.getParams().get(0)) || macros.getReplace().trim().isEmpty())) {
//                        regexp += "((.|\\r|\\n)*)";
//                        macros.setSimpleReplace(true);
//                    } else {
//                        boolean f = true;
//                        for (int i = 0; i < macros.getParams().size(); i++) {
//                            if (!f) {
//                                regexp += ",";
//                            } else {
//                                f = false;
//                            }
//                            regexp += "\\s*([A-Za-z_][A-Za-z_\\d]*)(\\s*\\*)?\\s*";
//                        }
//                    }
//                    regexp += "\\)";
//                    macros.setPattern(Pattern.compile(regexp));
//                }
//
//                // т.к. input может быть довольно большим,
//                // то проявляется известный Java bug, связанный с рекурсивной реализацией паттернов типа (x|y)*
//                // поэтому бьем input на части:
//                Pattern splitPattern = Pattern.compile("[^A..Za..z\\d_]" + macros.getName() + "\\(");
//                Matcher splitMatcher = splitPattern.matcher(input);
//                String newInput = "";
//                int lastSIndex = 0;
//                while (splitMatcher.find()) {
//                    String inputPart = input.substring(lastSIndex, splitMatcher.start());
//                    lastSIndex = splitMatcher.start();
//                    newInput += processInputPart(macros, inputPart);
//                }
//                newInput += processInputPart(macros, input.substring(lastSIndex, input.length()));
//                input = newInput;
//            }
//        }

        return input;
    }

    private static String processInputPart(Macros macros, String inputPart) {
        if (macros.isSimpleReplace()) {
            if (!inputPart.substring(1).startsWith(macros.getName())) return inputPart;
            // начинаем сканировать строку вправа и считать кол-во скобок
            // как только их кол-во уравновешивается - останавливаемся
            int breaks = 1;
            StringBuffer newInputPart = new StringBuffer(inputPart.substring(0, 1));
            int i = 1 + macros.getName().length() + 1;
            for (; i < inputPart.length(); i++) {
                if (inputPart.charAt(i) == ')') breaks--;
                if (inputPart.charAt(i) == '(') breaks++;
                if (breaks == 0) break;
                newInputPart.append(inputPart.charAt(i));
            }
            inputPart = newInputPart.toString() + inputPart.substring(i + 1);
        } else {
            Matcher m = macros.getPattern().matcher(inputPart);
            while (m.find()) {
                String replacement = macros.getReplace();
                List<String> params = macros.getParams();
                for (int i = 0, paramsSize = params.size(); i < paramsSize; i++) {
                    String param = params.get(i);
                    // skip if param name equals used in code param name
                    if (m.group(i * 2 + 1).equals(param)) continue;
                    String paramRegexp = "[^A-Za-z_]+(" + param + ")[^A-Za-z\\d_]+";
                    Pattern paramPattern = Pattern.compile(paramRegexp);
                    Matcher paramMatcher = paramPattern.matcher(replacement);
                    while (paramMatcher.find()) {
                        int paramIndex = replacement.indexOf(param, paramMatcher.start());
                        replacement = replacement.substring(0, paramIndex) + m.group(i * 2 + 1) + (m.group(i * 2 + 2) != null ? m.group(i * 2 + 2) : "") + replacement.substring(paramIndex + param.length());
                    }
                }
                inputPart = inputPart.substring(0, m.start()) + replacement + inputPart.substring(m.end());
                // запускаем поиск заново, т.к. текст изменился
                m = macros.getPattern().matcher(inputPart);
            }
        }
        return inputPart;
    }
}
