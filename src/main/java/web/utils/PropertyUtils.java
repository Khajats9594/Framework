package web.utils;

import web.enums.ConfigProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropertyUtils {

    private PropertyUtils(){}

    private static final Map<String,String>CONFIGMAP = new HashMap<>();
    private static final Properties property = new Properties();

    static {
        try(FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config-files/config.properties")){
            property.load(fis);
            for (Map.Entry<Object, Object> entry : property.entrySet()) {
                CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim()); //remove the trailing and leading spaces
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
    public static String get(ConfigProperties key)  {
        if (Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
            throw new RuntimeException("Property name " + key + " is not found. Please check config.properties");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }
}
