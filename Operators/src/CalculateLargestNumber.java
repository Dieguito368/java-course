import java.util.Scanner;

public class CalculateLargestNumber {
    public static void main(String[] args) {
        int max = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();

        max = first > second ? first : second;
        max = max > third ? max : third;

        System.out.println("max = " + max);
    }
}
