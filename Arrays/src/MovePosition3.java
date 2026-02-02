import java.util.ArrayList;
import java.util.Scanner;

public class MovePosition3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = (i + 1) * 6;
        }

        int position = 0;

        System.out.print("Enter the number to insert into the array: ");
        int numberInsert = scanner.nextInt();

        for (int i = 0; i < numbers.length - 1; i++) {
            if(numberInsert <= numbers[i]) {
                break;
            }

            position++;
        }

        for (int i = numbers.length - 2; i >= position; i--) {
            numbers[i + 1] = numbers[i];
        }

        numbers[position] = numberInsert;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
