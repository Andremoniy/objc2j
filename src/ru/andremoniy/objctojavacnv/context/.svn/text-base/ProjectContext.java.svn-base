package ru.andremoniy.objctojavacnv.context;

import com.csvreader.CsvReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.andremoniy.objctojavacnv.antlr.Macros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * User: Andremoniy
 * Date: 05.10.12
 * Time: 9:03
 */
public class ProjectContext extends AbstractContext {
    public static final Logger log = LoggerFactory.getLogger(ProjectContext.class);

    public ClassContext classCtx;

    // #define ...
    public Map<String, List<Macros>> macrosMap = new HashMap<String, List<Macros>>();

    // classname on its package
    public Map<String, Set<String>> imports = new HashMap<>();

    // header-class-name on list of its enums
    public Map<String, List<String>> headerEnums = new HashMap<>();

    // хранит карту категорий для каждого класса
    public Map<String, Set<String>> categories = new HashMap<>();

    public Map<String, Map<String, MethodInterface>> methodsInterfaces = new HashMap<>();

    // static field name on its classname
    public Map<String, String> staticFields = new HashMap<>();

    public int m_counter;
    public int h_counter;
    private boolean skipSDK;

    public ProjectContext() {
    }

    public ProjectContext(boolean skipSDK) {
        this.skipSDK = skipSDK;
    }

    public ClassContext newClass(String className, String categoryName) {
        Map<String, MethodInterface> classMethodsInterfaces = new HashMap<>();
        methodsInterfaces.put(className, classMethodsInterfaces);
        classCtx = new ClassContext(className, categoryName, this, classMethodsInterfaces);
        classCtx.variables.putAll(variables);
        return classCtx;
    }

    public ExpressionContext newExpr() {
        return classCtx.methodCtx.blockCtx.newExpr();
    }

    public void dump() throws IOException {
        try (FileWriter fw = new FileWriter("enums.csv")) {
            for (String _enum : headerEnums.keySet()) {
                fw.write(_enum + ";" + headerEnums.get(_enum) + "\n");
            }
        }
        try (FileWriter fw = new FileWriter("staticFields.csv")) {
            for (String staticField : staticFields.keySet()) {
                fw.write(staticField + ";" + staticFields.get(staticField) + "\n");
            }
        }
        try (FileWriter fw = new FileWriter("imports.csv")) {
            for (String className : imports.keySet()) {
                fw.write(className + ";" + imports.get(className) + "\n");
            }
        }
    }

    public void load() throws IOException {
        if (isSkipSDK()) return;
        try {
            loadEnums();
            loadStaticFields();
            loadImports();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void loadImports() throws IOException {
        try (FileReader fr = new FileReader("imports.csv");
             BufferedReader br = new BufferedReader(fr)) {
            CsvReader csv = new CsvReader(br, ';');
            while (csv.readRecord()) {
                String part0 = csv.get(0);
                String part1 = csv.get(1);
                Set<String> list = imports.get(part0);
                if (list == null) {
                    list = new HashSet<>();
                    imports.put(part0, list);
                }
                String classPathes[] = part1.substring(part1.indexOf("[") + 1, part1.lastIndexOf("]")).split(",");
                for (String classPath : classPathes) {
                    list.add(classPath.trim());
                }
            }
            csv.close();
        }
    }

    private void loadStaticFields() throws IOException {
        try (FileReader fr = new FileReader("staticFields.csv");
             BufferedReader br = new BufferedReader(fr)) {
            CsvReader csv = new CsvReader(br, ';');
            while (csv.readRecord()) {
                staticFields.put(csv.get(0), csv.get(1));
            }
            csv.close();
        }
    }

    private void loadEnums() throws IOException {
        try (FileReader fr = new FileReader("enums.csv");
             BufferedReader br = new BufferedReader(fr)) {
            CsvReader csv = new CsvReader(br, ';');
            while (csv.readRecord()) {
                String _enum = csv.get(0);
                String part1 = csv.get(1);
                String enumFields[] = part1.substring(part1.indexOf("[") + 1, part1.lastIndexOf("]")).split(",");
                List<String> enumFieldsList = new ArrayList<>();
                for (String enumField : enumFields) {
                    enumFieldsList.add(enumField.trim());
                }

                headerEnums.put(_enum, enumFieldsList);
            }
            csv.close();
        }
    }

    public void addImports(String className, String path) {
        Set<String> classPathes = imports.get(className);
        if (classPathes == null) {
            classPathes = new HashSet<>();
            imports.put(className, classPathes);
        }
        classPathes.add(path);
    }

    public boolean isSkipSDK() {
        return skipSDK;
    }

    public void setSkipSDK(boolean skipSDK) {
        this.skipSDK = skipSDK;
    }
}
