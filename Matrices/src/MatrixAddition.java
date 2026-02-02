public class MatrixAddition {
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
        int [][]a, b, c;

        a = new int[3][3];
        b = new int[3][3];
        c = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (i * 3 + 1) + j;
                b[i][j] = (i * 3 + 1) + j;
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        printMatrix("Matrix A", a);
        printMatrix("Matrix B", b);
        printMatrix("Matrix C", c);
    }
}
