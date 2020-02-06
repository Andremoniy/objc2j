package ru.andremoniy.objctojavacnv;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import ru.andremoniy.objctojavacnv.antlr.output.PreprocessorParser;
import ru.andremoniy.objctojavacnv.context.ClassContext;
import ru.andremoniy.objctojavacnv.context.ExpressionContext;
import ru.andremoniy.objctojavacnv.context.ProjectContext;

import java.util.*;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 9:33
 */


public class Utils {

    private static final List<String> NUMERIC_TYPES = Arrays.asList("Integer", "Double", "Short", "Long");
    private static final List<String> PRIMITIVES = Arrays.asList("void", "char", "int", "double", "float");
    private static final Map<String, String> importReplaces = new HashMap<String, String>() {{
//        put("stdio.h", "static java.lang.System.out");
    }};

    static String transformObject(String obj, ClassContext classCtx, ExpressionContext exprCtx) {
        switch (obj) {
            case "_cmd":
                return "\"" + classCtx.methodCtx.methodName + "\"";
            case "NULL":
            case "nil":
            case "Nil":
                return "null";
            case "self":
                if (classCtx.methodCtx.staticFlag) {
                    return classCtx.className + (exprCtx.transformClassNames ? ".class" : "");
                } else {
                    return "this";
                }
            case "TRUE":
            case "YES":
                return "true";
            case "NO":
                return "false";
            case "static":
                return "";
            case "MAX":
                return "Math.max";
            case "_CGFloatFloor":
                return "(int)Math.floor";
            case "fmodf":
                return "MathEx.fmodf";
            case ";":
                return ";\n";
        }
        if (obj.startsWith("@\"")) obj = obj.substring(1);
        obj = transformType(obj, classCtx);

        if (classCtx != null) {
            String _import = classCtx.projectCtx.staticFields.get(obj);
            if (_import != null && !classCtx.addImports.contains(_import)) {
                classCtx.addImports.add(_import);
            }
        }
        boolean isVariable = checkForVariable(obj, exprCtx);
        if (exprCtx != null && exprCtx.checkForFunctionName) {
            if (!isVariable) {
/*
                for (String methodName : exprCtx.blockCtx.methodCtx().classCtx.methodsInterfaces.keySet()) {
                    if (methodName.equals(obj)) {
                        return "\"" + methodName + "\"";
                    }
                }
*/
            }
        }
        if (!isVariable) {
            if (classCtx != null &&
                    exprCtx != null &&
                    exprCtx.transformClassNames &&
                    (classCtx.projectCtx.imports.containsKey(obj.trim()))) {
                obj = obj + ".class";
            }
        }
        return obj;
    }

    private static boolean checkForVariable(String obj, ExpressionContext exprCtx) {
        if (exprCtx != null) {
            for (String varName : exprCtx.blockCtx.variables.keySet()) {
                if (varName.equals(obj)) {
                    return true;
                }
            }
            for (String varName : exprCtx.blockCtx.methodCtx().variables.keySet()) {
                if (varName.equals(obj)) {
                    return true;
                }
            }
            for (String varName : exprCtx.blockCtx.methodCtx().classCtx.variables.keySet()) {
                if (varName.equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    static String transformMethodName(String name) {
        switch (name) {
            case "isEqualToString":
                return "equals";
            case "class":
                return "";
        }
        return name;
    }

    private static List<String> SKIP_TRANSFORM = Arrays.asList("{", "}", "=", "super", "this", "++", "--", "(", ")", ",");

    static String transformType(String type, ClassContext classCtx) {
        type = type.trim();
        if (SKIP_TRANSFORM.contains(type) || type.startsWith("\"") || type.endsWith("\"")) return type;
        if (isNumber(type)) return type;

        if (type.matches("void\\s*\\*")) return "Object";
        // отрезаем *
        if (type.endsWith("*")) type = type.substring(0, type.length() - 1);
        type = type.trim();

        switch (type) {
            case "NSUInteger":
            case "NSInteger":
            case "signed":
            case "int":
            case "unsigned":
            case "size_t":
                return "Integer";
            case "id":
                return "NSObject";
            case "NSString":
                return "String";
            case "BOOL":
                return "Boolean";
            case "IBAction":
                return "void";
            case "CGFloat":
            case "double":
            case "float":
                return "Double";
            case "long":
                return "Long";
            case "short":
                return "Short";
            case "unichar":
                return "Character";
            case "struct":
                return "";
        }

        if (!type.isEmpty()) {
            if (classCtx != null && !classCtx.localProcessedImports.contains(type) && !classCtx.addImports.contains(type) && !isPrimitiveType(type)) {
                classCtx.addImports.add(type);
            } else if (classCtx != null && type.startsWith("NS")) {
                classCtx.addImports.add(type);
            }
        }

        return type;
    }

    private static boolean isNumber(String type) {
        try {
            Double.parseDouble(type);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static boolean isPrimitiveType(String type) {
        return PRIMITIVES.contains(type);
    }

    public static void addAdditionalImports(ProjectContext projectCtx) {
        Set<String> nsImports = new HashSet<>();
        for (String addImport : projectCtx.classCtx.addImports) {
            String _addImport = addImport;
            if (addImport.contains(".")) {
                _addImport = addImport.substring(0, addImport.indexOf("."));
            }

            if (_addImport.equals("NSObject")) continue; // too complex analysis

            Set<String> classPathList = projectCtx.imports.get(_addImport);
            if (classPathList == null && _addImport.startsWith("I")) {
                _addImport = _addImport.substring(1);
                classPathList = projectCtx.imports.get(_addImport);
            }
            if (classPathList != null) {
                // reverse replace classname to appropriate
                for (String classPath : classPathList) {
                    if (!_addImport.equals(addImport)) {
                        classPath = classPath.substring(0, classPath.lastIndexOf(".") + 1) + addImport;
                    }
                    if (!classPath.contains("+")) {
//                        projectCtx.classCtx.imports.add(classPath);
//                        sb.append("import ").append(classPath).append(";\n");
                        projectCtx.classCtx.imports.add("static " + classPath + ".*");
//                        sb.append("import static ").append(classPath).append(".*;\n");
                        addNSHeaderImport(projectCtx, classPath);
                    }
                    String className = classPath.substring(classPath.lastIndexOf(".") + 1);
                    if (!projectCtx.classCtx.localProcessedImports.contains(className)) {
                        addStaticFromHeaderImports(projectCtx, className);
                        projectCtx.classCtx.localProcessedImports.add(className);
                    }
                }
            }
        }
    }

    private static void addNSHeaderImport(ProjectContext projectCtx, String classPath) {
        String importClassName = classPath.substring(classPath.lastIndexOf(".") + 1);
        if (importClassName.startsWith("NS")) {
            String interfaceName = classPath.substring(0, classPath.lastIndexOf(".")) + ".I" + importClassName;
            projectCtx.classCtx.imports.add(interfaceName);
            projectCtx.classCtx.imports.add("static " + interfaceName + ".*");
        }
    }

    public static void addStaticFromHeaderImports(ProjectContext projectCtx, String className) {
        List<String> enums = projectCtx.headerEnums.get("I" + className);
        if (enums != null) {
            Set<String> headerPathList = projectCtx.imports.get(className);
            for (String headerPath : headerPathList) {
                String prefix = headerPath.substring(0, headerPath.length() - className.length());
                headerPath = prefix + (prefix.endsWith("I") ? "" : "I") + className;
                int plusIndex = headerPath.indexOf("+");
                if (plusIndex >= 0) headerPath = headerPath.substring(0, plusIndex);
                for (String _enum : enums) {
                    projectCtx.classCtx.imports.add("static " + headerPath + "." + _enum + ".*");
                }
            }
        }
    }

    public static String getText(CommonTree tree) {
        if (tree == null) return "";
        if (tree.getChildCount() == 0) return tree.getText();
        StringBuilder sb = new StringBuilder();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            sb.append(getText(childTree)).append(" ");
        }
        return sb.toString();
    }

    public static String readChildren(CommonTree tree) {
        StringBuilder sb = new StringBuilder();
        if (tree.getChildren() != null && !tree.getChildren().isEmpty()) {
            for (Object childObj : tree.getChildren()) {
                sb.append(readChildren((CommonTree) childObj));
            }
        } else {
            sb.append(tree.toString());
        }
        return sb.toString();
    }

    /**
     * add original imports from file
     *
     * @param input file code source
     */
    public static void addOriginalImports(String input, ProjectContext projectCtx) throws RecognitionException {
        Map<String, Set<String>> imports = projectCtx.imports;
        PreprocessorParser.code_return result = Preprocessor.getResult(input);
        for (Object child : ((CommonTree) result.getTree()).getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case PreprocessorParser.T_IMPORT:
                    CommonTree pathTree = (CommonTree) childTree.getFirstChildWithType(PreprocessorParser.T_PATH);
                    String importPath = readChildren(pathTree);
                    String importReplace = importReplaces.get(importPath);
                    // todo: why static? not always
                    if (importReplace != null) projectCtx.classCtx.imports.add(importReplace);

                    break;
                case PreprocessorParser.T_INCLUDE:
                    String path = getText(childTree);
                    String className = path.substring(1, path.length() - 3);
                    Set<String> classPathList = imports.get(className);
                    if (classPathList != null) {
                        if (className.contains("+")) {
                            // saving info about added categories, but do not add into import
                            projectCtx.classCtx.localCategories.add(className);
                        } else {
                            for (String classPath : classPathList) {
                                projectCtx.classCtx.imports.add(classPath);
                                projectCtx.classCtx.imports.add("static " + classPath + ".*");
                                addNSHeaderImport(projectCtx, classPath);
                            }
                        }
                        addStaticFromHeaderImports(projectCtx, className);
                        projectCtx.classCtx.localProcessedImports.add(className);
                    }
                    break;
            }
        }

    }

    public static boolean isNumericType(String type) {
        if (type == null) return false;
        type = type.trim();
        return (NUMERIC_TYPES.contains(type));
    }

    public static String getNumberMethod(String type) {
        type = type.trim();
        switch (type) {
            case "Integer":
                return ".intValue()";
            case "Long":
                return ".longValue()";
            case "Double":
                return ".doubleValue()";
            case "Byte":
                return ".byteValue()";
            case "Short":
                return ".shortValue()";
            case "Float":
                return ".floatValue()";
        }
        return "";
    }

    static String curClassField(String object) {
        if (object.endsWith(".class")) {
            object = object.substring(0, object.lastIndexOf(".class"));
        }
        return object;
    }

    public static String getDefaultValue(String type) {
        type = type.trim();
        switch (type) {
            case "Byte":
            case "Short":
            case "Long":
            case "Integer":
                return "0";
            case "Double":
                return "0.0d";
        }
        return "null";
    }
}