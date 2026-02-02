public class OptimizedBubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] numbers = { 5, 4, 1, 2, 3, 8, 9, 6, 7 };

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean flag = true;

            for (int j = 0; j < numbers.length - 1 - i; j++) {
                System.out.println("numbers[" + j + "] = " + numbers[j] + " -> numbers[" + (j + 1) + "] = " + numbers[j + 1]);

                if(numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j];

                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;

                    flag = false;
                }

                String str = "";

                for (int number: numbers) {
                    str += number + ", ";
                }

                System.out.println(str);

                count++;
            }

            if(flag) break;
        }

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("count = " + count);
    }
}
