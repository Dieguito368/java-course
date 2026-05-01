import java.util.stream.Stream;

import org.bagon.recursion.example.models.Component;

public class RecursionExample {
    public static void main(String[] args) {
        Component pc = new Component("Personal Computer");
        
        Component power = new Component("Corsair 750W Gold Power Supply");
        Component motherboard = new Component("ASUS ROG Strix B550-F Motherboard");
        
        Component cpu = new Component("AMD Ryzen 7 5800X Processor");
        Component ram = new Component("Kingston HyperX Fury 16GB RAM");
        Component gpu = new Component("NVIDIA GeForce RTX 4070 Graphics Card");
        Component storage = new Component("Samsung 980 Pro 1TB SSD");

        Component gpuMemory = new Component("GDDR6X 12GB Video Memory");
        Component gpuCooling = new Component("Triple Fan Cooling System");
        Component gpuPower = new Component("Dual 8-pin Power Connectors");

        gpu.addComponent(gpuMemory)
                .addComponent(gpuCooling)
                .addComponent(gpuPower);

        motherboard.addComponent(cpu)
                .addComponent(ram)
                .addComponent(gpu)
                .addComponent(storage);

        pc.addComponent(power)
                .addComponent(motherboard);


        // recursiveMethod(pc, 0);
        recursiveMethodStream(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getLevel()) + c.getName()));;
    }

    public static void recursiveMethod(Component c, int level) {
        System.out.println("\t".repeat(level) + c.getName());

        for(Component children : c.getChildren()) {
            recursiveMethod(children, level + 1);
        }
    }

    public static Stream<Component> recursiveMethodStream(Component c, int level) {
        c.setLevel(level);
        
        return Stream.concat(Stream.of(c), c.getChildren().stream().flatMap(children -> recursiveMethodStream(children, level + 1)));
    }
}