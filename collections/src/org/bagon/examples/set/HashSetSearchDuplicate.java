package org.bagon.examples.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetSearchDuplicate {
    public static void main(String[] args) {
        String[] names = { "Diego", "Juan", "Guadalupe", "Sara", "Fernando", "Diego", "Sara" };

        Set<String> unique = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String name: names) {
            if(!unique.add(name)) {
                duplicates.add(name);
            }
        }

        unique.removeAll(duplicates);

        System.out.println("Unique: " + unique);
        System.out.println("Duplicates: " + duplicates);
    }
}
