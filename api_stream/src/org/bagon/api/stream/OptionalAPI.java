package org.bagon.api.stream;

import org.bagon.api.stream.model.User;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalAPI {
    public static void main(String[] args) {
        Stream<User> users = Stream.of("Diego Bautista", "Juan Mendez", "Marcos Lopéz", "Pepe González", "Daniela Flores")
            .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
            .peek(System.out::println)
            .filter(u -> u.getId().equals(3));

        Optional<User> user = users.findFirst();
        // System.out.println(user.orElse(new User("Unknow", "Unknow")));
        // System.out.println(user.orElseGet(() -> new User("Unknow", "Unknow")));

        user.ifPresent(System.out::println);
    }
}