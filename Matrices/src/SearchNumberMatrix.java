import java.util.Scanner;

public class SearchNumberMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }

        for (int[] row: matrix) {
            for (int value: row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }

        boolean wasFound = false;

        System.out.print("Enter the number to search for: ");
        int number = scanner.nextInt();

        seeker: for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == number) {
                    System.out.println("The number " + number + " is in the position [" + i + "][" + j + "]");

                    wasFound = true;

                    break seeker;
                }
            }
        }

        if(!wasFound) System.out.println("Number not found");
    }
}
