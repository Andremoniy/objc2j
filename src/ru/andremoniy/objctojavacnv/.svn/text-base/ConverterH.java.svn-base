package ru.andremoniy.objctojavacnv;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.andremoniy.objctojavacnv.antlr.output.ObjchLexer;
import ru.andremoniy.objctojavacnv.antlr.output.ObjchParser;
import ru.andremoniy.objctojavacnv.builder.ClassBuilder;
import ru.andremoniy.objctojavacnv.context.ProjectContext;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 9:32
 */
public class ConverterH {

    public static final Logger log = LoggerFactory.getLogger(ConverterH.class);

    private static final int UNDEFINED_TYPEDEF = 0;
    private static final int RENAME_TYPEDEF = 1;
    private static final int ENUM_TYPEDEF = 2;
    private static final int STRUCT_TYPEDEF = 3;

    private ConverterH() {
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static StringBuilder convert_h(String fileName, ProjectContext projectContext, StringBuilder originalImportsSb, StringBuilder importsSb) throws IOException, RecognitionException {
        projectContext.h_counter++;

        File phfile = new File(fileName + "p");
        File hfile = phfile.exists() ? phfile : new File(fileName);

        final boolean categoryClass = hfile.getName().contains("+");
        final String categoryName = categoryClass ? hfile.getName().substring(hfile.getName().indexOf("+") + 1, hfile.getName().lastIndexOf(".")) : null;

        // new file with java code
        String pureClassName = hfile.getName().substring(0, hfile.getName().lastIndexOf(".")).replace("-", "_");
        String className = "I" + pureClassName;
        File hjfile = new File(hfile.getParent() + File.separator + className + ".java");
        hjfile.createNewFile();

        String packageName = hfile.getParent().substring(hfile.getParent().lastIndexOf("src") + 4).replace(File.separator, ".");

        String input = FileUtils.readFileToString(hfile, ConverterProperties.PROPERTIES.getProperty(ConverterProperties.ENCODING));
        input = input.replace("///", "//");

        input = Preprocessor.replace(input, projectContext, fileName);

        // ANTLR parsing
        CharStream cs = new ANTLRStringStream(input);
        ObjchLexer lexer = new ObjchLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(lexer);
        ObjchParser parser = new ObjchParser(tokens);

        ObjchParser.code_return result = parser.code();

        //StringBuilder sb = new StringBuilder();

        if (originalImportsSb == null) originalImportsSb = new StringBuilder();

        Utils.addOriginalImports(input, projectContext);

        ClassBuilder cb = new ClassBuilder();

        if (!categoryClass) {
            cb.setPackage(packageName);
            cb.addImport("ru.andremoniy.jcocoa.*");
            cb.a(originalImportsSb);
        }

        if (result.getTree() == null) return cb.sb(); // this is not a error, but file contains only commentaries
        CommonTree tree = (CommonTree) result.getTree();

        // 1. StringBuilder for main class:
        ClassBuilder mainCb = new ClassBuilder();

        // 2. StringBuilder for addinitianl not-inner interfaces
        ClassBuilder addCb = new ClassBuilder();

        // find interface with name, which is equals to file name:
        CommonTree mainInterface = null;
        if (tree.getType() == ObjchLexer.INTERFACE) {
            mainInterface = processInterface(projectContext, pureClassName, className, packageName, cb, addCb, mainInterface, tree);
        } else {
            for (Object child : tree.getChildren()) {
                CommonTree childTree = (CommonTree) child;
                if (childTree.getType() == ObjchLexer.INTERFACE) {
                    mainInterface = processInterface(projectContext, pureClassName, className, packageName, cb, addCb, mainInterface, childTree);
                }
            }
        }

        projectContext.newClass(className, categoryName);

        projectContext.addImports(pureClassName, packageName + "." + projectContext.classCtx.className());
        projectContext.addImports(projectContext.classCtx.className(), packageName + "." + projectContext.classCtx.className());

        if (mainInterface != null) {
            process_interface(projectContext, mainInterface, mainCb, false, false, cb);
        } else {
            mainCb.abstractClass(className, "NSObject");
        }
        if (mainInterface != tree) {
            process_interface_body(mainCb.sb(), tree, projectContext, true); // with skipping interfaces
        }

        mainCb.a(addCb);

        if (importsSb == null) {
            importsSb = new StringBuilder();
        }
        Utils.addAdditionalImports(projectContext);

        if (!categoryClass) {
            Set<String> categoriesList = projectContext.categories.get(pureClassName);
            if (categoriesList != null) {
                for (String category : categoriesList) {
                    mainCb.a("\n\n");
                    mainCb.a("\t// from category: ").a(category).a("\n\n");
                    mainCb.a(convert_h(category, projectContext, originalImportsSb, importsSb));
                }
            }

            mainCb.a("}\n"); // end of class

            cb.a(importsSb);
        }

        cb.a(mainCb);

        if (!categoryClass)
            FileUtils.writeStringToFile(hjfile, cb.sb().toString(), ConverterProperties.PROPERTIES.getProperty(ConverterProperties.ENCODING));

        return cb.sb();

    }

    private static CommonTree processInterface(ProjectContext projectContext, String pureClassName, String className, String packageName, ClassBuilder cb, ClassBuilder addCb, CommonTree mainInterface, CommonTree childTree) {
        CommonTree nameTree = (CommonTree) childTree.getFirstChildWithType(ObjchLexer.INTERFACE_NAME);
        String interfaceName = nameTree.getChild(0).getText();
        if (interfaceName.equals(pureClassName)) {
            mainInterface = childTree;
        } else {
            projectContext.newClass("I" + interfaceName, null);
            projectContext.addImports(interfaceName, packageName + "." + className + "." + projectContext.classCtx.className());
            projectContext.addImports("I" + interfaceName, packageName + "." + className + "." + projectContext.classCtx.className());
            process_interface(projectContext, childTree, addCb, true, true, cb);
        }
        return mainInterface;
    }

    private static void process_interface(ProjectContext projectContext, CommonTree interfaceTree, ClassBuilder cb2, boolean finish, boolean innerClass, ClassBuilder cb) {
        h_process_interface1(cb2, interfaceTree, projectContext, innerClass, cb);

        process_interface_body(cb2.sb(), interfaceTree, projectContext, false);

        if (finish) {
            cb2.a("\n}\n");
        }
    }

    private static void process_interface_body(StringBuilder sb2, CommonTree tree, ProjectContext projectContext, boolean skipInterface) {
        String currentGroupModifier = "";
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjchParser.FIELD:
                    // todo: must be static!
                    h_process_field(sb2, (CommonTree) child, projectContext, currentGroupModifier, skipInterface);
                    break;
                case ObjchParser.GROUP_MODIFIER:
                    currentGroupModifier = childTree.getChild(0).toString().substring(1);
                    break;
                case ObjchParser.TYPEDEF:
                    h_process_typedef(sb2, childTree, projectContext);
                    break;
                case ObjchParser.PROTOCOL:
                    h_process_protocol(sb2, childTree, projectContext);
                    break;
                case ObjchParser.INTERFACE:
                    if (!skipInterface) {
                        h_process_interface2(sb2, childTree, projectContext);
                    }
                    break;
                case ObjchParser.FIELDS:
                    h_process_fields(sb2, (CommonTree) child, projectContext, currentGroupModifier);
                    break;
                case ObjchParser.METHOD:
                    h_process_method(sb2, (CommonTree) child, projectContext);
                    break;
                case ObjchParser.EXTERN:
                    h_process_extern(sb2, childTree, projectContext);
                    break;
                case ObjchParser.ENUM:
                    List<String[]> enumElements = h_parse_enum(childTree);
                    CommonTree enumNameTree = (CommonTree) childTree.getFirstChildWithType(ObjchParser.NAME);
                    if (enumNameTree != null) {
                        String enumName = enumNameTree.getChild(0).getText();
                        finish_enum(sb2, projectContext, enumName, enumElements);
                    } else {
                        for (String[] enumElement : enumElements) {
                            String element = enumElement[0].trim();
                            sb2.append("public static Integer ").append(element).append(" = ").append(enumElement[1]).append(";\n");
                            projectContext.staticFields.put(element, projectContext.classCtx.className());
                        }
                    }
                    break;
            }
        }
    }

    private static void h_process_extern(StringBuilder sb, CommonTree tree, ProjectContext projectCtx) {
        String type = "";
        String name = "";
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.FIELD_NAME:
                    name = ((CommonTree) child).getChild(0).toString();
                    break;
            }
        }

        name = name.trim();
        if (!name.isEmpty()) {
            projectCtx.staticFields.put(name, projectCtx.classCtx.className());
        }
        sb.append("\t").append("public static ").append(Utils.transformType(type, projectCtx.classCtx)).append(" ").append(name).append(";\n");
    }

    private static void h_process_method(StringBuilder sb, CommonTree tree, ProjectContext projectCtx) {
        String type = "";
        String name = "";
        String modifier;
        Map<String, String> params = new LinkedHashMap<>();
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.MODIFIER:
                    modifier = ((CommonTree) child).getChild(0).toString();
                    if (modifier.equals("+")) return; // static методы не описываем в интерфейсе!
                    break;
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.METHOD_NAME:
                    name = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.METHOD_PARAMS:
                    h_process_method_params(params, (CommonTree) child, projectCtx);
                    break;
            }
        }
        String transType = Utils.transformType(type, projectCtx.classCtx);
        sb.append("\t").append("public ").append(transType).append(" ").append(projectCtx.classCtx.categoryName != null ? "_" + projectCtx.classCtx.categoryName + "_" : "").append(name).append("(");
        boolean f = true;
        for (String pName : params.keySet()) {
            if (!f) {
                sb.append(", ");
            } else {
                f = false;
            }
            sb.append(params.get(pName)).append(" ").append(pName);
        }
        sb.append(") { return ").append(transType.equals("void") ? "" : (transType.equals("boolean") ? "false" : "null")).append(";\n};\n");
    }

    private static void h_process_method_params(Map<String, String> params, CommonTree tree, ProjectContext projectContext) {
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.METHOD_PARAM:
                    h_process_method_param(params, (CommonTree) child, projectContext);
                    break;
            }
        }
    }

    private static void h_process_method_param(Map<String, String> params, CommonTree tree, ProjectContext projectCtx) {
        String type = "";
        String name = "";
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.PARAM_NAME:
                    name = ((CommonTree) child).getChild(0).toString();
                    break;
            }
        }
        params.put(name, Utils.transformType(type, projectCtx.classCtx));
    }

    private static void h_process_interface1(ClassBuilder cb1, CommonTree tree, ProjectContext context, boolean innerClass, ClassBuilder cb2) {
        String interfaceName = "";
        String superclassName = "NSObject";
        String category = "";
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.CATEGORY:
                    category = ((CommonTree) child).getChild(0).toString();
                    // TODO: use category
                    break;
                case ObjchParser.INTERFACE_NAME:
                    interfaceName = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.SUPERCLASS_NAME:
                    superclassName = ((CommonTree) child).getChild(0).toString();
                    break;
            }
        }

        if (superclassName.length() > 0 && !superclassName.startsWith("NS")) {
            // add import of that class:
            Set<String> superClassPathList = context.imports.get(superclassName);
            if (superClassPathList != null) {
                for (String superClassPath : superClassPathList) {
                    if (superClassPath != null) cb2.addImport(superClassPath);
                }
            }
        }

        cb1.abstractClass(innerClass, true, interfaceName, superclassName);

    }

    private static void h_process_protocol(StringBuilder sb, CommonTree tree, ProjectContext projectContext) {
        String interfaceName = "";
        StringBuilder bodySb = new StringBuilder();
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.NAME:
                    interfaceName = ((CommonTree) child).getChild(0).getText().trim();
                    break;
                case ObjchParser.FIELDS:
                    h_process_fields(bodySb, (CommonTree) child, projectContext, "protected");
                    break;
                case ObjchParser.METHOD:
                    h_process_method(bodySb, (CommonTree) child, projectContext);
                    break;
            }
        }

        sb.append("\tpublic abstract class ").append(interfaceName).append(" extends NSObject").append(" {\n");
        sb.append(bodySb);
        sb.append("\t\n}\n");

    }

    private static void h_process_interface2(StringBuilder sb, CommonTree tree, ProjectContext projectContext) {
        String currentGroupModifier = "";
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.GROUP_MODIFIER:
                    currentGroupModifier = ((CommonTree) child).getChild(0).toString().substring(1);
                    break;
                case ObjchParser.FIELDS:
                    h_process_fields(sb, (CommonTree) child, projectContext, currentGroupModifier);
                    break;
                case ObjchParser.METHOD:
                    h_process_method(sb, (CommonTree) child, projectContext);
                    break;
            }
        }

    }

    private static void h_process_fields(StringBuilder sb, CommonTree tree, ProjectContext projectContext, String currentGroupModifier) {
        sb.append("\n");
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.FIELD:
                    h_process_field(sb, (CommonTree) child, projectContext, currentGroupModifier, false);
                    break;
            }
        }
        sb.append("\n");
    }

    private static void h_process_field(StringBuilder sb, CommonTree tree, ProjectContext projectCtx, String currentGroupModifier, boolean isStatic) {
        String type = "";
        List<String> fieldNameList = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.FIELD_NAME:
                    fieldNameList.add(((CommonTree) child).getChild(0).toString());
                    break;
            }
        }
        String transformedType = Utils.transformType(type, projectCtx.classCtx);
        sb.append("\t").append(currentGroupModifier).append(isStatic ? "static " : "").append(" ").append(transformedType).append(" ");
        boolean f = true;
        for (String fieldName : fieldNameList) {
            if (!f) {
                sb.append(", ");
            }
            f = false;
            sb.append(fieldName).append(" = ").append(Utils.getDefaultValue(transformedType));
        }
        sb.append(";\n");
    }

    private static void h_process_typedef(StringBuilder sb, CommonTree tree, ProjectContext projectCtx) {
        Set<String> names = new HashSet<>();
        String oldName = "";
        int typedef_type = UNDEFINED_TYPEDEF;
        List<String[]> enumElements = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPEDEF_NAME:
                    names.add(((CommonTree) child).getChild(0).getText().trim());
                    break;
                case ObjchParser.TYPEDEF_ELEMENT:
                    enumElements.add(new String[]{((CommonTree) child).getChild(0).toString()});
                    break;
                case ObjchParser.OLD_NAME:
                    oldName = ((CommonTree) child).getChild(0).toString();
                    typedef_type = RENAME_TYPEDEF;
                    break;
                case ObjchParser.ENUM:
                    enumElements = h_parse_enum((CommonTree) child);
                    typedef_type = ENUM_TYPEDEF;
                    break;
                case ObjchParser.STRUCT:
                    CommonTree typedefNameTree = (CommonTree) ((CommonTree) child).getFirstChildWithType(ObjchParser.TYPEDEF_NAME);
                    if (typedefNameTree != null) {
                        names.add(typedefNameTree.getChild(0).getText().trim());
                    }
                    typedefNameTree = (CommonTree) ((CommonTree) child).getFirstChildWithType(ObjchParser.NAME);
                    if (typedefNameTree != null) {
                        names.add(typedefNameTree.getChild(0).getText().trim());
                    }
                    enumElements = h_parse_struct((CommonTree) child, projectCtx);
                    typedef_type = STRUCT_TYPEDEF;
                    break;
            }
        }
        sb.append("\n");
        names.remove(null);
        names.remove("");
        if (names.isEmpty() && !oldName.isEmpty()) names.add(oldName);
        String name = !names.isEmpty() ? names.iterator().next() : "";
        if (typedef_type == ENUM_TYPEDEF) {
            finish_enum(sb, projectCtx, name, enumElements);
        } else if (typedef_type == RENAME_TYPEDEF) {
            sb.append("\tpublic static class ").append(name).append(" extends ").append(oldName).append(" { }");
        } else if (typedef_type == STRUCT_TYPEDEF) {
            sb.append("\tpublic static class ").append(name).append(" {\n");
            for (String[] field : enumElements) {
                sb.append("\t\t").append(field[0]);
            }
            sb.append("\t}\n");
        }
    }

    private static void finish_enum(StringBuilder sb, ProjectContext projectContext, String name, List<String[]> enumElements) {

        sb.append("\tpublic enum ").append(name).append(" {\n");
        for (int i = 0, enumElementsSize = enumElements.size(); i < enumElementsSize; i++) {
            String element = enumElements.get(i)[0];
            sb.append("\t\t").append(element);
            projectContext.staticFields.put(element, projectContext.classCtx.className() + "." + name);
            if (i < enumElementsSize - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }
        sb.append("\t").append("}\n");

        List<String> enums = projectContext.headerEnums.get(projectContext.classCtx.className);
        if (enums == null) {
            enums = new ArrayList<>();
            projectContext.headerEnums.put(projectContext.classCtx.className, enums);
        }
        enums.add(name);
    }

    private static List<String[]> h_parse_struct(CommonTree tree, ProjectContext projectCtx) {
        List<String[]> fields = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.FIELD:
                    fields.add(new String[]{h_parse_field((CommonTree) child, projectCtx)});
                    break;
            }
        }
        return fields;
    }

    private static String h_parse_field(CommonTree tree, ProjectContext projectCtx) {
        String type = "";
        String name = "";
        for (Object child : tree.getChildren()) {
            switch (((CommonTree) child).token.getType()) {
                case ObjchParser.TYPE:
                    type = ((CommonTree) child).getChild(0).toString();
                    break;
                case ObjchParser.FIELD_NAME:
                    name = ((CommonTree) child).getChild(0).toString();
                    break;
            }
        }
        return Utils.transformType(type, projectCtx.classCtx) + " " + name + ";\n";
    }

    private static List<String[]> h_parse_enum(CommonTree tree) {
        List<String[]> enumElements = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            CommonTree childTree = (CommonTree) child;
            switch (childTree.token.getType()) {
                case ObjchParser.TYPEDEF_ELEMENT:
                    String id = childTree.getChild(0).toString();
                    String value = null;
                    Tree nameTree = childTree.getFirstChildWithType(ObjchLexer.VALUE);
                    if (nameTree != null) {
                        value = nameTree.getChild(0).getText();
                    }
                    enumElements.add(new String[]{id, value});
                    break;
            }
        }
        return enumElements;
    }
}
