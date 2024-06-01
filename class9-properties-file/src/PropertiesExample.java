import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesExample {


    public static void main(String[] args) {
        Properties properties = new Properties();

        // Get directory of project
        // e.g. C:\Users\Nehal\Desktop\list\graduates-workshop\class9-properties-file
        String filePath = System.getProperty("user.dir");

        String fileName = "config.properties";
        try (InputStream input = new FileInputStream(filePath + "/src/" + fileName)) {
            // Load properties file
            properties.load(input);

            // Get properties
            String browserName = properties.getProperty("browser");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            // Print properties
            System.out.println("Browser Name : " + browserName);
            System.out.println("URL: " + url);
            System.out.println("Username: " + username);
            System.out.println("Password : " + password);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
