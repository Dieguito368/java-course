package org.bagon.examples.set;

import java.util.*;

public class HashSetMain {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Diego"));
        System.out.println(names.add("Karla"));
        System.out.println(names.add("Samuel"));
        System.out.println(names.add("Fernanda"));
        System.out.println(names.add("Hugo"));
        System.out.println(names.add("Hugo"));

        List<String> list = new ArrayList<>(names);

        Collections.sort(list);

        System.out.println(list);
    }
}