package org.bagon.api.stream;

import org.bagon.api.stream.model.User;

import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        User user = Stream.of("Diego Bautista", "Juan Mendez", "Marcos Lopéz", "Pepe González", "Daniela Flores")
            .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
            .peek(System.out::println)
            .filter(u -> u.getId().equals(3))
            .findFirst().get();

        System.out.println(user);
    }
}