public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 9) + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        int mostRepeated = numbers[0];
        int numberTimes = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if(count > numberTimes) {
                mostRepeated = numbers[i];
                numberTimes = count;
            }
        }

        System.out.println("The number that is repeated most often is the " + mostRepeated);
        System.out.println("Repeat " + numberTimes + " times");
    }
}