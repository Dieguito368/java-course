import java.util.InputMismatchException;
import java.util.Scanner;

public class TerminalScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            String decimalString = "Decimal number: " + number;
            String binaryString = "Binary number: " + Integer.toBinaryString(number);
            String octalString = "Octal number: " + Integer.toOctalString(number);
            String hexadecimalString = "Hexadecimal number: " + Integer.toHexString(number);

            String message = decimalString + "\n" + binaryString + "\n" + octalString + "\n" + hexadecimalString;

            System.out.println(message);

            System.out.println();

            int binaryNumber = 0b111110100;
            System.out.println("binaryNumber = " + binaryNumber);

            int octalNumber = 0764;
            System.out.println("octalNumber = " + octalNumber);

            int hexadecimalNumber = 0x1f4;
            System.out.println("octalNumber = " + hexadecimalNumber);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid number\n");

            main(args);
        }
    }
}
