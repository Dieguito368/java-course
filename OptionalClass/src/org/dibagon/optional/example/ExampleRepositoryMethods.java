package org.dibagon.optional.example;

import org.dibagon.optional.example.models.Computer;
import org.dibagon.optional.example.repository.ComputerRepository;
import org.dibagon.optional.example.repository.Repository;

public class ExampleRepositoryMethods {
    public static void main(String[] args) {
        Repository<Computer> repository = new ComputerRepository();

        Computer pc = repository.filter("Asus ROG").orElse(defaultValue());
        System.out.println(pc);

        System.out.println();

        pc = repository.filter("Asus ROG").orElseGet(ExampleRepositoryMethods::defaultValue);
        System.out.println(pc);
    }

    public static Computer defaultValue() {
        System.out.println("Obtaining default value");
        return new Computer("HP Omen", "LAB56Y");
    }
}