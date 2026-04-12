package org.bagon.examples.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private Integer note;

    public Student() {}

    public Student(String name, Integer note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Name: "  + name+ " | Grade: " + note;
    }

    @Override
    public int compareTo(Student s) {
        // By name
//        if(this.name == null) {
//            return 0;
//        }
//
//        return this.name.compareTo(s.name);

        // By note
        return Integer.compare(s.note, this.note);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(note, student.note) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, note);
    }
}
