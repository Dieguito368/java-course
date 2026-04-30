package org.bagon.api.stream;

import java.util.List;
import java.util.stream.Stream;
import org.bagon.api.stream.model.User;

public class StreamMap {
    public static void main(String[] args) {
        Stream<User> names = Stream.of("Diego Bautista", "Juan Mendez", "Marcos Lopéz", "Pepe González", "Daniela Flores")
            .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
            .peek(System.out::println)
            .map(user -> {
                String name = user.getName().toUpperCase();
                user.setName(name);

                return user;
            });

        List<User> list = names.toList();
        list.forEach(System.out::println);
    }
}