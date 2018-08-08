package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    private java.util.Properties prop = new Properties();

    public PropertiesReader() {
        try {
            String propertiesFilePath = "endPoints" + ".properties";
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(propertiesFilePath);

            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String createPetUrl() {
        return prop.getProperty("createPet");
    }

}
