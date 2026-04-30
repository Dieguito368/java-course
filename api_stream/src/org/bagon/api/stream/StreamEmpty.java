package org.bagon.api.stream;

import org.bagon.api.stream.model.User;

import java.util.stream.Stream;

public class StreamEmpty {
    public static void main(String[] args) {
        long count = Stream.of("Diego Bautista", "", "Marcos Lopéz", "Pepe González", "")
            .filter(String::isEmpty)
            .count();

        System.out.println("count = " + count);
    }
}