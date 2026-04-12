package org.bagon.examples.list;

import org.bagon.examples.model.Student;

import java.util.*;

public class ListComparableComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Diego", 9));
        students.add(new Student("Juan", 6));
        students.add(new Student("Marcos", 10));
        students.add(new Student("Karla", 8));
        students.add(new Student("Diana", 7));
        students.add(new Student("Joaquín", 7));
        students.add(new Student("Joaquín", 8));

        // students.sort((a, b) -> a.getNote().compareTo(b.getNote()));
        students.sort(Comparator.comparing(Student::getName));
        students.sort(Comparator.comparing(Student::getNote).reversed());

        System.out.println(students);

        System.out.println("<----- Iterating using Stream forEach ----->");
        students.forEach(System.out::println);
    }
}