public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers = new int[12];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 6) + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        int[] frequencies = new int[6];

        for (int num: numbers) {
            frequencies[num - 1]++;
        }

        for (int i = 0; i < frequencies.length; i++) {
            System.out.print((i + 1) + ": ");

            for (int j = 0; j < frequencies[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
