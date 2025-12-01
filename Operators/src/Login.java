import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String credentialUsername = "diego368";
        String credentialPassword = "13112002D";

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = username.equals(credentialUsername) && password.equals(credentialPassword);

        if (!isAuthenticated) {
            System.out.println("Incorrect credentials");

            return;
        }

        System.out.println("Welcome " + username + "!");
    }
}