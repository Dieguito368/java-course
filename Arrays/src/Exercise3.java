import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number: ");
            numbers[i] = scanner.nextInt();
        }

        int positiveCounter = 0;
        int negativeCounter = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        int numberZeros = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                positiveSum += numbers[i];
                positiveCounter++;
            } else if(numbers[i] < 0) {
                negativeSum += numbers[i];
                negativeCounter++;
            } else {
                numberZeros++;
            }
        }

        if (positiveCounter > 0) {
            System.out.println("Average of positives: " + ((float) positiveSum / positiveCounter));
        } else {
            System.out.println("There are no positive numbers");
        }

        if (negativeCounter > 0) {
            System.out.println("Average of negatives: " + ((float) negativeSum / negativeCounter));
        } else {
            System.out.println("There are no negative numbers");
        }

        System.out.println("Number of zeros: " + numberZeros);
    }
}
