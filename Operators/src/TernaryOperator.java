import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  variable = 7 == 5 ? "It is the same" : "It is not the same";

        System.out.println("variable = " + variable);

        double math = 0.0;
        double sciences = 0.0;
        double history = 0.0;

        System.out.print("Math: ");
        math = scanner.nextDouble();

        System.out.print("Sciences: ");
        sciences = scanner.nextDouble();

        System.out.print("History: ");
        history = scanner.nextDouble();

        double average = (math + sciences + history) / 3;

        String isApproved = average >= 7 ? "Approved" : "Failed";

        System.out.println("average = " + average);
        System.out.println("isApproved = " + isApproved);
    }
}
