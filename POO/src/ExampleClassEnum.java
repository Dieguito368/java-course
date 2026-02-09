public class ExampleClassEnum {
    public static void main(String[] args) {
        Car corolla = new Car();
        corolla.setManufacturer("Toyota");
        corolla.setModel("Corolla");
        corolla.setYear(2022);
        corolla.setColor(Color.WHITE);
        corolla.setEngine(new Engine(1.8, EngineType.GASOLINE));
        corolla.setTank(new Tank());

        Car mustang = new Car("Ford", "Mustang");
        mustang.setYear(2021);
        mustang.setColor(Color.BLACK);
        mustang.setEngine(new Engine(5.0, EngineType.DIESEL));
        mustang.setTank(new Tank(60));

        Car civic = new Car("Honda", "Civic", 2020);
        civic.setColor(Color.GRAY);
        civic.setEngine(new Engine(2.0, EngineType.GASOLINE));
        civic.setTank(new Tank(47));

        Car jetta = new Car("Volkswagen", "Jetta", 2019, new Engine(1.4, EngineType.DIESEL));
        jetta.setColor(Color.BLUE);
        jetta.setTank(new Tank());

        Car mazda3 = new Car(
            "Mazda",
            "Mazda 3",
            2021,
            Color.RED,
            new Engine(2.5, EngineType.GASOLINE),
            new Tank(51)
        );

        System.out.println(corolla.details());
        System.out.println();
        System.out.println(mustang.details());
        System.out.println();
        System.out.println(civic.details());
        System.out.println();
        System.out.println(jetta.details());
        System.out.println();
        System.out.println(mazda3.details());
        
        CarType[] types = CarType.values();
        for(CarType type: types) {
            System.out.println("Type: " + type);
        }
    }
}