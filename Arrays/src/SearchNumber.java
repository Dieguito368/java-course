import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = (int) (Math.random() * 33);

        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.print("Enter the number to search for: ");
        int number = scanner.nextInt();

        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == number) {
                position = i;

                break;
            }
        }

        if(position != -1) {
            System.out.println("The number " + number + " is in position " + position);
        } else {
            System.out.println("The number " + number + " is not in the array");
        }
    }
}
