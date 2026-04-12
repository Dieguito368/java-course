package org.bagon.examples.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("four");
        ts.add("five");

        System.out.println(ts);

        Set<Integer> numbers = new TreeSet<>((a, b) -> b.compareTo(a));

        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);

        System.out.println(numbers);
    }
}
