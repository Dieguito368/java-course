 package org.bagon.api.stream;

import org.bagon.api.stream.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class StreamParallel {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Diego", "Bautista"));
        users.add(new User("Hugo", "Mendéz"));
        users.add(new User("Antonio", "Calixto"));
        users.add(new User("Miguel", "Hernández"));
        users.add(new User("Arturo", "Figueroa"));

        long start = System.currentTimeMillis();

        String res = users.stream()
            .parallel()
            .map(user -> user.toString().toUpperCase())
            .peek(name -> {
                System.out.println(name + " running in the thread " + Thread.currentThread().getName());
            })
            .flatMap(name -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if(name.length() >= 15) {
                    return Stream.of(name);
                }

                return Stream.empty();
            })
            .findAny().orElse("");

        long end = System.currentTimeMillis();

        System.out.println(res);
        System.out.println("Time elapsed: " + (end - start));
    }
}