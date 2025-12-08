import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();

        users.put("diego368", "13112002");
        users.put("ivone439", "11102004");
        users.put("nancy297", "30062008");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isAuthenticated = users.containsKey(username) && users.get(username).equals(password);

        System.out.println(isAuthenticated ? "Welcome " + username + "!" : "Incorrect credentials");
    }
}