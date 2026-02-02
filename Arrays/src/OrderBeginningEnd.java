public class OrderBeginningEnd {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] res = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int aux = 0;

        for (int i = 0; i < numbers.length - i; i++) {
            res[aux++] = numbers[i];
            res[aux++] = numbers[numbers.length - 1 - i];
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println("res[" + i + "] = " + res[i]);
        }
    }
}
