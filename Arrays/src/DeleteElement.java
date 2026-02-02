import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.print("Enter the number to delete: ");
        int number = scanner.nextInt();

        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if(number == numbers[i]) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("Number not found");
            return;
        }

        for (int i = position; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        int[] numbers2 = new int[numbers.length - 1];

        System.arraycopy(numbers, 0, numbers2, 0, numbers2.length);

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("numbers2[" + i + "] = " + numbers2[i]);
        }
    }
}
