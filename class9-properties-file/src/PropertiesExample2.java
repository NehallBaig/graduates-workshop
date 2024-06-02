import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesExample2 {

    /**
     * To ensure your properties file is accessible in IntelliJ IDEA, you should place it in a directory
     * that is included in the classpath. A common practice is to place it in the src/main/resources directory
     * for a Maven or Gradle project, or simply src/resources for a basic project setup. IntelliJ automatically
     * includes this directory in the classpath.
     *
     * Here is a revised example that correctly addresses the properties file within IntelliJ IDEA:
     *
     * Project Structure:
     * MyProject
     * │
     * ├── src
     * │   ├── main
     * │   │   ├── java
     * │   │   └── resources
     * │   │       └── config.properties
     * │   └── test
     * │       ├── java
     * │       └── resources
     * └── pom.xml or build.gradle
     *
     * Properties File (src/main/resources/config.properties):
     * # config.properties
     * browser=Chrome
     * url=https://example.com
     * username=user
     * password=pass123
     *
     * The following Java code demonstrates how to correctly load the properties file using the class loader:
     */
    public static void main(String[] args) {
        Properties properties = new Properties();
        String fileName = "config.properties";

        // Using the class loader to find the properties file in the resources folder
        try (InputStream input = PropertiesExample.class.getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + fileName);
                return;
            }

            // Load properties file
            properties.load(input);

            // Get properties
            String browserName = properties.getProperty("browser");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            // Print properties
            System.out.println("Browser Name: " + browserName);
            System.out.println("URL: " + url);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
