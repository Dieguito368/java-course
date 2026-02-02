public class SumRowsColumnsMatrix {
    public static void printMatrix(String title, int[][] matrix) {
        System.out.println(title);

        for (int[] row: matrix) {
            for (int value: row) {
                System.out.print(value + "\t");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        printMatrix("Matrix", matrix);

        for (int i = 0; i < matrix.length; i++) {
            int sumRows = 0;
            int sumColumns = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                sumRows += matrix[i][j];
                sumColumns += matrix[j][i];
            }

            System.out.println("Sum of row " + i + ": " + sumRows);
            System.out.println("Sum of column " + i + ": " + sumColumns);
        }

    }
}
