import java.util.Scanner;

public class NameManagementProgram {
    public static String formatString(String name) {
        return name.toUpperCase().charAt(1) + "." + name.substring(name.length() -2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String name1 = formatString(scanner.nextLine());

        System.out.print("Enter the second name: ");
        String name2 = formatString(scanner.nextLine());

        System.out.print("Enter the third name: ");
        String name3 = formatString(scanner.nextLine());

        System.out.println(name1 + "_" + name2 + "_" + name3);
    }
}