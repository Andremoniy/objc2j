package ru.andremoniy.objctojavacnv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.andremoniy.objctojavacnv.antlr.Macros;
import ru.andremoniy.objctojavacnv.context.ProjectContext;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * User: Andremoniy
 * Date: 18.06.12
 * Time: 9:35
 */
public final class Converter {

    public static final Logger log = LoggerFactory.getLogger(Converter.class);

    public static final boolean NOT_IFS = false;
    public static final boolean ONLY_IFS = true;
    public static final int HEADER_FILES = 0;
    public static final int M_FILES = 1;

    private Converter() {
    }

    public static boolean preprocess(ProjectContext projectContext, String rootPath, String path, List<String> processedImports, boolean onlyIfs) {
        File dir = new File(path);
        for (File f : dir.listFiles()) {
            if (!f.isDirectory()) {
                if (f.getName().endsWith(".m") || f.getName().endsWith(".h")) {
                    try {
                        boolean wasIfs = Preprocessor.preprocessFile(projectContext, f.getAbsolutePath(), processedImports, onlyIfs, rootPath);
                        if (wasIfs) return true;
                    } catch (Exception e) {
                        log.info("Failed to preprocess file: " + f.getAbsolutePath());
                        log.error(e.getMessage(), e);
                    }
                }
            } else {
                preprocess(projectContext, rootPath, f.getAbsolutePath(), processedImports, onlyIfs);
                log.info(f.getAbsolutePath() + " preprocessed...");
            }
        }
        return false;
    }

    /**
     * Run converter on given project path
     *
     * @param path    project path
     * @param skipSDK skip SDK // TODO: description
     * @return project context
     * @throws IOException
     */
    public static ProjectContext convert(String path, boolean skipSDK) throws IOException {
        ProjectContext projectContext = new ProjectContext(skipSDK);
        projectContext.load();

        List<String> processedImports = new ArrayList<>();
        do {
            preprocess(projectContext, path, path, processedImports, NOT_IFS);
        } while (preprocess(projectContext, path, path, processedImports, ONLY_IFS));

        // add special macroses:
        // todo: customization
        for (int i = 0; i <= 6; i++) {
            addDefaultMacrosItem(projectContext, "DEPRECATED_IN_MAC_OS_X_VERSION_10_" + i + "_AND_LATER");
            addDefaultMacrosItem(projectContext, "AVAILABLE_MAC_OS_X_VERSION_10_" + i + "_AND_LATER");
        }

        convertInternal(projectContext, path, HEADER_FILES); // convert header-files firstly

        // converting in two steps-through for full macros & imports covering
        for (int i = 0; i < 2; i++)
            convertInternal(projectContext, path, M_FILES); // convert m-files

        return projectContext;
    }

    private static void addDefaultMacrosItem(ProjectContext projectContext, String key) {
        projectContext.macrosMap.put(key, Arrays.asList(new Macros(key, "")));
    }

    private static void convertInternal(ProjectContext projectContext, String path, int whatConvert) {
        File dir = new File(path);
        List<File> files = Arrays.asList(dir.listFiles());

        // header-files
        if (whatConvert == HEADER_FILES) {
            for (File f : files) {
                if (f.getName().endsWith(".h")) {
                    if (f.getName().contains("+")) {
                        log.info(f.getAbsolutePath() + " skipped due to '+' in name...");
                        continue;
                    }
                    try {
                        log.info(f.getAbsolutePath() + " converting...");
                        ConverterH.convert_h(f.getAbsolutePath(), projectContext, null, null);
                        log.info(f.getAbsolutePath() + " converted ("+ projectContext.h_counter + " headers converted).");
                    } catch (Exception e) {
                        log.info("Error converting " + f.getAbsolutePath());
                        log.error(e.getMessage(), e);
                    }
                }
            }
        } else {
            // m-files
            for (File f : files) {
                if (f.getName().endsWith(".m")) {
                    if (f.getName().contains("+")) {
                        log.info(f.getAbsolutePath() + " skipped due to '+' in name...");
                        continue;
                    }
                    try {
                        log.info(f.getAbsolutePath() + " converting...");
                        ConverterM.convert_m(f.getAbsolutePath(), projectContext, new StringBuilder());
                        log.info(f.getAbsolutePath() + " converted.");
                    } catch (Exception e) {
                        log.info("Error converting " + f.getAbsolutePath());
                        log.error(e.getMessage(), e);
                    }
                }
            }
        }

        // subdirectories
        for (File f : files) {
            if (f.isDirectory()) {
                convertInternal(projectContext, f.getAbsolutePath(), whatConvert);
                log.info(f.getAbsolutePath() + " converted.");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java -jar objc2j.jar <project_path>\n-where <project_path> - root directory with your Objective-C project.");
            System.exit(1);
        }
        if (!new File("converter.properties").exists()) {
            System.out.println("You should create 'converter.properties' file and place there path to MacOSX.sdk");
            System.exit(1);
        }
        String projectPath = args[0];
        File convDir = new File(args[0]);
        if (!convDir.exists() || !convDir.isDirectory()) {
            System.out.println("Invalid <project_path> value: " + projectPath);
            System.exit(1);
        }
        ConverterProperties properties = ConverterProperties.PROPERTIES; // just for initialize

        Converter.convert(projectPath, false);
    }

}
