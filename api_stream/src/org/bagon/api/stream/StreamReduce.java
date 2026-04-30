package org.bagon.api.stream;

import com.sun.tools.javac.Main;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduce {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Diego Bautista", "Gerardo Flores", "Fernando Huerta", "Diego Bautista", "Marcos Lopéz", "Pepe González", "Diego Bautista")
            .distinct();
        String res = names.reduce("", (a, b) -> a + b +  " - ");
        System.out.println(res);

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        IntStream numbers2 = IntStream.range(1, (int) (Math.random() * 15)).peek(System.out::println);
        int res2 = numbers.reduce(0, Integer::sum);
        System.out.println("res2 = " + res2);

        IntSummaryStatistics stats = numbers2.summaryStatistics();
        System.out.println("Max -> " + stats.getMax());
        System.out.println("Min -> " + stats.getMin());
        System.out.println("Sum -> " + stats.getSum());
        System.out.println("Average -> " + stats.getAverage());
        System.out.println("Count -> " + stats.getCount());
    }
}