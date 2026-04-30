package org.dibagon.optional.example;

import org.dibagon.optional.example.models.Computer;
import org.dibagon.optional.example.repository.ComputerRepository;
import org.dibagon.optional.example.repository.Repository;

import java.util.Optional;

public class ExampleRepositoryThrow {
    public static void main(String[] args) {
        Repository<Computer> repository = new ComputerRepository();

        Computer pc = repository.filter("Asus ROG").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        System.out.println();

        String fileName = "document.pdf";
        String extension = Optional.of(fileName)
            .filter(name  -> name.contains("."))
            .map(name -> name.substring(fileName.lastIndexOf(".") +  1))
            .orElseThrow();
        System.out.println(extension);
    }
}