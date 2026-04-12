package org.bagon.examples.set;

import org.bagon.examples.model.Student;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetComparable {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Diego", 9));
        students.add(new Student("Juan", 6));
        students.add(new Student("Marcos", 10));
        students.add(new Student("Karla", 8));
        students.add(new Student("Diana", 7));
        students.add(new Student("Joaquín", 7));
        students.add(new Student("Joaquín", 8));

        System.out.println(students);

        System.out.println();

        System.out.println("<----- Iterating using a for loop ----->");
        for(Student s : students) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("<----- Iterating using a while and iterator ----->");
        Iterator<Student> ite = students.iterator();

        while (ite.hasNext()) {
            Student student = ite.next();

            System.out.println(student);
        }

        System.out.println();

        System.out.println("<----- Iterating using Stream forEach ----->");
        students.forEach(System.out::println);
    }
}