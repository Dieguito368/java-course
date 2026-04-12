package org.gonzalez.Inheritance;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
        System.out.println("Teacher: Initializing constructor...");
    }

    public Teacher(String name, String surnames) {
        super(name, surnames);
    }

    public Teacher(String name, String surnames, String subject) {
        super(name, surnames);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String greeting() {
        return super.greeting() + "I am a teacher and my name is " +  getName();
    }

    @Override
    public String toString() {
        return super.toString() + "\nSubject: " + subject;
    }
}