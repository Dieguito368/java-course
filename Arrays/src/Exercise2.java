import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number: ");
            numbers[i] = scanner.nextInt();
        }

        int top = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > top) top = numbers[i];
        }

        System.out.println("The largest number is: " + top);
    }
}
