package org.dibagon.optional.example;

import org.dibagon.optional.example.models.Computer;
import org.dibagon.optional.example.repository.ComputerRepository;
import org.dibagon.optional.example.repository.Repository;

import java.util.Optional;

public class ExampleRepository {
    public static void main(String[] args) {
        Repository<Computer> repository = new ComputerRepository();

        Optional <Computer> pc = repository.filter("Asus ROG");

        pc.ifPresentOrElse(System.out::println, () -> System.out.println("Not Found"));
    }
}