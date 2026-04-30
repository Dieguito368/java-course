package org.bagon.api.stream;

import org.bagon.api.stream.model.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSumExercise {
    public static void main(String[] args) {
        IntStream lengths = Stream.of("Diego Bautista", "Ernesto Mendez", "Paola Gutierrez", "Sara González", "Hugo Dominguez", "Diego Bautista")
            .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
            .distinct()
            .mapToInt(User::getId)
            .peek(System.out::println);

        // lengths.forEach(System.out::println);

        IntSummaryStatistics stats = lengths.summaryStatistics();
        System.out.println("Max -> " + stats.getMax());
        System.out.println("Min -> " + stats.getMin());
        System.out.println("Sum -> " + stats.getSum());
        System.out.println("Average -> " + stats.getAverage());
        System.out.println("Count -> " + stats.getCount());
    }
}