import java.util.Arrays;

public class ArrayCar {
    public static void main(String[] args) {
        Person corollaPerson = new Person("Diego", "Bautista González");
        Car corolla = new Car();
        corolla.setManufacturer("Toyota");
        corolla.setModel("Corolla");
        corolla.setYear(2022);
        corolla.setColor(Color.WHITE);
        corolla.setEngine(new Engine(1.8, EngineType.GASOLINE));
        corolla.setTank(new Tank());
        corolla.setPerson(corollaPerson);

        Person mustangPerson = new Person("Ivone", "Bautista González");
        Car mustang = new Car("Ford", "Mustang");
        mustang.setYear(2021);
        mustang.setColor(Color.BLACK);
        mustang.setEngine(new Engine(5.0, EngineType.DIESEL));
        mustang.setTank(new Tank(60));
        mustang.setPerson(mustangPerson);

        Person civicPerson = new Person("Nancy", "Bautista González");
        Car civic = new Car("Honda", "Civic", 2020);
        civic.setColor(Color.GRAY);
        civic.setEngine(new Engine(2.0, EngineType.GASOLINE));
        civic.setTank(new Tank(47));
        civic.setPerson(civicPerson);

        Person jettaPerson = new Person("Rosa", "González Zavaleta");
        Car jetta = new Car("Volkswagen", "Jetta", 2019, new Engine(1.4, EngineType.DIESEL));
        jetta.setColor(Color.BLUE);
        jetta.setTank(new Tank());
        jetta.setPerson(jettaPerson);

        Person mazda3Person = new Person("Bernardino", "Bautista Arriaga");
        Car mazda3 = new Car(
            "Mazda",
            "Mazda 3",
            2021,
            Color.RED,
            new Engine(2.5, EngineType.GASOLINE),
            new Tank(51)
        );
        mazda3.setPerson(mazda3Person);

        System.out.println(corolla.details());
        System.out.println();
        System.out.println(mustang.details());
        System.out.println();
        System.out.println(civic.details());
        System.out.println();
        System.out.println(jetta.details());
        System.out.println();
        System.out.println(mazda3.details());

        System.out.println();

        Car[] cars = new Car[5];
        cars[0] = corolla;
        cars[1] = mustang;
        cars[2] = civic;
        cars[3] = jetta;
        cars[4] = mazda3;

        Arrays.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
