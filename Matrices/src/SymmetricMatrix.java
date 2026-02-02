public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 2, 6, 7, 8 },
                { 3, 7, 11, 15 },
                { 4, 8, 15, 16 }
        };

        boolean isSymmetrical = true;

        loop1:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetrical = false;
                    break loop1;
                }
            }
        }

        if(isSymmetrical) {
            System.out.println("It is symmetrical");
        } else {
            System.out.println("It is not symmetrical");
        }
    }
}