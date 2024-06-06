import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class SetPropertiesExample {

    public static void main(String[] args) {
        Properties properties = new Properties();
        String fileName = "config1.properties";

        // Setting properties
        properties.setProperty("browser", "Chrome");
        properties.setProperty("url", "www.google.com");
        properties.setProperty("username", "user");
        properties.setProperty("password", "pass123");

        // Save properties to file
        try (OutputStream output = new FileOutputStream("src/" + fileName)) {
            properties.store(output, null);
            System.out.println("Properties file created and properties set.");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
