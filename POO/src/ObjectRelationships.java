public class ObjectRelationships {
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
        Wheel[] corollaWheels = new Wheel[5];
        for (int i = 0; i < corollaWheels.length; i++) {
            corolla.addWheel(new Wheel("Goodyear", 18, 22.5));
        }

        Wheel[] mustangWheels = new Wheel[4];
        for (int i = 0; i < mustangWheels.length; i++) {
            mustangWheels[i] = new Wheel("Michelin", 19, 23.5);
        }
        Person mustangPerson = new Person("Ivone", "Bautista González");
        Car mustang = new Car("Ford", "Mustang");
        mustang.setYear(2021);
        mustang.setColor(Color.BLACK);
        mustang.setEngine(new Engine(5.0, EngineType.DIESEL));
        mustang.setTank(new Tank(60));
        mustang.setPerson(mustangPerson);
        mustang.setWheels(mustangWheels);

        Wheel[] civicWheels = new Wheel[4];
        for (int i = 0; i < civicWheels.length; i++) {
            civicWheels[i] = new Wheel("Pirelli", 16, 20.5);
        }
        Person civicPerson = new Person("Nancy", "Bautista González");
        Car civic = new Car("Honda", "Civic", 2020);
        civic.setColor(Color.GRAY);
        civic.setEngine(new Engine(2.0, EngineType.GASOLINE));
        civic.setTank(new Tank(47));
        civic.setPerson(civicPerson);
        civic.setWheels(civicWheels);

        Wheel[] jettaWheels = new Wheel[4];
        for (int i = 0; i < jettaWheels.length; i++) {
            jettaWheels[i] = new Wheel("Continental", 17, 21.5);
        }
        Person jettaPerson = new Person("Rosa", "González Zavaleta");
        Car jetta = new Car("Volkswagen", "Jetta", 2019, new Engine(1.4, EngineType.DIESEL));
        jetta.setColor(Color.BLUE);
        jetta.setTank(new Tank());
        jetta.setPerson(jettaPerson);
        jetta.setWheels(jettaWheels);

        Wheel[] mazda3Wheels = new Wheel[4];
        for (int i = 0; i < mazda3Wheels.length; i++) {
             mazda3Wheels[i] = new Wheel("Bridgestone", 18, 22.5);
        }
        Person mazda3Person = new Person("Bernardino", "Bautista Arriaga");
        Car mazda3 = new Car(
            "Mazda",
            "Mazda 3",
            2021,
            Color.RED,
            new Engine(2.5, EngineType.GASOLINE),
            new Tank(51),
            mazda3Person,
            mazda3Wheels
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
    }
}