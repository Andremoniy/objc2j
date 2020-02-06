package ru.andremoniy.objctojavacnv;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.andremoniy.objctojavacnv.antlr.output.ObjcmLexer;
import ru.andremoniy.objctojavacnv.antlr.output.ObjcmParser;
import ru.andremoniy.objctojavacnv.builder.ClassBuilder;
import ru.andremoniy.objctojavacnv.context.BlockContext;
import ru.andremoniy.objctojavacnv.context.ClassContext;
import ru.andremoniy.objctojavacnv.context.ExpressionContext;
import ru.andremoniy.objctojavacnv.context.ProjectContext;
import ru.andremoniy.objctojavacnv.processors.m.StructInit;
import ru.andremoniy.objctojavacnv.processors.m.TryCatch;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static ru.andremoniy.objctojavacnv.Utils.transformObject;
import static ru.andremoniy.objctojavacnv.Utils.transformType;

/**
 * User: Andremoniy
 * Date: 12.06.12
 * Time: 1:14
 */

public class ConverterM {

    public static final Logger log = LoggerFactory.getLogger(ConverterM.class);

    private static final List<String> RESTRICTED_METHODS = Collections.EMPTY_LIST;
    private static final Map<Integer, String> OPS_NUMBER = new HashMap<Integer, String>() {{
        put(ObjcmLexer.L_MINUS, "minus");
        put(ObjcmLexer.L_PLUS, "plus");
        put(ObjcmLexer.L_DIV, "divide");
        put(ObjcmLexer.ASTERISK, "multiple");
        put(ObjcmLexer.L_PERC, "percent");
        put(ObjcmLexer.L_MORE, "more");
        put(ObjcmLexer.L_MORE_EQ, "moreEquals");
        put(ObjcmLexer.L_LESS, "less");
        put(ObjcmLexer.L_LESS_EQ, "lessEquals");
        put(ObjcmLexer.L_EQ_EQ, "equals");
        put(ObjcmLexer.L_NEQ, "notEquals");
        put(ObjcmLexer.L_EQ, "set");
        put(ObjcmLexer.L_PLUS_EQ, "setPlus");
        put(ObjcmLexer.L_MINUS_EQ, "setMinus");
        put(ObjcmLexer.L_DIV_EQ, "setDivide");
        put(ObjcmLexer.L_MULT_EQ, "setMultiple");
        put(ObjcmLexer.L_AND, "and");
        put(ObjcmLexer.L_AND_AND, "andAnd");
        put(ObjcmLexer.L_OR, "or");
        put(ObjcmLexer.L_OR_OR, "orOr");
        put(ObjcmLexer.L_AND_EQ, "setAnd");
        put(ObjcmLexer.L_OR_EQ, "setOr");
        put(ObjcmLexer.L_XOR, "xor");
        put(ObjcmLexer.L_XOR_EQ, "setXor");
        put(ObjcmLexer.L_RIGHT, "shiftRight");
        put(ObjcmLexer.L_LEFT, "shiftLeft");
    }};


    private static final Map<String, String> primitives = new HashMap<String, String>() {{
        put("Double", "double");
        put("Integer", "int");
        put("Long", "long");
    }};

    private static final List<List<Integer>> OPERATIONS_ORDER = new ArrayList<List<Integer>>() {{
        add(new ArrayList<Integer>());
        add(Arrays.asList(ObjcmLexer.L_OR_OR));
        add(Arrays.asList(ObjcmLexer.L_AND_AND));
        add(Arrays.asList(ObjcmLexer.L_OR));
        add(Arrays.asList(ObjcmLexer.L_XOR));
        add(Arrays.asList(ObjcmLexer.L_AND));
        add(Arrays.asList(ObjcmLexer.L_EQ_EQ, ObjcmLexer.L_NEQ));
        add(Arrays.asList(ObjcmLexer.L_LESS, ObjcmLexer.L_MORE, ObjcmLexer.L_LESS_EQ, ObjcmLexer.L_MORE_EQ));
        add(Arrays.asList(ObjcmLexer.L_LEFT, ObjcmLexer.L_RIGHT));
        add(Arrays.asList(ObjcmLexer.L_PLUS, ObjcmLexer.L_MINUS));
        add(Arrays.asList(ObjcmLexer.ASTERISK, ObjcmLexer.L_DIV, ObjcmLexer.L_PERC));
    }};
    private static final List<Integer> EXPR_ORDER = Arrays.asList(
            ObjcmLexer.EXPR_OR_OR, ObjcmLexer.EXPR_AND_AND, ObjcmLexer.EXPR_OR, ObjcmLexer.EXPR_XOR, ObjcmLexer.EXPR_AND, ObjcmLexer.EXPR_EQ,
            ObjcmLexer.EXPR_COND, ObjcmLexer.EXPR_MOV, ObjcmLexer.EXPR_ADD, ObjcmLexer.EXPR_MULT, ObjcmLexer.EXPR_UNNAME);

    private ConverterM() {
    }

    public static StringBuilder convert_m(String fileName, ProjectContext projectCtx, StringBuilder addSb) throws IOException, RecognitionException {
        projectCtx.m_counter++;
        log.info(projectCtx.m_counter + " m files processed");

        File pmfile = new File(fileName + "p");
        File mfile = pmfile.exists() ? pmfile : new File(fileName);

        final boolean categoryClass = mfile.getName().contains("+");
        final String categoryName = categoryClass ? mfile.getName().substring(mfile.getName().indexOf("+") + 1, mfile.getName().lastIndexOf(".")) : null;

        // new file with java code
        String javaClassName = mfile.getName().substring(0, mfile.getName().lastIndexOf(".")).replace("-", "_");
        File mjfile = new File(mfile.getParent() + File.separator + javaClassName + ".java");
        mjfile.createNewFile();

        String packageName = mfile.getParent().substring(mfile.getParent().lastIndexOf("src") + 4).replace(File.separator, ".");

        String input = FileUtils.readFileToString(mfile, ConverterProperties.PROPERTIES.getProperty(ConverterProperties.ENCODING));
        input = input.replace("///", "//");

        log.info("Preprocessing... ");
        input = Preprocessor.replace(input, projectCtx, fileName);
        log.info("ok");

        CharStream cs = new ANTLRStringStream(input);
        ObjcmLexer lexer = new ObjcmLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        ObjcmParser parser = new ObjcmParser(tokens);

        ObjcmParser.code_return result = parser.code();

        ClassBuilder cb = new ClassBuilder();

        if (!categoryClass) {
            cb.setPackage(packageName);

            // process imports sections
            cb.addImport("ru.andremoniy.jcocoa.*");
            cb.addImport("java.util.List");
            cb.addImport("java.util.Arrays");
            cb.addImport("java.util.ArrayList");
            cb.addImportStatic("ru.andremoniy.jcocoa.MathEx.*");
            cb.addImportStatic("ru.andremoniy.jcocoa.Utils.*");
            cb.addImportStatic("ru.andremoniy.jcocoa.NSException.*");
            cb.addImportStatic("ru.andremoniy.jcocoa.Constants.*");
        }

        if (addSb == null) addSb = new StringBuilder();

        StringBuilder catSb = new StringBuilder();

        if (!categoryClass) {
            // going through all categories looking for imports
            Set<String> categoriesList = projectCtx.categories.get(mfile.getName().substring(0, mfile.getName().indexOf(".")));
            if (categoriesList != null) {
                for (String category : categoriesList) {
                    if (category.endsWith(".h")) {
                        category = category.substring(0, category.lastIndexOf(".")) + ".m";
                    }
                    catSb.append(convert_m(category, projectCtx, addSb));
                }
            }
        }

        if (!categoryClass && projectCtx.classCtx != null) {
            if (projectCtx.classCtx.localCategories.isEmpty()) {
                projectCtx.classCtx.categoryList = "null";
            } else {
                projectCtx.classCtx.categoryList = "";
                for (String category : projectCtx.classCtx.localCategories) {
                    if (!projectCtx.classCtx.categoryList.isEmpty()) projectCtx.classCtx.categoryList += ",";
                    projectCtx.classCtx.categoryList += "\"" + category + "\"";
                }
                projectCtx.classCtx.categoryList = "Arrays.asList(" + projectCtx.classCtx.categoryList + ")";
            }
        }

        CommonTree tree = (CommonTree) result.getTree();

        if (tree == null) return new StringBuilder();

        CommonTree mainImpl = null;
        StringBuilder innerClasses = new StringBuilder();

        if (tree.getType() == ObjcmLexer.IMPLEMENTATION) {
            mainImpl = tree;
        } else {
            for (Object child : tree.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                if (childTree.getType() == ObjcmLexer.IMPLEMENTATION) {
                    String className = childTree.getFirstChildWithType(ObjcmLexer.NAME).getChild(0).toString();
                        if (className.equals(javaClassName)) {
                        mainImpl = childTree;
                    } else {
                        projectCtx.newClass(className, categoryName);
                        projectCtx.classCtx.packageName = packageName;
                        process_implementation(projectCtx, false, className, childTree, innerClasses, true, false);
                    }
                }
            }
        }

        StringBuilder sb2 = new StringBuilder();

        projectCtx.newClass(javaClassName, categoryName);
        projectCtx.classCtx.packageName = packageName;

        Utils.addOriginalImports(input, projectCtx);
        Utils.addStaticFromHeaderImports(projectCtx, javaClassName);

        if (mainImpl == null) {
            if (!categoryClass) {
                sb2.append("public class ").append(javaClassName);
                // not all .m files have .h header  TODO: really ???
                if (projectCtx.imports.get("I" + javaClassName) != null) {
                    sb2.append(" extends I").append(javaClassName);
                }
                sb2.append(" {\n");
            }
            m_process_implementation2(sb2, tree, projectCtx);
        } else {
            process_implementation(projectCtx, categoryClass, javaClassName, mainImpl, sb2, false, true);
        }
        process_common_children(projectCtx, tree, sb2);

        sb2.append(innerClasses);

        if (categoryClass) return sb2;

        // already here, then not a categoryClass
        Utils.addAdditionalImports(projectCtx);

        // add imports:
        for (String _import : projectCtx.classCtx.imports)
            cb.addImport(_import);

        if (!projectCtx.classCtx.containsInit)
            addInitMethod(sb2, javaClassName);

        if (!projectCtx.classCtx.containsAutoRelease)
            addAutoReleaseMethod(sb2, javaClassName);

        if (!projectCtx.classCtx.containsRelease)
            addReleaseMethod(sb2, javaClassName);

        sb2.append(catSb);

        // add _static object variable
//        addStaticVariable(sb2, javaClassName);

        sb2.append("}\n"); // end of class

        cb.a(sb2); // merge header with class

        String javaCode = cb.sb().toString();
        javaCode = javaCode.replaceAll(";(\\s|\n|\r)*;+", ";");

        // remove constructions like "this = null"
        javaCode = javaCode.replaceAll("this\\s*=\\s*null", "");
        // remove constructions like "this = ..."
        javaCode = javaCode.replaceAll("this\\s*=\\s*", "");

        FileUtils.writeStringToFile(mjfile, javaCode, ConverterProperties.PROPERTIES.getProperty(ConverterProperties.ENCODING));
        return cb.sb();
    }

/*    private static void addStaticVariable(StringBuilder sb2, String javaClassName) {
        sb2.append("\t").append("public static final ").append(javaClassName).append(" _static = new ").append(javaClassName).append("();\n");
    }*/

    private static void process_implementation(ProjectContext projectCtx, boolean categoryClass, String javaClassName, CommonTree implementationTree, StringBuilder sb, boolean doFinish, boolean forceClassDeclaration) {
        if (!categoryClass) {
            m_process_implementation1(sb, implementationTree, javaClassName, doFinish, projectCtx, forceClassDeclaration);
        }

        m_process_implementation2(sb, implementationTree, projectCtx);

        if (doFinish) {
            sb.append("}\n"); // end of class
        }
    }

    private static void process_common_children(ProjectContext projectCtx, CommonTree implementationTree, StringBuilder sb) {
        for (Object child : implementationTree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.OPERATOR:
                    m_process_operator(sb, childTree, projectCtx.classCtx);
                    break;
                case ObjcmLexer.FIELD:
                    m_process_field(sb, childTree, projectCtx.classCtx);
                    break;
                case ObjcmLexer.INTERFACE:
                    m_process_interface(sb, childTree, projectCtx);
                    break;
                case ObjcmLexer.M_TYPE_START:
                    m_process_type_start(sb, childTree, projectCtx.classCtx);
                    break;
            }
        }
    }

    private static void m_process_interface(StringBuilder sb, CommonTree tree, ProjectContext projectCtx) {
        CommonTree nameTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.NAME);
        String interfaceName = Utils.getText(nameTree).trim();
        boolean sameInterface = interfaceName.equals(projectCtx.classCtx.className);
        if (!sameInterface) {
            sb.append("public static interface ").append(interfaceName).append(" {\n");
        }
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                // This is static method of field
                case ObjcmLexer.METHOD:
                    if (sameInterface) break;
                    m_process_method(sb, childTree, projectCtx.newClass(interfaceName, null), false, false);
                    break;
            }
        }
        if (!sameInterface) {
            sb.append("}\n");
        }
    }

    private static void m_process_operator(StringBuilder sb, CommonTree tree, ClassContext classCtx) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                // This is static method of field
                case ObjcmLexer.M_TYPE_START:
                    m_process_type_start(sb, childTree, classCtx);
                    break;
                case ObjcmLexer.INTERFACE:
                    m_process_interface(sb, childTree, classCtx.projectCtx);
                    break;
                case ObjcmLexer.EXTERN:
                    // do nothing
                    break;
                case ObjcmLexer.STATIC:
                    m_process_static(sb, childTree, classCtx);
                    break;
                case ObjcmLexer.TYPEDEF_STRUCT:
                    m_process_typedef_struct(sb, childTree, classCtx);
                    break;
                default:
                    if (childTree.getChildCount() == 0) {
                        sb.append(childTree.getText());
                    }
                    break;
            }
        }
    }

    private static void m_process_type_start(StringBuilder sb, CommonTree tree, ClassContext classCtx) {
        StringBuilder lsb = new StringBuilder();
        boolean isStatic = false;
        String name = "";
        boolean isStaticMethod = tree.getFirstChildWithType(ObjcmLexer.STATIC_METHOD) != null;
        boolean isMainMethod = isStaticMethod && tree.getFirstChildWithType(ObjcmLexer.NAME).getChild(0).toString().trim().equals("main");

        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                // This is static method of field
                case ObjcmLexer.TYPE:
                    if (isMainMethod) lsb.append("void ");
                    else lsb.append(readChildren(childTree, null, null)); // there is no method, then null
                    break;
                case ObjcmLexer.NAME:
                    lsb.append(readChildren(childTree, null, null)); // there is no method, then null
                    break;
                case ObjcmLexer.FIELD:
                    classCtx.projectCtx.staticFields.put(name, classCtx.className);
                    CommonTree valueTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.VALUE);
                    if (valueTree != null) {
                        lsb.append("=");
                        lsb.append(m_process_field_value(valueTree, classCtx));
                    }
                    break;
                case ObjcmLexer.STATIC_METHOD:
                    m_process_method(lsb, childTree, classCtx, true, true);
                    break;
                case ObjcmLexer.EXTERN:
                    break;
                default:
                    if (child.toString().equals("static")) isStatic = true;
                    lsb.append(Utils.getText(childTree));
                    lsb.append(" ");
                    break;
            }
        }

        if (!isStatic && !lsb.toString().trim().isEmpty()) {
            sb.append("public static ");
        }

        sb.append(lsb);
        sb.append(";");
    }

    private static void m_process_static(StringBuilder sb2, CommonTree tree, ClassContext classCtx) {
        boolean isField = false;
        String methodName = "";
        String fieldName = "";
        String methodType = "";
        boolean isStatic = false;
        StringBuilder sb = new StringBuilder();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.TYPE:
                    sb.append(" public ");
                    if (isStatic) sb.append("static ");
                    methodType = process_method_type(classCtx, childTree);
                    sb.append(methodType).append(" ");
                    break;
                case ObjcmLexer.NAME:
                    String trimmedName = readChildren(childTree, classCtx, null).trim();
                    sb.append(trimmedName).append(" ");
                    if (tree.getFirstChildWithType(ObjcmLexer.METHOD) != null) {
                        methodName = trimmedName;
                    } else {
                        fieldName = trimmedName;
                    }
                    break;
                case ObjcmLexer.FIELD:
                    isField = true;
                    CommonTree value = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.VALUE);
                    if (value != null) {
                        sb.append("=");
                        sb.append(m_process_field_value(value, classCtx));
                    }
                    classCtx.projectCtx.staticFields.put(fieldName, classCtx.className);

                    break;
                case ObjcmLexer.PARAM:
                    process_param(sb, childTree, classCtx);
                    isField = false;
                    break;
                // This is static method of field
                case ObjcmLexer.METHOD:
                    m_process_params(sb, childTree, classCtx);
                    CommonTree blockTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.BLOCK);
                    if (blockTree != null) {
                        m_process_block(sb, blockTree, classCtx.newMethod(methodName, methodType, isStatic, null).newBlock());
                    } else {
                        if (!isField) return;
                    }
                    break;
                case ObjcmLexer.BLOCK:
                    m_process_block(sb, childTree, classCtx.newMethod(methodName, methodType, isStatic, null).newBlock());
                    break;
                case ObjcmLexer.EXTERN:
                    break;
                default:
                    String text = Utils.getText(childTree).trim();
                    if (text.equals("inline") || text.equals("struct")) {
                        continue;
                    }
                    if (text.equals("static")) {
                        isStatic = true;
                        continue;
                    }
                    sb.append(transformObject(text, classCtx, null));
                    sb.append(" ");
                    break;
            }
        }
        sb.append(";\n\n");
        sb2.append(sb);
    }

    private static String process_method_type(ClassContext classCtx, CommonTree tree) {
        String methodType = "";
        int asteriskCount = 0;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            String text = childTree.getText();
            if (text.equals("*")) {
                asteriskCount++;
                continue;
            }
            if (text.equals("(") || text.equals(")")) continue;
            if (text.equals("const") || text.equals("struct")) continue;
            methodType += text;
        }
        methodType = Utils.transformType(methodType, classCtx);
        if (asteriskCount == 1) {
            methodType += "[]";
        }
        return methodType;
    }

    private static void process_param(StringBuilder sb, CommonTree tree, ClassContext classCtx) {
        String typeName = "";
        String paramName = "";
        String paramAdd = "";
        boolean wasUnsigned = false;
        boolean isPointer = false;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmParser.TYPE:
                    String typeTrimmedText = ((CommonTree) child).getChild(0).getText().trim();
                    if (typeTrimmedText.contains("*")) isPointer = true;
                    typeName = Utils.transformType(typeTrimmedText, classCtx);
                    break;
                case ObjcmParser.NAME:
                    String nameTrimmedText = ((CommonTree) child).getChild(0).getText().trim();
                    if (nameTrimmedText.contains("*")) isPointer = true;
                    paramName = Utils.transformObject(nameTrimmedText, classCtx, null);
                    break;
                case ObjcmParser.INDEX:
                    paramAdd = process_index_simple(new StringBuilder(), childTree);
                    break;
                default:
                    String text = ((CommonTree) child).getText().trim();
                    if (text.equals("*")) {
                        isPointer = true;
                        continue;
                    }
                    if (text.equals("struct")) continue;
                    if (text.equals("unsigned")) {
                        wasUnsigned = true;
                    } else {
                        paramAdd += text;
                    }
                    break;
            }
        }

        if (paramName.isEmpty() && wasUnsigned) {
            paramName = Utils.transformObject(typeName, classCtx, null);
            typeName = Utils.transformType("unsigned", classCtx);
        }

        sb.append(typeName).append(" ").append(paramName).append(isPointer ? "[]" : "").append(paramAdd);

        classCtx.variables.put(paramName, typeName);
    }

    private static void m_process_params(StringBuilder sb, CommonTree tree, ClassContext classCtx) {
        StringBuilder lsb = new StringBuilder();
        lsb.append("(");
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.PARAM:
                    String type = Utils.getText((CommonTree) childTree.getFirstChildWithType(ObjcmLexer.TYPE)).trim();
                    String name = Utils.getText((CommonTree) childTree.getFirstChildWithType(ObjcmLexer.NAME)).trim();
                    int asteriskCount = 0;
                    char[] typeChars = type.toCharArray();
                    for (char typeChar : typeChars)
                        if (typeChar == '*') asteriskCount++;

                    if (lsb.length() > 1) lsb.append(", ");
                    lsb.append(transformType(type, classCtx)).append(" ").append(name);
                    for (int i = 0; i < asteriskCount; i++)
                        lsb.append("[]");

                    break;
            }
        }
        lsb.append(")");

        sb.append(lsb);
    }

    public static String readChildren(CommonTree tree, ClassContext classCtx, ExpressionContext exprCtx) {
        StringBuilder sb = new StringBuilder();
        if (tree.getChildren() == null) {
            String trObj = classCtx != null && exprCtx != null ? transformObject(tree.toString(), classCtx, exprCtx) : tree.toString();
            sb.append(trObj);
            if (!trObj.equals("this")) {
                sb.append(" ");
            }
            return sb.toString();
        }
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            sb.append(readChildren(childTree, classCtx, exprCtx));
        }
        return sb.toString();
    }

    private static void m_process_implementation1(StringBuilder sb, CommonTree tree, String _className, boolean isInner, ProjectContext projectCtx, boolean forceClassDeclaration) {
        String className = tree.getFirstChildWithType(ObjcmLexer.NAME).getChild(0).toString();

        if (className.equals(_className) || forceClassDeclaration) {
            sb.append("public ").append(isInner ? "static " : "").append("class ").append(_className);
            // not all .m files have .h header
            if (projectCtx.imports.get("I" + className) != null) {
                sb.append(" extends I").append(className);
            }

            sb.append(" {\n");
        }
    }

    private static void addAutoReleaseMethod(StringBuilder sb, String className) {
        sb.append("\n");
        sb.append("\tpublic ").append(className).append(" autorelease() {\n");
        sb.append("\t\treturn this; // TODO \n");
        sb.append("\t}\n\n");
    }

    private static void addReleaseMethod(StringBuilder sb, String className) {
        sb.append("\n");
        sb.append("\tpublic ").append(className).append(" release() {\n");
        sb.append("\t\treturn this; // TODO \n");
        sb.append("\t}\n\n");
    }

    private static void addInitMethod(StringBuilder sb, String className) {
        sb.append("\n");
        sb.append("\tpublic ").append(className).append(" init() {\n");
        sb.append("\t\treturn this;\n");
        sb.append("\t}\n\n");
    }

    private static void m_process_implementation2(StringBuilder sb, CommonTree tree, ProjectContext projectCtx) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.FIELD:
                    m_process_field2(sb, childTree, projectCtx.classCtx);
                    break;
                case ObjcmLexer.METHOD:
                    m_process_method(sb, childTree, projectCtx.classCtx, false, false);
                    break;
                case ObjcmLexer.STATIC_METHOD:
                    m_process_method(sb, childTree, projectCtx.classCtx, true, false);
                    break;
                case ObjcmLexer.STATIC:
                    m_process_static(sb, childTree, projectCtx.classCtx);
                    break;
                case ObjcmLexer.TYPEDEF_STRUCT:
                    m_process_typedef_struct(sb, childTree, projectCtx.classCtx);
                    break;
            }
        }
    }

    private static void m_process_typedef_struct(StringBuilder sb, CommonTree tree, ClassContext classCtx) {
        CommonTree nameTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.NAME);
        String name = nameTree.getChild(0).toString();

        sb.append("public static class ").append(name).append(" {\n");

        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;

            switch (childTree.getType()) {
                case ObjcmLexer.STRUCT_FIELD:

                    CommonTree typeTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.TYPE);
                    String type = readChildren(typeTree, classCtx, null).trim();

                    CommonTree fieldNameTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.NAME);
                    String fieldName = readChildren(fieldNameTree, classCtx, null).trim();

                    sb.append("public ").append(transformType(type, classCtx)).append(" ").append(fieldName).append(";\n");
                    break;
            }
        }

        sb.append("}\n\n");
    }

    private static void m_process_method(StringBuilder sb, CommonTree tree, ClassContext classCtx, boolean staticFlag, boolean skipHeader) {
        String modifier = "";
        String type = "";
        String methodName = "";
        LinkedHashMap<String, String> params = new LinkedHashMap<>();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.MODIFIER:
                    modifier = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.TYPE:
                    type = readType(classCtx, childTree);
                    break;
                case ObjcmLexer.NAME:
                    methodName = childTree.getChild(0).getText().trim();
                    break;
                case ObjcmLexer.PARAM:
                    methodName += m_process_param(params, childTree, classCtx);
                    break;
            }
        }

        String methodType = transformType(type, classCtx);
        classCtx.newMethod(methodName, methodType, staticFlag, params);
        for (String paramName : params.keySet()) {
            classCtx.methodCtx.variables.put(paramName, params.get(paramName));
        }

        if (methodName.equals("init") && params.isEmpty()) classCtx.containsInit = true;
        if (methodName.toLowerCase().equals("autorelease") && params.isEmpty()) classCtx.containsAutoRelease = true;
        if (methodName.toLowerCase().equals("release") && params.isEmpty()) classCtx.containsRelease = true;

        boolean isMainMethod = staticFlag && sb.toString().trim().equals("void main");

        String modifier_sb = modifier.length() > 0 ? (modifier.equals("-") ? "" : "static") : "";
        if (staticFlag) modifier_sb = "static";

        if (!skipHeader) {
            // защита от неправильной перегрузки метода init():
            if (methodName.equals("init") && classCtx.containsInit) {
                methodType = classCtx.className; // всегда имя класса в качестве типа возвращаемого значения...
            }
            classCtx.methodCtx.methodType = methodType;

            sb.append("public ").append(modifier_sb).append(" ").append(methodType).append(" ").append(classCtx.categoryName != null ? "_" + classCtx.categoryName + "_" : "").append(methodName);

            // обратный переход, т.к. static мог бысть установлен не только из static_flag
            if (modifier_sb.equals("static"))
                classCtx.methodCtx.staticFlag = true;
        }
        sb.append("(");
        if (!isMainMethod) {
            boolean f = true;
            for (String pName : params.keySet()) {
                if (!f) {
                    sb.append(", ");
                } else {
                    f = false;
                }
                String paramType = params.get(pName);
                if (paramType.equals("void")) paramType = "Void";
                sb.append(paramType).append(" ").append(pName);
            }
/*
            if (classCtx.methodCtx.staticFlag) {
                sb.append(", Class<? extends ").append(classCtx.className).append("> _invocator");
            }
*/
        } else {
            sb.append("String[] args");
            classCtx.methodCtx.methodType = "";
        }
        sb.append(") ");
        CommonTree blockTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.BLOCK);
        if (blockTree != null) {
            // есть ситуации, когда метод заканчивается оператором SWITCH, в котором не прописана конструкция default
            // в этом случае необходимо это отследить и добавить в конце "return null;"
            classCtx.methodCtx.addReturnNull = !modifier_sb.equals("void");
            m_process_block(sb, blockTree, classCtx.methodCtx.newBlock());
        } else {
            sb.append("{};\n");
        }
        sb.append("\n\n");
    }

    private static String readType(ClassContext classCtx, CommonTree childTree) {
        String type;
        type = readChildren(childTree, classCtx, null).trim();
        if (type.startsWith("(")) type = type.substring(1).trim();
        if (type.endsWith(")")) type = type.substring(0, type.length() - 1).trim();
        return type;
    }

    public static void m_process_block(StringBuilder sb, CommonTree tree, BlockContext blockCtx) {
        List children = tree.getChildren();
        boolean wasReturn = false;
        boolean fieldAccess = false;

        Integer lastComplexTreeIndex = null;
        if (blockCtx.methodCtx().addReturnNull) {
            for (int i = tree.getChildCount() - 1; i >= 0; i--) {
                if (tree.getChild(i).getChildCount() > 0) {
                    lastComplexTreeIndex = i;
                    break;
                }
            }
            blockCtx.methodCtx().addReturnNull = false; // отключаем
        }

        for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
            Object child = children.get(i);
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                /*********************************/
                /** new block with expressions **/
                /*******************************/
                case ObjcmLexer.GOTO:
                    process_goto(sb, childTree, blockCtx.newExpr());
                    break;
                case ObjcmLexer.VARIABLE_INIT:
                    process_variable_init(sb, childTree, blockCtx.newExpr().setNeedSaveVariable());
                    break;
                case ObjcmLexer.CLASSICAL_EXPR:
                    process_classical_expr(sb, childTree, blockCtx.newExpr(), false, false);
                    break;
                case ObjcmLexer.EXPR_FULL:
                    process_expr_full(sb, childTree, blockCtx.newExpr(), true);
                    break;
                case ObjcmLexer.CLASSICAL_EXPR_2:
                    process_classical_expr(sb, childTree, blockCtx.newExpr(), true, false);
                    break;
                case ObjcmLexer.FOR_STMT:
                    process_for_stmt(sb, childTree, blockCtx.newBlock());
                    break;
                case ObjcmLexer.FOR_IN_STMT:
                case ObjcmLexer.FOR_STMT_EXPR:
                    // do nothing
                    break;
                case ObjcmLexer.STATIC_START:
                    m_process_static_start(sb, childTree, blockCtx.newBlock());
                    break;
                case ObjcmLexer.WHILE_STMT:
                    m_process_while_stmt(sb, childTree, blockCtx.newBlock());
                    break;
                case ObjcmLexer.METHOD_CALL:
                    m_process_method_call(sb, childTree, blockCtx.newExpr());
                    break;
                case ObjcmLexer.BLOCK:
                    m_process_block(sb, childTree, blockCtx.newBlock());
                    wasReturn = false;
                    break;
                case ObjcmLexer.SWITCH:
                    boolean wasDefault = m_process_switch(sb, childTree, blockCtx.newBlock());
                    if (lastComplexTreeIndex != null && lastComplexTreeIndex == i && !wasDefault) {
                        sb.append("\nreturn null;\n");
                    }
                    break;
                case ObjcmLexer.IF_STMT:
                    m_process_if_stmt(sb, childTree, blockCtx.newBlock());
                    break;
                case ObjcmLexer.BREAK:
                    blockCtx.isBreak = true;
                    if (!blockCtx.skipBreak) {
                        sb.append("break;\n");
                    }
                    break;
                case ObjcmLexer.RETURN_STMT:
                    blockCtx.isBreak = true;
                    sb.append("return ");
                    CommonTree returnStmt = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.CLASSICAL_EXPR);
                    if (returnStmt != null && !blockCtx.methodCtx().methodType.isEmpty()) {
                        sb.append("(").append(blockCtx.methodCtx().methodType).append(")(");
                        process_classical_expr(sb, returnStmt, blockCtx.newExpr(), false, false);
                        sb.append(")");
                    } else {
                        returnStmt = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.STRUCT_INIT);
                        if (returnStmt != null)
                            new StructInit(sb, returnStmt, blockCtx.newExpr()).process();
                    }
                    sb.append(";\n");
                    break;
                case ObjcmLexer.THROW_STMT:
                    String exceptionVariable = "new RuntimeException(\"empty\")";
                    CommonTree nameTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.NAME);
                    if (nameTree != null) {
                        exceptionVariable = nameTree.getChild(0).getText();
                    }
                    sb.append("throw ").append(exceptionVariable).append(";\n");
                    break;
                case ObjcmLexer.FIELD_ACCESS:
                    StringBuilder fasb = new StringBuilder();
                    m_process_block(fasb, childTree, blockCtx);
                    if (!fieldAccess) {
                        sb.append(".");
                    } else {
                        sb.append("\"");
                    }
                    sb.append(fasb);
                    if (fieldAccess) {
                        sb.append("\")");
                    }
                    fieldAccess = false;
                    break;
                case ObjcmLexer.STRUCT_VARIABLE:
                    m_process_struct_variable(sb, childTree, blockCtx);
                    break;
                case ObjcmLexer.CONST_EXPR2:
                    sb.append("final ");
                    m_process_block(sb, childTree, blockCtx);
                    break;
                case ObjcmLexer.TRY_STMT:
                    new TryCatch(sb, childTree, blockCtx).process();
                    break;
                default:
                    if (a_started_cases(sb, blockCtx.newExpr(), childTree)) continue; // TODO: newExpr ??

                    if (testBrackets(children, i, childrenSize, child)) break;
                    StringBuilder lsb = new StringBuilder();
                    if (childTree.getChildCount() == 0) {
                        lsb.append(transformObject(childTree.getText(), blockCtx.methodCtx().classCtx, blockCtx.newExpr()));
                    } else {
                        m_process_block(lsb, childTree, blockCtx);
                    }
                    if (lsb.toString().equals("case")) {
                        wasReturn = false;
                    }
                    switch (lsb.toString()) {
                        case "@try":
                            lsb = new StringBuilder("try");
                            break;
                        case "@catch":
                            lsb = new StringBuilder("catch");
                            break;
                        case "@finally":
                            lsb = new StringBuilder("finally");
                            break;
                        case "_cmd":
                            lsb = new StringBuilder("\"" + blockCtx.methodCtx().methodName + "\"");
                            break;
                    }

                    // в objective-c разрешены "break" после "return" в блоках "case"
                    // необходимо это предусмотреть
                    String prepared = lsb.toString().replaceAll(";", " ;");
                    if (wasReturn && prepared.equals("break") || prepared.startsWith("break ")) {
                        // skip
                    } else {
                        sb.append(lsb).append(" ");
                    }
                    wasReturn = prepared.equals("return") || prepared.startsWith("return ");

                    break;
            }
        }
    }

    private static void m_process_struct_variable(StringBuilder sb, CommonTree tree, BlockContext blockCtx) {
        String name = tree.getFirstChildWithType(ObjcmLexer.NAME).getChild(0).toString();
        sb.append(name).append(" ");
        for (Object obj : tree.getChildren()) {
            CommonTree child = (CommonTree) obj;
            switch (child.getType()) {
                case ObjcmLexer.EXPR_FULL:
                    process_expr_full(sb, child, blockCtx.newExpr(), false);
                    break;
                case ObjcmLexer.COMMA:
                    sb.append(", ");
                    break;
            }
        }
        if (!recursiveSearchExists(tree, ObjcmLexer.ASSIGN)) {
            sb.append(" = null;\n");
        }
    }

    private static void process_goto(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        sb.append(readChildren(tree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx));
    }

    private static void process_for_stmt(StringBuilder sb, CommonTree tree, BlockContext blockCtx) {
        CommonTree forStmtExpr = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.FOR_STMT_EXPR);

        // определим тип for-а:
        CommonTree forInTree = (CommonTree) forStmtExpr.getFirstChildWithType(ObjcmLexer.FOR_IN_STMT);
        boolean forIn = forInTree != null;

        if (forIn) {
            sb.append("for (");

            CommonTree typeTree = (CommonTree) forStmtExpr.getFirstChildWithType(ObjcmLexer.EXPR_FULL);
            StringBuilder typeSb = new StringBuilder();
            process_expr_full(typeSb, typeTree, blockCtx.newExpr(), true);
            String type = typeSb.toString().trim();
            type = type.substring(0, type.indexOf(" "));

            // for (Xxxx ...
            sb.append(typeSb).append(" ");

            // for (Xxxx yyyy ....
            CommonTree itemTree = (CommonTree) forStmtExpr.getFirstChildWithType(ObjcmLexer.CLASSICAL_EXPR_2);
            if (itemTree != null) {
                sb.append(readChildren(itemTree, blockCtx.methodCtx().classCtx, blockCtx.newExpr()));
            }

            sb.append(" : (List<").append(type).append(">)");

            m_process_block(sb, forInTree, blockCtx.newBlock());

            sb.append(") ");
        } else {
            sb.append("for (");
            for (Object child : forStmtExpr.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                switch (childTree.getType()) {
                    case ObjcmParser.EXPR_FULL:
                        process_expr_full(sb, childTree, blockCtx.newExpr(), true);
                        break;
                    case ObjcmParser.CLASSICAL_EXPR:
                        process_classical_expr(sb, childTree, blockCtx.newExpr(), false, false);
                        break;
                    default:
                        sb.append(((CommonTree) child).getText());
                        break;
                }
            }
            sb.append(") ");
            // само собой
//            m_process_block(sb, forStmtExpr, blockCtx.newBlock());
        }

        CommonTree lastChild = (CommonTree) tree.getChild(tree.getChildCount() - 1);
        if (lastChild.getChildCount() > 0) {
            m_process_block(sb, lastChild, blockCtx.newBlock());
        } else {
            sb.append(lastChild.getText());
        }
        sb.append("\n");
    }

    private static void process_variable_init(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        boolean isVariableDeclaration = tree.getFirstChildWithType(ObjcmLexer.EXPR_FULL) != null && tree.getFirstChildWithType(ObjcmLexer.CLASSICAL_EXPR_2) != null;

        String variableType = "";

        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.EXPR_FULL: {
                    StringBuilder efsb = new StringBuilder();
                    ExpressionContext exprCtx2 = exprCtx.newExpr();
                    exprCtx2.needSaveVariable = tree.getFirstChildWithType(ObjcmLexer.CLASSICAL_EXPR_2) == null;
                    process_expr_full(efsb, childTree, exprCtx2, true);
                    variableType = efsb.toString().trim();
                    sb.append(efsb);
                    break;
                }
                case ObjcmLexer.CLASSICAL_EXPR_2: {
                    ExpressionContext exprCtx2 = exprCtx.newExpr();
                    exprCtx2.setVariableDeclaration(isVariableDeclaration);
                    // в Objective-C часто объекту с наследованным типом присваивается объект с типом супер-класса
                    if (isVariableDeclaration && (recursiveSearchExists(childTree, ObjcmLexer.ASSIGN) || (childTree.getChildCount() == 1 && childTree.getChild(0).getChildCount() == 0))) {
                        exprCtx2.setVariableDeclarationType(variableType);
                    }
                    StringBuilder varsb = new StringBuilder();
                    process_classical_expr(varsb, childTree, exprCtx2, true, false);
                    sb.append(varsb);

                    if (isVariableDeclaration && !recursiveSearchExists(childTree, ObjcmLexer.ASSIGN)) {
                        if (!variableType.trim().equals("Class")) {
                            sb.append("= new ").append(variableType);
                            if (exprCtx2.isArrayDeclaration) {
                                if (exprCtx2.arraySizes.size() == 0) {
                                    exprCtx2.arraySizes.add("0");
                                }
                                for (String arraySize : exprCtx2.arraySizes) {
                                    sb.append("[").append(arraySize).append("]");
                                }
                            } else {
                                sb.append("(").append(needInitParam(variableType)).append(")");
                            }
                        } else {
                            sb.append("= Class.class");
                        }

                        exprCtx.blockCtx.variables.put(varsb.toString().trim(), variableType);
                    }
                    break;
                }
                default:
                    sb.append(readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx));
                    break;
            }
        }
    }

    private static String needInitParam(String variableType) {
        switch (variableType) {
            case "Double":
            case "Integer":
            case "Float":
                return "0";
            case "String":
                return "";
            case "Boolean":
                return "false";
        }
        return "";
    }

    private static void process_expr_full(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx, boolean leftAssign) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == ObjcmLexer.CLASSICAL_EXPR) {
                process_classical_expr(sb, childTree, exprCtx, leftAssign, false);
            } else if (childTree.getType() == ObjcmLexer.COMMA) {
                sb.append(", ");
            }
        }
    }

    private static void process_expr_assign(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx, boolean doWrap) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            boolean doBracketsWrap = exprCtx.isVariableDeclaration() && !exprCtx.isArrayDeclaration && exprCtx.getVariableDeclarationType() != null;
            switch (childTree.getType()) {
                case ObjcmLexer.ARRAY_INIT:
                    process_array_init(sb, childTree, exprCtx.newExpr().setNoArrayDeclaration());
                    break;
                case ObjcmLexer.CLASSICAL_EXPR:
                    StringBuilder cesb = new StringBuilder();
                    process_classical_expr(cesb, childTree, exprCtx.newExpr().setNoArrayDeclaration().setNoNeedSaveVariable(), false, false);
                    sb.append(cesb);
                    if (doBracketsWrap) {
                        sb.append(")");
                    }
                    if (Utils.isNumericType(exprCtx.getVariableDeclarationType()) && !cesb.toString().trim().startsWith("objc_") && !isJustANumber(childTree)) {
                        sb.append(Utils.getNumberMethod(exprCtx.getVariableDeclarationType()));
                    }
                    break;
                case ObjcmLexer.ASSIGN:
                    if (doWrap) break;
                default:
                    // add assign operator
                    sb.append(readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx));

                    // force type conversion when object initilization through assigment
                    if (doBracketsWrap) {
                        sb.append("(");
                        // todo: is this check really needed?
                        if (!Utils.isNumericType(exprCtx.getVariableDeclarationType())) {
                            sb.append(exprCtx.getVariableDeclarationType()).append(")(");
                        } else {
                            sb.append(primitiveType(exprCtx.getVariableDeclarationType())).append(")(");
                        }
                    }
                    break;
            }
        }
    }

    private static String primitiveType(String variableDeclarationType) {
        return primitives.get(variableDeclarationType);
    }

    private static boolean isJustANumber(CommonTree tree) {
        int simpleCounter = 0;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getChildCount() > 0) {
                if (!isJustANumber(childTree)) return false;
            } else {
                if (childTree.getText().equals("-")) return false;
                if (childTree.getType() == ObjcmLexer.NUMBER) {
                    simpleCounter++;
                } else {
                    return false;
                }
            }
        }
        return simpleCounter <= 1;
    }

    private static void process_array_init(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.ARRAY_INIT:
                    process_array_init(sb, childTree, exprCtx.newExpr().setNoArrayDeclaration());
                    break;
                case ObjcmLexer.CLASSICAL_EXPR:
                    // принудительное приведение типа при инициализации объекта через присваивание
                    if (exprCtx.isVariableDeclaration() && !exprCtx.isArrayDeclaration) {
                        sb.append("(");
                        if (!Utils.isNumericType(exprCtx.getVariableDeclarationType())) {
                            sb.append(exprCtx.getVariableDeclarationType()).append(")(");
                        }
                    }

                    StringBuilder cesb = new StringBuilder();
                    process_classical_expr(cesb, childTree, exprCtx.newExpr().setNoArrayDeclaration(), false, false);
                    sb.append(cesb);
                    if (exprCtx.isVariableDeclaration()) {
                        sb.append(")");
                        if (Utils.isNumericType(exprCtx.getVariableDeclarationType()) && !cesb.toString().trim().startsWith("objc_") && !isJustANumber(childTree)) {
                            sb.append(Utils.getNumberMethod(exprCtx.getVariableDeclarationType()));
                        }
                    }
                    break;
                default:
                    // добавляем оператор присваивания
                    sb.append(readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx));

                    break;
            }
        }
    }

    public static void process_classical_expr(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx, boolean leftAssign, boolean isIncompletePrefix) {
        boolean isIf3 = tree.getFirstChildWithType(ObjcmLexer.EXPR_QUESTION) != null;

        boolean forceIsNotAssign = ((CommonTree) tree.getParent()).getChildren().indexOf(tree) > 0;

        boolean isAssign = !forceIsNotAssign && (leftAssign || recursiveSearchExists(tree, ObjcmLexer.EXPR_ASSIGN));

        boolean doWrap = false;
        if (tree.getFirstChildWithType(ObjcmLexer.EXPR_ASSIGN) != null) {
            // проверим, если первый найденный ClassicalExpr содержит FieldAccess, то оборачиваем все выражение:
            CommonTree sef = tree;
            if (tree.getType() == ObjcmLexer.CLASSICAL_EXPR) {
                sef = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.SIMPLE_EXPR);
            } else {
                sef = (CommonTree) tree.getChild(0);
            }
            boolean isLeftSimple = !(recursiveSearchExists(sef, ObjcmLexer.FIELD_ACCESS));
            if (!isLeftSimple) {
                CommonTree assignOperator = recursiveSearchTree((CommonTree) tree.getFirstChildWithType(ObjcmLexer.EXPR_ASSIGN), ObjcmLexer.ASSIGN);
                sb.append("_").append(OPS_NUMBER.get(assignOperator.getChild(0).getType())).append("(");
                doWrap = true;
            }
        }
        int ororCounter = 0;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;

            switch (childTree.getType()) {
                case ObjcmLexer.CLASSICAL_EXPR:
                    // только внутри скобок
                    process_classical_expr(sb, childTree, exprCtx, isAssign, false);
                    break;
                case ObjcmLexer.EXPR_ASSIGN:
                    if (doWrap) {
                        sb.append(", ");
                    }
                    process_expr_assign(sb, childTree, exprCtx.newExpr().setTransformClassNames(), doWrap);
                    if (doWrap) {
                        sb.append(")");
                    }
                    break;
                case ObjcmLexer.SIMPLE_EXPR:
                    if (isIf3 && ororCounter == 0) {
                        sb.append("logic(");
                    }
                    if (recursiveSearchExists(childTree, "unsigned")) {
                        exprCtx.setVariableDeclaration(true);
                        exprCtx.setVariableDeclarationType("Integer");
                    }

                    ExpressionContext exprCtx2 = exprCtx.newExpr();
                    exprCtx2.skipObjField = doWrap;  // флаг того, что не нужно превращать модификаторы доступа в функцию objc_field
                    StringBuilder sesb = new StringBuilder();
                    process_expr(sesb, childTree, exprCtx2, 0, isAssign, isIncompletePrefix);
                    sb.append(sesb);
                    if (isIf3 && ororCounter == 0) {
                        sb.append(")");
                    }
                    ororCounter++;

                    if (tree.getFirstChildWithType(ObjcmLexer.EXPR_ASSIGN) != null && !exprCtx.isVariableDeclaration()) {
                        exprCtx.setVariableDeclarationType(exprCtx.blockCtx.variables.get(sesb.toString().trim()));
                        exprCtx.setVariableDeclaration(exprCtx.getVariableDeclarationType() != null);
                    }

                    break;
                case ObjcmLexer.EXPR_QUESTION:
                    process_expr_question(sb, childTree, exprCtx.newExpr());
                    break;
                case ObjcmLexer.COLON:
                    sb.append(": ");
                    break;
                case ObjcmLexer.INDEX:
                    if (exprCtx.isVariableDeclaration()) {
                        exprCtx.isArrayDeclaration = true;
                    }
                    process_index(sb, childTree, exprCtx.newExpr());
                    break;
                default:
                    String objectName = readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx).trim();
                    sb.append(objectName).append(" ");
                    putObjectInVariables(exprCtx, objectName);
                    break;
            }
        }
    }

    private static void putObjectInVariables(ExpressionContext exprCtx, String objectName) {
        if (exprCtx.isVariableDeclaration() && exprCtx.needSaveVariable) {
            exprCtx.needSaveVariable = false;
            exprCtx.blockCtx.variables.put(objectName, exprCtx.getVariableDeclarationType());
        }
    }

    private static void process_expr_question(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.CLASSICAL_EXPR:
                    process_classical_expr(sb, childTree, exprCtx.newExpr(), false, false);
                    break;
                case ObjcmLexer.L_QUESTION:
                    sb.append("? ");
                    break;
                case ObjcmLexer.COLON:
                    sb.append(": ");
                    break;
            }
        }
    }

    private static void process_index(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.INDEX_NUMBER:
                    StringBuilder inSb = new StringBuilder();
                    process_classical_expr(inSb, childTree, exprCtx.newExpr(), false, false);
                    if (exprCtx.isVariableDeclaration() && exprCtx.isArrayDeclaration) {
                        // skip it:
                        exprCtx.parentCtx.arraySizes.add(inSb.toString().trim());
                    } else {
                        sb.append(inSb);
                    }
                    break;
                default:
                    sb.append(readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx));
                    break;
            }
        }
    }

    private static String process_index_simple(StringBuilder sb, CommonTree tree) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.INDEX_NUMBER:
                    break;
                default:
                    sb.append(((CommonTree) child).getText().trim());
                    break;
            }
        }
        return sb.toString();
    }

    private static boolean recursiveSearchExists(CommonTree tree, int type) {
        if (tree.getChildCount() == 0) return false;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == type) return true;
            if (childTree.getChildCount() > 0) {
                boolean result = recursiveSearchExists(childTree, type);
                if (result) return true;
            }
        }
        return false;
    }

    private static boolean recursiveSearchExists(CommonTree tree, String value) {
        if (tree.getChildCount() == 0) return false;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getChildCount() == 0 && childTree.getText().trim().equals(value)) return true;
            if (childTree.getChildCount() > 0) {
                boolean result = recursiveSearchExists(childTree, value);
                if (result) return true;
            }
        }
        return false;
    }

    private static CommonTree recursiveSearchTree(CommonTree tree, int type) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == type) return childTree;
            if (childTree.getChildCount() > 0) {
                CommonTree result = recursiveSearchTree(childTree, type);
                if (result != null) return result;
            }
        }
        return null;
    }

    private static void process_expr(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx, int deep, boolean leftAssign, boolean isIncompletePrefix) {
        // deep depends on which level of expression tree we are
        // OPERATIONS_ORDER contains list of operations which *could* be at current level (deep)
        List<Integer> operations = OPERATIONS_ORDER.get(deep);
        int exprType = EXPR_ORDER.get(deep);
        List<Integer> operationsOrder = new ArrayList<>();
        boolean saveVarType = false;
        List children = tree.getChildren();
        for (int i1 = 0; i1 < children.size(); i1++) {
            Object child = children.get(i1);
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == ObjcmLexer.ASTERISK && leftAssign) {
                saveVarType = true;
                continue;
            }
            if (operations.contains(childTree.getType())) {
                operationsOrder.add(childTree.getType());
            }
        }
        int exprCounter = 0;
        int operationsLength = operationsOrder.size();
        int brOpenedCount = 0;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.getType() == exprType) {
                if (operationsLength > 0 && exprCounter < operationsLength) {
                    sb.append("_").append(OPS_NUMBER.get(operationsOrder.get(exprCounter))).append("(");
                    brOpenedCount++;
                }

                if (deep == EXPR_ORDER.size() - 1) {  // EXPR_UNNAME
                    StringBuilder pesb = new StringBuilder();
                    process_expr_unname(pesb, childTree, exprCtx, isIncompletePrefix);
                    sb.append(pesb);

                    if (saveVarType) {
                        exprCtx = exprCtx.newExpr();
                        exprCtx.setVariableDeclaration(true);
                        exprCtx.setVariableDeclarationType(pesb.toString().trim());
                        saveVarType = false;
                    }
                } else {
                    process_expr(sb, childTree, exprCtx, deep + 1, leftAssign, isIncompletePrefix);
                }

                if (operationsLength > 0 && exprCounter < operationsLength) sb.append(", ");

                exprCounter++;
            } else if (childTree.getType() == ObjcmLexer.SIMPLE_EXPR) {
                process_expr(sb, childTree, exprCtx, 0, leftAssign, isIncompletePrefix);
                if (operationsLength > 0) {
                    sb.append(")");
                    brOpenedCount--;
                }
            }
        }
        if (brOpenedCount > 0) {
            for (int i = 0; i < brOpenedCount; i++) sb.append(")");
        }
    }

    private static void process_generic(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            if (childTree.toString().trim().equals("*")) continue;
            sb.append(childTree.toString()).append(" ");
        }
    }

    private static void process_type_convertion(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        sb.append("(");
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.GENERIC:
                    sb.append("<");
                    process_generic(sb, childTree, exprCtx);
                    sb.append(">");
                    break;
                default:
                    sb.append(readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx));
                    break;
            }
        }
        sb.append(")");
    }

    private static void process_expr_unname(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx, boolean isIncompletePrefix) {
        boolean isUnaryMinus = false;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.EXPR_NOT:
                    boolean isRealNot = childTree.getFirstChildWithType(ObjcmLexer.L_NOT) != null;
                    if (isRealNot) {
                        sb.append("_not(");
                    }
                    if (isUnaryMinus) {
                        sb.append("_uminus(");
                    }
                    process_expr_not(sb, childTree, exprCtx.newExpr());
                    if (isRealNot) {
                        sb.append(")");
                    }
                    if (isUnaryMinus) {
                        sb.append(")");
                    }
                    break;
                case ObjcmLexer.ASTERISK:
                case ObjcmLexer.L_AND:
                    // эту хрень пропускаем
                    break;
                default:
                    String def = readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx).trim();
                    if (def.equals("-")) {
                        isUnaryMinus = true;
                    } else {
                        sb.append(def).append(" ");
                    }
                    break;
            }
        }
    }

    private static void process_expr_not(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        // test for Field_access:
        int fieldAccessCounter = 0;
        // сначала просто считаем кол-во операций доступа
        if (tree.getFirstChildWithType(ObjcmLexer.FIELD_ACCESS) != null) {
            for (Object child : tree.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                if (childTree.getType() == ObjcmLexer.FIELD_ACCESS) {
                    fieldAccessCounter++;
                }
            }
        }
        int fieldAccessCounter2 = 0;
        if (tree.getFirstChildWithType(ObjcmLexer.FIELD_ACCESS) != null) {
            for (Object child : tree.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                if (childTree.getType() == ObjcmLexer.FIELD_ACCESS) {
                    fieldAccessCounter2++;
                    if (fieldAccessCounter2 < fieldAccessCounter || !exprCtx.skipObjField) {
                        sb.append("objc_field(");
                    }
                }
            }
        }
        fieldAccessCounter2 = 0;
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.getType()) {
                case ObjcmLexer.L_BR_TOKEN:
                    process_l_br_end(sb, childTree, exprCtx.newExpr());
                    break;
                case ObjcmLexer.TYPE_CONVERTION:
                    process_type_convertion(sb, childTree, exprCtx.newExpr());
                    break;
                case ObjcmLexer.CLASSICAL_EXPR:
                    process_classical_expr(sb, childTree, exprCtx.newExpr(), false, false);
                    break;
                case ObjcmLexer.L_NOT:
                    break;
                case ObjcmLexer.METHOD_CALL:
                    m_process_method_call(sb, childTree, exprCtx.newExpr());
                    break;
                case ObjcmLexer.FIELD_ACCESS:
                    fieldAccessCounter2++;
                    sb.append(", \"");
                    sb.append(readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx).trim());
                    sb.append("\"");
                    if (fieldAccessCounter2 > 0 && (fieldAccessCounter2 < fieldAccessCounter || !exprCtx.skipObjField)) {
                        sb.append(")");
                    }
                    break;
                case ObjcmLexer.FUNCTION:
                    ExpressionContext exprCtx2 = exprCtx.newExpr();
                    exprCtx2.transformClassNames = true;
                    m_process_function(sb, childTree, exprCtx2.checkForFunctionName());
                    break;
                case ObjcmLexer.GENERIC:
                    sb.append("<");
                    process_generic(sb, childTree, exprCtx);
                    sb.append(">");
                    break;
                default:
                    if (a_started_cases(sb, exprCtx, childTree)) continue;

                    String objectName = readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx).trim();
                    sb.append(objectName).append(" ");

                    putObjectInVariables(exprCtx, objectName);
                    break;
            }
        }
    }

    private static void m_process_function(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        for (Object obj : tree.getChildren()) {
            CommonTree childTree = (CommonTree) obj;
            switch (childTree.getType()) {
                case ObjcmLexer.CLASSICAL_EXPR:
                    process_classical_expr(sb, childTree, exprCtx.checkForFunctionName(), false, false);
                    break;
                default:
                    sb.append(readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx));
            }
        }
    }

    private static void process_l_br_end(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        boolean add_brackets = tree.getFirstChildWithType(ObjcmLexer.TYPE_CONVERTION2) == null;
        if (add_brackets) sb.append("(");
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.TYPE_CONVERTION2:
                    process_expr_not(sb, childTree, exprCtx);
                    break;
                case ObjcmLexer.CLASSICAL_EXPR:
                    process_classical_expr(sb, childTree, exprCtx, false, false);
                    break;
                default:
                    if (a_started_cases(sb, exprCtx, childTree)) continue;

                    String objectName = readChildren(childTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx).trim();
                    sb.append(objectName).append(" ");

                    putObjectInVariables(exprCtx, objectName);
                    break;
            }
        }
//        if (add_brackets) sb.append(")");
    }

    private static boolean a_started_cases(StringBuilder sb, ExpressionContext exprCtx, CommonTree childTree) {
        if (childTree.getChildCount() == 0) return false;
        switch (childTree.token.getType()) {
            case ObjcmLexer.SELECTOR:
                m_process_selector(sb, childTree, exprCtx.newExpr(), "selector");
                return true;
            case ObjcmLexer.PROTOCOL:
                m_process_selector(sb, childTree, exprCtx.newExpr(), "protocol");
                return true;
            case ObjcmLexer.ENCODE:
                m_process_selector(sb, childTree, exprCtx.newExpr(), "encode");
                return true;
        }
        return false;
    }

    private static void m_process_static_start(StringBuilder sb, CommonTree tree, BlockContext blockCtx) {
        StringBuilder isb = new StringBuilder();
        String variableType = "";
        CommonTree typeTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.STATIC_TYPE);
        if (typeTree != null) {
            variableType = readChildren(typeTree, blockCtx.methodCtx().classCtx, blockCtx.newExpr()).trim();
        }
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            // skip only word "static"
            if (childTree.getType() == ObjcmLexer.STATIC_PREFIX) continue;

            isb.append(readChildren(childTree, blockCtx.methodCtx().classCtx, blockCtx.newExpr()));
            if (typeTree != null && childTree.getType() == ObjcmLexer.CLASSICAL_EXPR_2) {
                if (!recursiveSearchExists(childTree, ObjcmLexer.ASSIGN)) {
                    if (!variableType.equals("Class")) {
                        isb.append("= new ").append(variableType).append("(").append(needInitParam(variableType)).append(")");
                    } else {
                        isb.append("= Class.class");
                    }
                }
            }
        }
        String line = isb.toString();
        sb.append(line);
    }

    private static void m_process_while_stmt(StringBuilder sb, CommonTree tree, BlockContext cc) {
        CommonTree exprTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.WHILE_EXPR);
        StringBuilder exprsb = new StringBuilder();
        m_process_block(exprsb, exprTree, cc);

        CommonTree bodyTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.IF_BLOCK);
        StringBuilder bodysb = new StringBuilder();
        m_process_block(bodysb, bodyTree, cc);

        sb.append("while (logic(").append(exprsb).append("))\n");
        sb.append(bodysb);
    }

    private static void m_process_selector(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx, String selector) {
        exprCtx.checkForFunctionName = false;

        CommonTree selectorValueTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.SELECTOR_VALUE);
        String selectorValue = readChildren(selectorValueTree, exprCtx.blockCtx.methodCtx().classCtx, exprCtx).trim();

        sb.append("_").append(selector).append("_(\"").append(selectorValue).append("\")");
    }

    private static void m_process_if_stmt(StringBuilder sb, CommonTree tree, BlockContext cc) {
        CommonTree exprTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.IF_EXPR);
        StringBuilder exprsb = new StringBuilder();
        m_process_block(exprsb, exprTree, cc);

        CommonTree blockTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.IF_BLOCK);
        StringBuilder blocksb = new StringBuilder();
        m_process_block(blocksb, blockTree, cc);

        // logic - такой метод, который всегда возращает булевский тип
        sb.append("if (logic(").append(exprsb).append(")) ");
        sb.append(blocksb);
    }

    private static boolean m_process_switch(StringBuilder sb, CommonTree tree, BlockContext blockCtx) {
        // 1. сначала проанализируем: какого типа объект используется для ветвления
        // если это обычный enum, то конструируем обычный switch
        // если это объект иного типа, то делаем обертку "getEnum(...)"

        CommonTree switchExprTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.SWITCH_EXPRESSION);
        StringBuilder esb = new StringBuilder();
        m_process_block(esb, switchExprTree, blockCtx);
        boolean useGetEnum = !esb.toString().trim().startsWith("this.");

        CommonTree switchBodyTree = (CommonTree) tree.getFirstChildWithType(ObjcmLexer.SWITCH_BODY);

        // начинаем конструировать switch
        sb.append("{\n");
        String switchUuid = UUID.randomUUID().toString().replace("-", "_");
        sb.append("\tEnum i_").append(switchUuid).append(" = ");
        if (useGetEnum) sb.append("getEnum(");
        sb.append(esb);
        if (useGetEnum) sb.append(")");
        sb.append(";\n");

        StringBuilder bodySB;
        StringBuilder defaultBody = new StringBuilder();

        // здесь LinkedHashMap, потому что нам важно сохранить порядок
        // в котором шли case-ы и default внутри оригинального switch
        Map<String, StringBuilder> switchMap = new LinkedHashMap<>();
        Map<String, Boolean> switchMapBreak = new LinkedHashMap<>();

        for (Object child : switchBodyTree.getChildren()) {
            CommonTree childTree = (CommonTree) child;

            switch (childTree.getType()) {
                case ObjcmLexer.CASE_STMT: {
                    CommonTree caseExprTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.CASE_EXPR);
                    String caseExpr = readChildren(caseExprTree, blockCtx.methodCtx().classCtx, blockCtx.newExpr()).trim();
                    bodySB = new StringBuilder();
                    CommonTree caseBodyTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.CASE_BODY);
                    BlockContext blockCtx2 = blockCtx.newBlock().setSkipBreak();
                    if (caseBodyTree != null) {
                        m_process_block(bodySB, caseBodyTree, blockCtx2);
                    }
                    switchMap.put(caseExpr, bodySB);
                    switchMapBreak.put(caseExpr, blockCtx2.isBreak);
                    break;
                }
                case ObjcmLexer.DEFAULT_STMT: {
                    CommonTree blockTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.DEFAULT_BODY);
                    if (blockTree != null) {
                        BlockContext blockCtx2 = blockCtx.newBlock().setSkipBreak();
                        m_process_block(defaultBody, blockTree, blockCtx2);
                        switchMap.put(null, defaultBody);
                        switchMapBreak.put(null, blockCtx2.isBreak);
                    }
                    break;
                }
                default:
                    // everything, which is not CASE and not DEFAULT must be pushed under switch
                    sb.append(readChildren(childTree, blockCtx.methodCtx().classCtx, blockCtx.newExpr()));
                    break;
            }
        }

        List<String> keysArray = new ArrayList<>(switchMap.keySet());
        int caseNum = 0;
        for (String caseStmt : switchMap.keySet()) {
            if (caseStmt == null) continue; // DEFAULT operation to the end
            if (caseNum > 0) sb.append("else ");
            sb.append("if (i_").append(switchUuid).append(".equals(").append(caseStmt).append("))");
            caseNum = processSwitchCaseBody(sb, switchMap, switchMapBreak, keysArray, caseNum, caseStmt);
        }
        if (switchMap.get(null) != null) {
            sb.append("else ");
            caseNum = processSwitchCaseBody(sb, switchMap, switchMapBreak, keysArray, caseNum, null);
        }
        sb.append("}\n");

        return switchMap.get(null) != null;
    }

    private static int processSwitchCaseBody(StringBuilder sb, Map<String, StringBuilder> switchMap, Map<String, Boolean> switchMapBreak, List<String> keysArray, int caseNum, String caseStmt) {
        sb.append(" {\n");
        StringBuilder currentBlock = switchMap.get(caseStmt);
        if (!currentBlock.toString().trim().isEmpty()) {
            sb.append(currentBlock);
        }
        if (!switchMapBreak.get(caseStmt)) {
            for (int i = keysArray.indexOf(caseStmt) + 1; i < keysArray.size(); i++) {
                StringBuilder caseCode = switchMap.get(keysArray.get(i));
                if (!caseCode.toString().trim().isEmpty()) {
                    sb.append("\n\n");
                    sb.append(caseCode);
                }
                if (switchMapBreak.containsKey(keysArray.get(i))) break;
            }
        }
        sb.append("}\n");
        caseNum++;
        return caseNum;
    }

    private static boolean testBrackets(List children, int i, int childrenSize, Object child) {
        if (child.toString().equals("[")) {
            if (i < childrenSize - 1) {
                if (((CommonTree) children.get(i + 1)).getToken().getType() == ObjcmLexer.METHOD_CALL) {
                    return true;
                }
            }
        }
        if (child.toString().equals("]")) {
            if (i > 0) {
                if (((CommonTree) children.get(i - 1)).getToken().getType() == ObjcmLexer.METHOD_CALL) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean m_process_object(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        boolean typeConv = false;
        boolean wasMethodCall = false;
        List children = tree.getChildren();
        for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
            Object child = children.get(i);
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.TYPE_CONVERTION:
                    process_type_convertion(sb, childTree, exprCtx.newExpr().setNoTransformClassNames());
                    break;
                case ObjcmLexer.METHOD_CALL:
                    wasMethodCall = m_process_method_call(sb, childTree, exprCtx.newExpr().setTransformClassNames());
                    break;
                case ObjcmLexer.FIELD_ACCESS:
                    StringBuilder fasb = new StringBuilder();
                    m_process_block(fasb, childTree, exprCtx.blockCtx.newBlock());
                    sb.append(".");
                    sb.append(fasb);
                    break;
                case ObjcmLexer.FUNCTION:
                    process_classical_expr(sb, childTree, exprCtx.newExpr().checkForFunctionName().setTransformClassNames(), false, false);
                    break;
                default:
                    if (testBrackets(children, i, childrenSize, child)) break;
                    sb.append(transformObject(child.toString(), exprCtx.blockCtx.methodCtx().classCtx, exprCtx.newExpr().setTransformClassNames()));
                    break;
            }
        }
        if (typeConv) sb.append(")");
        return wasMethodCall;
    }

    private static void m_process_message(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx, boolean isIncompletePrefix) {
        List children = tree.getChildren();
        boolean prevId = false;
        for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
            Object child = children.get(i);
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.CLASSICAL_EXPR:
                    process_classical_expr(sb, childTree, exprCtx, false, isIncompletePrefix);
                    break;
                case ObjcmLexer.METHOD_CALL:
                    m_process_method_call(sb, childTree, exprCtx);
                    break;
                case ObjcmLexer.PREFIX:
                    break;
                case ObjcmLexer.FUNCTION:
                    ExpressionContext exprCtx2 = exprCtx.newExpr();
                    exprCtx2.transformClassNames = true;
                    process_classical_expr(sb, childTree, exprCtx2.checkForFunctionName(), false, false);
                    break;
                default:
                    if (a_started_cases(sb, exprCtx, childTree)) continue;

                    if (i == 0 && child.toString().equals("[")) continue;
                    if (i == childrenSize - 1 && child.toString().equals("]")) continue;
                    // ситуация типа blabla... prefix
                    if (!children.get(childrenSize - 1).toString().equals(")") && i > 0 && i == childrenSize - 2 && prevId && child.toString().matches("\\s+")) {
                        return;
                    }
                    String obj = transformObject(child.toString(), exprCtx.blockCtx.methodCtx().classCtx, exprCtx);
                    sb.append(obj);
                    prevId = child.toString().matches("[a-zA-Z_\\d\\.]*");
                    break;
            }
        }
    }

    private static boolean m_process_method_call(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        boolean wasMethodCall = false;
        boolean instanceCreation = false;
        String object = "";
        String message = "";
        String methodName = "";
        loop:
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.OBJECT:
                    StringBuilder lsb2 = new StringBuilder();
                    wasMethodCall = m_process_object(lsb2, childTree, exprCtx.newExpr());
                    object = lsb2.toString().trim();
                    break;
                case ObjcmLexer.METHOD_NAME:
                    String name = childTree.getChild(0).toString();
                    if (RESTRICTED_METHODS.contains(name)) {
                        break loop;
                    }
                    if (name.equals("alloc")) {
                        instanceCreation = true;
                    } else {
                        methodName = Utils.transformMethodName(name);
                        wasMethodCall = true;
                    }
                    break;
                case ObjcmLexer.MSG_LIST:
                    for (Object methodMsgObj : childTree.getChildren()) {
                        CommonTree methodMsg = (CommonTree) methodMsgObj;
                        CommonTree prefix = (CommonTree) methodMsg.getFirstChildWithType(ObjcmLexer.PREFIX);
                        if (prefix != null)
                            methodName += prefix.getChild(0).toString();
                    }

                    StringBuilder lsb = new StringBuilder();
                    m_process_msg_list(lsb, childTree, exprCtx.newExpr().setTransformClassNames().checkForFunctionName());
                    message = lsb.toString();
                    break;
            }
        }

        // Специальная защита от методов с именем "new"
        if (methodName.trim().equals("new")) {
            wasMethodCall = false;
            instanceCreation = true;
        }

        if (instanceCreation && "Class".equals(exprCtx.blockCtx.variables.get(object))) {
            methodName = "newInstance";
            wasMethodCall = true;
            instanceCreation = false;
        }

        if (wasMethodCall) {
            if (object.isEmpty()) {
                throw new RuntimeException("empty object for method call");
            }
            if (methodName.isEmpty()) {
                sb.append(object);
            } else {
                if (methodName.equals("isKindOfClass") || methodName.equals("isSubclassOfClass")) {
                    sb.append("_instanceof(").append(object).append(", ").append(message).append(")");
                }/* else if (object.startsWith("NS")) {
                    // cut wrong added ".class"
                    object = Utils.curClassField(object);
                    if (methodName.equals("null")) methodName = "_null";
                    sb.append(object).append(".").append(methodName).append("(").append(message).append(")");
                }*/ else {
                    if (object.equals("super") && methodName.equals("init")) {
                        return false;
                    }
                    sb.append("objc_msgSend(");
                    if (exprCtx.blockCtx.methodCtx().classCtx.projectCtx.imports.get(object) != null)
                        object = object + "._static";
                    sb.append(fixObject(object)).append(",").append("\"").append(methodName).append("\"");
                    sb.append(", ");

                    // список категорий
                    sb.append(exprCtx.blockCtx.methodCtx().classCtx.categoryList);

                    if (!message.isEmpty()) sb.append(", ").append(message);
                    sb.append(")");
                }
            }
        } else if (instanceCreation) {
            object = Utils.curClassField(object);
            sb.append("new ").append(object).append("()");
        }

        return wasMethodCall || instanceCreation;
    }

    private static String fixObject(String object) {
        switch (object) {
            case "super":
                return "this";
            case "String":
                return "String.class";
        }
        return object;
    }

    private static void m_process_msg_list(StringBuilder sb, CommonTree tree, ExpressionContext exprCtx) {
        int msgCount = 0;
        List children = tree.getChildren();
        for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
            Object child = children.get(i);
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.METHOD_MSG:
                    boolean isIncompletePrefix = i < childrenSize - 1 && ((CommonTree) children.get(i + 1)).getFirstChildWithType(ObjcmLexer.INCOMPLETE_PREFIX) != null;
                    CommonTree messageTree = (CommonTree) childTree.getFirstChildWithType(ObjcmLexer.MESSAGE);
                    if (messageTree != null) {
                        if (msgCount > 0) sb.append(", ");
                        m_process_message(sb, messageTree, exprCtx.newExpr().setTransformClassNames(), isIncompletePrefix);
                        msgCount++;
                    }
                    break;
            }
        }
    }


    private static String m_process_param(Map<String, String> params, CommonTree tree, ClassContext classCtx) {
        String type = "";
        String name = "";
        String generic = "";
        String prefix = "";
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.PREFIX:
                    prefix = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.TYPE:
                    type = readType(classCtx, childTree);
                    break;
                case ObjcmLexer.NAME:
                    name = childTree.getChild(0).toString();
                    break;
            }
        }

        params.put(name, transformType(type, classCtx));

        return prefix;
    }

    private static void m_process_field2(StringBuilder sb, CommonTree tree, ClassContext cc) {
        String modifier = "";
        String type = "";
        String name = "";
        String value = "";
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.MODIFIER:
                    modifier = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.TYPE:
                    type = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.NAME:
                    name = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.VALUE:
                    value = m_process_field_value(childTree, cc);
                    break;
            }
        }

        sb.append("public ").append((modifier.length() > 0 ? modifier + " " : "")).append(transformType(type, cc)).append(" ").append(name);
        if (value.length() > 0) {
            sb.append(" = ").append(value);
        }
        sb.append(";\n");
    }

    private static void m_process_field(StringBuilder sb, CommonTree tree, ClassContext classCtx) {
        String type = "";
        String name = "";
        String value = "";
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjcmLexer.TYPE:
                    type = childTree.getChild(0).toString();
                    break;
                case ObjcmLexer.NAME:
                    name = childTree.getChild(0).toString().trim();
                    break;
                case ObjcmLexer.VALUE:
                    value = m_process_field_value(childTree, classCtx);
                    break;
            }
        }

        classCtx.projectCtx.staticFields.put(name, classCtx.className);

        sb.append("public static ").append(transformType(type, classCtx)).append(" ").append(name);
        if (value.length() > 0) {
            sb.append(" = ").append(value);
        }
        sb.append(";\n");
    }

    private static String m_process_field_value(CommonTree tree, ClassContext classContext) {
        StringBuilder sb = new StringBuilder();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            classContext.newMethod(null, null, false, null);
            sb.append(transformObject(childTree.toString(), classContext, null));
        }
        return sb.toString();
    }

}
