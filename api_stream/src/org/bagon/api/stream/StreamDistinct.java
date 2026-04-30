package org.bagon.api.stream;

import org.bagon.api.stream.model.User;

import java.util.stream.Stream;

public class StreamDistinct {
    public static void main(String[] args) {
        Stream.of("Diego Bautista", "Gerardo Flores", "Fernando Huerta", "Diego Bautista", "Marcos Lopéz", "Pepe González", "Diego Bautista")
            .distinct()
            .forEach(System.out::println);

        System.out.println();

        Stream<User> users = Stream.of("Diego Bautista", "Ernesto Mendez", "Paola Gutierrez", "Sara González", "Hugo Dominguez", "Diego Bautista")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .distinct();
        users.forEach(System.out::println);
    }
}