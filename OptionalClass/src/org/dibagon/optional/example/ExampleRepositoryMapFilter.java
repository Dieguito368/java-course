package org.dibagon.optional.example;

import org.dibagon.optional.example.models.*;
import org.dibagon.optional.example.repository.*;

public class ExampleRepositoryMapFilter {
    public static void main(String[] args) {
        Repository<Computer> repository = new ComputerRepository();

        String manufacturer = repository.filter("Asus ROG")
                .flatMap(Computer::getProcessor)
                .flatMap(Processor::getManufacturer)
                .filter(manu -> "intel".equalsIgnoreCase(manu.getName()))
                .map(Manufacturer::getName)
                .orElseGet(() -> "Unknow");
        System.out.println(manufacturer);
    }
}