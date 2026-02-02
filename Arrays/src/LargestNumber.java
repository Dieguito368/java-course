import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int sizeArray = scanner.nextInt();

        int[] numbers = new int[sizeArray];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number: ");
            numbers[i] = scanner.nextInt();
        }

        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            max = (numbers[max] > numbers[i]) ? max : i;
        }

        System.out.println("The largest number is: " + numbers[max]);
    }
}
