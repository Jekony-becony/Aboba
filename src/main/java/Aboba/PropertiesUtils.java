package Aboba;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
    public static Properties readProperties(String path) {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(path)) {


            // load a properties file
            prop.load(input);

            // get the property value and print it out

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }
}

