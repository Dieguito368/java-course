package org.bagon.api.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Diego", "Juan", "Marcos", "Pepe", "Daniela")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);

        List<String> list = names.toList();
        list.forEach(System.out::println);
    }
}