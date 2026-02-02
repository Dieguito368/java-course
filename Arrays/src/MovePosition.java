import java.util.Scanner;

public class MovePosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter the number of positions to shift in the array: ");
        int numberPositions = scanner.nextInt();
        int[] temp = new int[numberPositions];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println();

        for (int i = 0; i < numberPositions; i++) {
            temp[i] = numbers[numbers.length - numberPositions + i];
        }

        for (int i = numbers.length - numberPositions - 1; i >= 0; i--) {
            numbers[i + numberPositions] = numbers[i];
        }

        for (int i = 0; i < numberPositions; i++) {
            numbers[i] = temp[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}

