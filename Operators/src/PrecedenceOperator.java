public class PrecedenceOperator {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;

        double total;

        total = ((double)(i + j + j + k) * 10) / 3;
        System.out.println("total = " + total);

        total = ((double)(i++ + j--) + (4 * 2)) / 100;
        System.out.println("total = " + total);
    }
}