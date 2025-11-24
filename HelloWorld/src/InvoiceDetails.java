import java.util.Scanner;

public class InvoiceDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the invoice name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the price of the first product: ");
        double price1 = scanner.nextDouble();

        System.out.print("Enter the price of the second price: ");
        double price2 = scanner.nextDouble();

        double subtotal = price1 + price2;
        double tax = subtotal * .19;
        double total = subtotal * 1.19;

        String message = "The invoice" + name +
                "has a gross total of " + subtotal +
                ", with a tax of " + tax +
                "  and the amount after tax is " + total;

        System.out.print(message);
    }
}