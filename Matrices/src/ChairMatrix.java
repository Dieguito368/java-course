import java.util.Scanner;

public class ChairMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the matrix size: ");
        int size = scanner.nextInt();

        if(size <= 2) {
            System.err.println("Error: The size of the array is very small. It must be ae minimum of 3");
            System.exit(1);
        }

        int[][] matrix = new int[size][size];

        int middle = size / 2;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j == 0 || i == middle || (i > middle && j == matrix.length - 1)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int[] row: matrix) {
            for (int value: row) {
                System.out.print(value);
            }

            System.out.println();
        }
    }
}
