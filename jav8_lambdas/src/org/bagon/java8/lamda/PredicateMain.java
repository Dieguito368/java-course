package org.bagon.java8.lamda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> t1 = num -> num > 0;
        System.out.println(t1.test(-2));

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String, String> t3 = String::equals;
        System.out.println(t3.test("Diego", "Diego"));
    }
}