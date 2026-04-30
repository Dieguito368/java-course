package org.bagon.api.stream;

import org.bagon.api.stream.model.User;

import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        Stream<User> users = Stream.of("Diego Bautista", "Juan Mendez", "Marcos Lopéz", "Pepe González", "Daniela Flores")
            .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
            .flatMap(user -> {
                if(user.getName().equals("Diego")) {
                    return Stream.of(user);
                }

                return Stream.empty();
            })
            .peek(System.out::println);

        System.out.println(users.count());
    }
}