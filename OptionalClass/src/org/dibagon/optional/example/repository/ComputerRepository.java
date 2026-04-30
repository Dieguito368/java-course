package org.dibagon.optional.example.repository;

import org.dibagon.optional.example.models.Computer;
import org.dibagon.optional.example.models.Manufacturer;
import org.dibagon.optional.example.models.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerRepository implements Repository<Computer> {
    private final List<Computer> dataSource;

    public  ComputerRepository() {
        this.dataSource = new ArrayList<>();

        Processor processor = new Processor("19-888H", new Manufacturer("Intel"));
        Computer asus = new Computer("Asus ROG", "Strix G512");
        asus.setProcessor(processor);
        this.dataSource.add(asus);

        this.dataSource.add(new Computer("MacBook Pro", "MVK2CI"));
    }

    @Override
    public Optional<Computer> filter(String name) {
//        for (Computer comp  : dataSource) {
//            if(comp.getName().equalsIgnoreCase(name)) {
//                return Optional.of(comp);
//            }
//        }
//
//        return Optional.empty();

        return dataSource.stream().filter(computer -> computer.getName().equalsIgnoreCase(name)).findFirst();
    }
}