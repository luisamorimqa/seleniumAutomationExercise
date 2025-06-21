package pages;

import runner.RunCucumber;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class BasePage extends RunCucumber {

    public String getBaseUrl() {
        Properties properties = new Properties();

        try(InputStream input = new FileInputStream("src/test/resources/credentials.properties")) {
            properties.load(input);
            return properties.getProperty("baseUrl");
        }
        catch (Exception exception) {
            return String.valueOf(exception);
        }
    }
}