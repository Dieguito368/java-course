package org.bagon.examples.set;

import org.bagon.examples.model.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparable {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Diego", 9));
        students.add(new Student("Juan", 6));
        students.add(new Student("Marcos", 10));
        students.add(new Student("Karla", 8));
        students.add(new Student("Diana", 7));
        students.add(new Student("Joaquín", 7));

        System.out.println(students);
    }
}