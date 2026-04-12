package org.bagon.examples.list;

import org.bagon.examples.model.Student;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();

        System.out.println("Size: " + students.size());
        System.out.println(students);

        System.out.println();

        students.add(new Student("Diego", 9));
        students.add(new Student("Juan", 6));
        students.add(new Student("Marcos", 10));
        students.add(new Student("Karla", 8));
        students.add(new Student("Diana", 7));

        System.out.println("Size: " + students.size());
        System.out.println(students);

        System.out.println();

        students.addFirst(new Student("Carlos", 9));
        students.addLast(new Student("Wendy", 7));

        System.out.println();

        System.out.println("Size: " + students.size());
        System.out.println(students);

        System.out.println();

        System.out.println(students.getFirst());
        System.out.println(students.getLast());
        System.out.println(students.get(1));

        students.removeFirst();
        students.removeLast();

        System.out.println();
        System.out.println("Size: " + students.size());
        System.out.println(students);

        Student student = new Student("Diego", 9);
        System.out.println(students.indexOf(student));

        ListIterator<Student> listIterator = students.listIterator();

        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\n<----- PREVIOUS ----->");

        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}