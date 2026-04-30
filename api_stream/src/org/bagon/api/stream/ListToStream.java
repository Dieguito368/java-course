package org.bagon.api.stream;

import org.bagon.api.stream.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToStream {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Diego", "Bautista"));
        users.add(new User("Hugo", "Mendéz"));
        users.add(new User("Antonio", "Calixto"));
        users.add(new User("Miguel", "Hernández"));
        users.add(new User("Arturo", "Figueroa"));

        users.stream()
            .map(user -> (user.getName() +  " " + user.getSurnames()).toUpperCase())
            .flatMap(name -> {
                if(name.length() >= 15) {
                    return Stream.of(name);
                }

                return Stream.empty();
            })
            .peek(System.out::println)
            .map(String::toLowerCase)
            .forEach(System.out::println);
    }
}
