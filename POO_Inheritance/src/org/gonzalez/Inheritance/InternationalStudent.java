package org.gonzalez.Inheritance;

public class InternationalStudent extends Student {
    private String country;
    private double languageGrade;

    public InternationalStudent() {
        System.out.println("InternationalStudent: Initializing constructor...");
    }

    public InternationalStudent(String name, String surnames) {
        super(name, surnames);
    }

    public InternationalStudent(String name, String surnames, String country) {
        super(name, surnames);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getLanguageGrade() {
        return languageGrade;
    }

    public void setLanguageGrade(double languageGrade) {
        this.languageGrade = languageGrade;
    }

    @Override
    public String greeting() {
        return super.greeting() + "I am a international student and my name is " +  getName();
    }

    @Override
    public double calculateAverage() {
        return ((super.calculateAverage() * 3) + languageGrade) / 4;
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nCountry: " + country +
            "\nLanguage Grade: " + languageGrade;
    }
}