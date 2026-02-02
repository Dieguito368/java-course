import java.util.Scanner;

public class PrintX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the matrix size: ");
        int size = scanner.nextInt();

        String[][] matrix = new String[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j || j == (matrix.length - 1 - i)) {
                    matrix[i][j] = "X";
                } else {
                    matrix[i][j] = "_";
                }
            }
        }

        for (String[] row: matrix) {
            for (String value: row) {
                System.out.print(value);
            }

            System.out.println();
        }
    }
}
