import java.util.Map;

public class EnvironmentVariables {
    public static void main(String[] args) {
        Map<String, String> envVar = System.getenv();

        System.out.println("envVar = " + envVar);
        System.out.println("System.getenv(\"USERNAME\") = " + System.getenv("USERNAME"));
        System.out.println("System.getenv(\"JAVA_HOME\") = " + System.getenv("JAVA_HOME"));


        System.out.println("envVar.get(\"TEMP\") = " + envVar.get("TEMP"));
        System.out.println("envVar.get(\"Path\") = " + envVar.get("Path"));

        for(String key: envVar.keySet()) {
            System.out.println(key + " => " + System.getenv(key));
        }
    }
}
