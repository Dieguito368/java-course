import java.util.Date;

public class ExampleClass {
    public static void main(String[] args) {
        Date date = new Date();

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
        Car mazda2 = new Car(
            "Mazda",
            "Mazda 3",
            2021,
            Color.RED,
            new Engine(2.5, EngineType.GASOLINE),
            new Tank(51)
        );
        Car mazda1 = new Car();
        Car mazda0 = new Car();

        System.out.println(corolla.details());
        System.out.println();
        System.out.println(mustang.details());
        System.out.println();
        System.out.println(civic.details());

        System.out.println();

        System.out.println(corolla.accelerateBrake(300));
        System.out.println();
        System.out.println(mustang.accelerateBrake(500));

        System.out.println();

        System.out.println("Kilometers per liter: " + corolla.calculateConsumption(500, 60));

        System.out.println("Are they the same (mazda3 -> mazda2)? " + mazda3.equals(mazda2));
        System.out.println("Are they the same (mazda3 -> mazda1)? " + mazda3.equals(mazda1));
        System.out.println("Are they the same (mazda1 -> mazda3)? " + mazda1.equals(mazda3));
        System.out.println("Are they the same (mazda0 -> mazda1)? " + mazda0.equals(mazda1));
        System.out.println("Are they the same (mazda3 -> mazda1)? " + mazda3.equals(date));

        System.out.println(jetta);
    }
}