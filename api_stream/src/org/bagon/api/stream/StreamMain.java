package org.bagon.api.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("<-----  Form 1 ----->");
        Stream<String> names = Stream.of("Diego", "Juan", "Marcos", "Pepe");
        names.forEach(System.out::println);

        System.out.println("\n<-----  Form 2 ----->");
        String[] arr = { "Diego", "Juan", "Marcos", "Pepe" };
        Stream<String> names2 = Arrays.stream(arr);
        names2.forEach(System.out::println);

        System.out.println("\n<-----  Form 3 ----->");
        Stream<String> names3 = Stream.<String>builder().add("Diego").add("Juan").add("Marcos").add("Pepe").build();
        names3.forEach(System.out::println);

        System.out.println("\n<-----  Form 4 ----->");
        List<String> list = new ArrayList<>();
        list.add("Diego");
        list.add("Juan");
        list.add("Marcos");
        list.add("Pepe");
        Stream<String> names4 = list.stream();
        names4.forEach(System.out::println);
    }
}