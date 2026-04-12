package org.bagon.examples.list;

import org.bagon.examples.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        System.out.println("Size: " + students.size());
        System.out.println(students);
        students.add(new Student("Diego", 9));
        students.add(new Student("Juan", 6));
        students.add(new Student("Marcos", 10));
        students.add(2, new Student("Karla", 8));
        students.set(3, new Student("Diana", 7));

        System.out.println();

        System.out.println("Size: " + students.size());
        System.out.println(students);

        System.out.println();

        // students.remove(students.size() - 1);
        students.remove(new Student("Diana", 7));
        System.out.println("Size: " + students.size());
        System.out.println(students);
        
        boolean b = students.contains(new Student("Juan", 1));
        System.out.println("b = " + b);

        Object arrey[] = students.toArray();
        for(int i = 0; i < arrey.length; i++ ) {
            System.out.println(arrey[i]);
        }
    }
}