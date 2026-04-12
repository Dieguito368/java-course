package org.bagon.java8.lamda;

import org.bagon.java8.lamda.model.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<Date> consumer = date -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(sdf.format(date));
        };
        consumer.accept(new Date());

        BiConsumer<String, Integer> consumer2 = (name, age) -> System.out.println(name + " is " + age + " years old");
        consumer2.accept("Diego", 23);

        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("Hello World!");

        System.out.println("\n<------------------------>\n");
        List<String> names = Arrays.asList("Diego", "Juan", "marcos");
        names.forEach(consumer3);

        System.out.println("\n<------------------------>\n");
        Supplier<User> createUser = User::new;

        User user = createUser.get();
        BiConsumer<User, String> users = User::setName;
        users.accept(user, "Diego");
        System.out.println("Name: " + user.getName());

        System.out.println("\n<----- Supplier ----->");
        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());
    }
}