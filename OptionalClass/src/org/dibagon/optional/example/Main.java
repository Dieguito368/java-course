package org.dibagon.optional.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = "Diego";
        Optional<String> opt = Optional.of(name);

        System.out.println(opt);
        System.out.println(opt.isPresent());

        if(opt.isPresent()) System.out.println("Hello " + opt.get());
        System.out.println(opt.isEmpty());

        opt.ifPresent(valor -> System.out.println("Hello " + valor));

        name = "Fernando";

        opt = Optional.ofNullable(name);
        System.out.println(opt);
        System.out.println();
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresentOrElse(value -> System.out.println("Hello " + value), () -> System.out.println("It is empty"));

        System.out.println();

        Optional<String> optEmpty = Optional.empty();
        System.out.println(optEmpty);
        System.out.println(optEmpty.isPresent());
    }
}