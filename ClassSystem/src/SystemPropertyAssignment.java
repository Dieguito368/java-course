import java.io.FileInputStream;
import java.util.Properties;

public class SystemPropertyAssignment {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("src/config.properties");

            Properties properties = new Properties(System.getProperties());
            properties.load(file);
            properties.setProperty("custom", "value");

            System.setProperties(properties);

            System.getProperties().list(System.out);

            System.out.println("System.getProperty(\"custom\") = " + System.getProperty("custom"));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
