import java.io.IOException;

public class RunOSProgram {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process process;

        try {
            if(System.getProperty("os.name").startsWith("Windows")) {
                process = rt.exec("notepad");
            } else {
                process = rt.exec("gedit");
            }

            process.waitFor();
        } catch (IOException e) {
            System.err.println("Error de IO: " + e.getMessage());
            System.exit(1);

        } catch (InterruptedException e) {
            System.err.println("Interrupted process");
            Thread.currentThread().interrupt();
            System.exit(1);
        }

        System.out.println("The editor has been closed");
        System.exit(0);
    }
}
