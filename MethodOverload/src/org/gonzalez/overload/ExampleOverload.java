package org.gonzalez.overload;

import static org.gonzalez.overload.Calculator.*;

public class ExampleOverload {
    public static void main(String[] args) {
        System.out.println("add(int, int) = " + add(1, 2));
        System.out.println("add(float, float) = " + add(1.0F, 2.0F));
        System.out.println("add, double) = " + add(1.0, 2.0));
        System.out.println("add(int, float) = " + add(1, 2.0F));
        System.out.println("add(float, int) = " + add(1.0F, 2));
        System.out.println("add(String, String) = " + add("1", "2"));
        System.out.println("add(int, int, int) = " + add(1, 2, 3));
        System.out.println("add(int, char) = " + add(1, '@'));

        System.out.println("add(long, long) = " + add(10L, 2L));

        System.out.println("add(...int) = " + add(1, 2, 3, 4));
        System.out.println("add(...int) = " + add(1, 2, 3, 4, 5));

        System.out.println("add(float, ...int) = " + add(1F, 2, 3, 4, 5));
    }
}