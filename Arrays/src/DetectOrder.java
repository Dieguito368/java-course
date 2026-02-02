import java.util.Scanner;

public class DetectOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number: ");
            numbers[i] = scanner.nextInt();
        }

        boolean upward = false;
        boolean falling = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] > numbers[i + 1]) {
                falling = true;
            }

            if(numbers[i] < numbers[i + 1]) {
                upward = true;
            }
        }

        if(upward && falling) {
            System.out.println("The list is out of order");
        } else if(!upward && !falling) {
            System.out.println("All numbers are equal");
        } else if(upward) {
            System.out.println("The enumeration is in ascending order");
        } else {
            System.out.println("The enumeration is in descending order");
        }
    }
}
