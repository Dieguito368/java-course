package org.bautista.app.garden;

import org.bautista.app.home.Person;

public class Dog {
    protected String name;
    protected String breed;

    String play(Person person) {
        return person.throwBall();
    }
}
