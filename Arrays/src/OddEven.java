import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers, odd, even;

        System.out.print("Enter the size array: ");
        numbers = new int[scanner.nextInt()];

        int evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round(Math.random() * 30);

            if(numbers[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        even = new int[evenCounter];
        odd = new int[oddCounter];

        evenCounter = 0;
        oddCounter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                even[evenCounter++] = numbers[i];
            } else {
                odd[oddCounter++] = numbers[i];
            }
        }

        System.out.println();

        System.out.println("Even");
        for (int number: even) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Odd");
        for (int number: odd) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}
