package org.bautista.app.home;

import org.bautista.app.garden.Dog;
import static org.bautista.app.home.Person.greet;

public class ExampleHome {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog();

        String greeting = greet();
        System.out.println("greeting = " + greeting);
    }
}
