package org.bagon.api.stream;

import org.bagon.api.stream.model.User;
import java.util.stream.Stream;

public class StreamAnyMatch {
    public static void main(String[] args) {
        boolean isExists = Stream.of("Diego Bautista", "Juan Mendez", "Marcos Lopéz", "Pepe González", "Daniela Flores")
            .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
            .peek(System.out::println)
            .anyMatch(u -> u.getId().equals(20));

        System.out.println(isExists);
    }
}