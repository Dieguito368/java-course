package org.gonzalez.Inheritance;

public class Student extends Person {
    private String  institution;
    private double spanishGrade;
    private double mathematicsGrade;
    private double historyGrade;

    public Student() {
        System.out.println("Student: Initializing constructor...");
    }

    public Student(String name, String surnames) {
        super(name, surnames);
    }

    public Student(String name, String surnames, int age) {
        super(name, surnames, age);
    }

    public Student(String name, String surnames, int age, String institution) {
        super(name, surnames, age);
        this.institution = institution;
    }

    public Student(String name, String surnames, int age, String institution, double spanishGrade, double mathematicsGrade, double historyGrade) {
        this(name, surnames, age, institution);
        this.spanishGrade = spanishGrade;
        this.mathematicsGrade = mathematicsGrade;
        this.historyGrade = historyGrade;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public double getSpanishGrade() {
        return spanishGrade;
    }

    public void setSpanishGrade(double spanishGrade) {
        this.spanishGrade = spanishGrade;
    }

    public double getMathematicsGrade() {
        return mathematicsGrade;
    }

    public void setMathematicsGrade(double mathematicsGrade) {
        this.mathematicsGrade = mathematicsGrade;
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        this.historyGrade = historyGrade;
    }

    @Override
    public String greeting() {
        return super.greeting() +  "I am a student and my name is " +  getName();
    }

    public double calculateAverage() {
        return (spanishGrade + mathematicsGrade + historyGrade) / 3;
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nInstitution: " + institution +
            "\nSpanishGrade: " + spanishGrade +
            "\nMathematics Grade=: " + mathematicsGrade +
            "\nHistory Grade: " + historyGrade +
            "\nAverage: " +  calculateAverage();
    }
}
