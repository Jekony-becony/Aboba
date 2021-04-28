package Aboba;

public class Config {
    private static final String configPath = "src/main/resources/config.properties";

    public static String browserName = PropertiesUtils.readProperties(configPath).getProperty("browser_name");
}
