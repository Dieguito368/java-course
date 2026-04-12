package org.bautista.app.home;

public class Person {
    private String name;
    private String surnames;
    private HairColor hairColor;
    public static final String MALE_GENDER = "Male Gender";
    public static final String FEMALE_GENDER = "Female Gender";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public String throwBall() {
        return "Throw the ball to the dog!";
    }

    public static String greet() {
        return "Hello!";
    }
}