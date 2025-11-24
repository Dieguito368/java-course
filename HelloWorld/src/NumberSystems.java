import javax.swing.*;

public class NumberSystems {
    public static void main(String[] args) {
        try {
            String stringNumber = JOptionPane.showInputDialog(null, "Enter an integer: ");
            int number = Integer.parseInt(stringNumber);

            String decimalString = "Decimal number: " + number;
            String binaryString = "Binary number: " + Integer.toBinaryString(number);
            String octalString = "Octal number: " + Integer.toOctalString(number);
            String hexadecimalString = "Hexadecimal number: " + Integer.toHexString(number);

            String message = decimalString + "\n" + binaryString + "\n" + octalString + "\n" + hexadecimalString;

            JOptionPane.showMessageDialog(null, message);

            int binaryNumber = 0b111110100;
            System.out.println("binaryNumber = " + binaryNumber);

            int octalNumber = 0764;
            System.out.println("octalNumber = " + octalNumber);

            int hexadecimalNumber = 0x1f4;
            System.out.println("octalNumber = " + hexadecimalNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Invalid number");

            main(args);
        }
    }
}