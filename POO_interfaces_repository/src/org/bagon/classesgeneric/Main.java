package org.bagon.classesgeneric;

public class Main {
    public static<T> void printTruck(Truck<T> truck) {
        for(T object : truck) {
            String text = "";

            if(object instanceof Animal animal) {
                text = "Name: " + animal.getName() + " | " + "Type: " + animal.getType();
            } else if(object instanceof Machinery machine) {
                text = "Type: " + machine.getType();
            } else if(object instanceof Car car) {
                text = "Brand: " + car.getBrand();
            }

            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Truck<Animal> horseTransport = new Truck<>(3);
        horseTransport.add(new Animal("Margarito", "horse"));
        horseTransport.add(new Animal("Ferraris", "horse"));
        horseTransport.add(new Animal("Mistico", "horse"));
        printTruck(horseTransport);

        System.out.println("\n<---------------------------->\n");

        Truck<Machinery> machinesTransport = new Truck<>(3);
        machinesTransport.add(new Machinery("Excavator"));
        machinesTransport.add(new Machinery("Backhoe Loader "));
        machinesTransport.add(new Machinery("Bulldozer"));
        printTruck(machinesTransport);

        System.out.println("\n<---------------------------->\n");

        Truck<Car> carsTransport = new Truck<>(3);
        carsTransport.add(new Car("Toyota"));
        carsTransport.add(new Car("Nissan"));
        carsTransport.add(new Car("Tesla"));
        printTruck(carsTransport);
    }
}