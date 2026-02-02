import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the matrix size: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(
                    i == 0 ||
                    i == matrix.length - 1 ||
                    j == 0 ||
                    j == matrix.length - 1 ||
                    j == i
                ) matrix[i][j] = 1;
            }
        }

        for (int[] row: matrix) {
            for (int value: row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }
}