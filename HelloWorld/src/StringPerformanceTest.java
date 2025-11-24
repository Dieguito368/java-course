public class StringPerformanceTest {
    public static long measureTime(Runnable task) {
        long start = System.currentTimeMillis();

        task.run();

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static void main(String[] args) {
        int iterators = 1000;

        long concatTime = measureTime(() -> {
            String numbers = "";

            for(int i = 1; i <= iterators; i++) {
                numbers = numbers.concat(String.valueOf(i)).concat("\n");
            }
        });

        System.out.println("Time using the concat method: " + concatTime + " ms");

        long plusTime = measureTime(() -> {
            String numbers2 = "";

            for(int i = 1; i <= iterators; i++) {
                numbers2 += i + "\n";
            }
        });

        System.out.println("Time using the addition operator: " + plusTime + " ms");

        long sbTime = measureTime(() -> {
            StringBuilder numbers3 = new StringBuilder();

            for(int i = 1; i <= iterators; i++) {
                numbers3.append(i).append("\n");
            }
        });

        System.out.println("Time using the StringBuilder class: " + sbTime + " ms");
    }
}