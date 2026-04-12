package org.bagon.java8.lamda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<String, String> f1 = name -> "Hola " + name;

        System.out.println(f1.apply("Diego"));

        System.out.println("\n<-------------------------->\n");

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("Diego"));

        System.out.println("\n<-------------------------->\n");

        BiFunction<Integer, Integer, Integer> b1 = Integer::sum;
        System.out.println(b1.apply(6950, 2423));
    }
}
