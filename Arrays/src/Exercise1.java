import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number: ");
            numbers[i] = scanner.nextInt();
        }

        int[] array = new int[numbers.length];

        for (int i = 0; i < numbers.length / 2; i++) {
            array[i * 2] = numbers[numbers.length - i - 1];
            array[i * 2 + 1] = numbers[i];
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
