package ru.andremoniy.objctojavacnv;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * User: 1
 * Date: 05.02.13
 * Time: 10:15
 */
public enum ConverterProperties {

    PROPERTIES();

    public static final String FRAMEWORKS = "frameworks";
    public static final String ENCODING = "encoding";

    private Properties properties;

    private ConverterProperties() {
        try {
            properties = new Properties();
            properties.load(new FileInputStream("converter.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
