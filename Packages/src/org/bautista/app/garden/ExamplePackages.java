package org.bautista.app.garden;

import org.bautista.app.home.Person;
import static org.bautista.app.home.Person.*;
import static org.bautista.app.home.HairColor.*;

public class ExamplePackages {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Diego");
        person.setSurnames("Bautista González");
        person.setHairColor(BROWN);
        System.out.println(person.getName());

        Dog dog = new Dog();

        String playing = dog.play(person);
        System.out.println(playing);

        String greeting = greet();
        System.out.println("greeting = " + greeting);

        System.out.println("MALE_GENDER = " + MALE_GENDER);
        System.out.println("FEMALE_GENDER = " + FEMALE_GENDER);
    }
}