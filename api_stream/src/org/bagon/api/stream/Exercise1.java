package org.bagon.api.stream;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        double total = numbers.stream()
            .filter(number -> number % 10 != 0)
            .map(number -> (double) number / 2)
            .reduce(0.0, Double::sum);

        System.out.println("Total: " + total);
    }
}