public class VariableSizeMatrices {
    public static void main(String[] args) {
        int[][] matrix = new int[3][];

        matrix[0] = new int[1];
        matrix[1] = new int[2];
        matrix[2] = new int[3];

        matrix[0][0] = 1;
        matrix[1][0] = 2;
        matrix[1][1] = 3;
        matrix[2][0] = 4;
        matrix[2][1] = 5;
        matrix[2][2] = 6;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }
    }
}