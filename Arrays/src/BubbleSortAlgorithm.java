public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] numbers = { 45, 19, 98, 14, 39, 60 };

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("numbers[" + i + "] = " + numbers[i] + " -> numbers[" + j + "] = " + numbers[j]);

                if(numbers[i] < numbers[j]) {
                    int aux = numbers[i];

                    numbers[i] = numbers[j];
                    numbers[j] = aux;
                }

                String str = "";

                for (int number: numbers) {
                    str += number + ", ";
                }

                System.out.println(str);

                count++;
            }
        }

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("count = " + count);
    }
}
