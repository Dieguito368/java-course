import java.util.Objects;

public class Car implements Comparable<Car> {
    private final int ID;
    private String manufacturer;
    private String model;
    private int year;
    private Color color;
    private Engine engine;
    private Tank tank;
    private Person person;
    private Wheel[] wheels;
    private int wheelsIndex;

    private static String fuelType = "Gasoline";
    private static int tankCapacityStatic = 50;
    private static int lastID;

    public static final Integer NUMBER_PASSENGERS = 5;
    public final static int NUMBER_DOORS = 4;

    public static final String WHITE = "White";
    public static final String BLACK = "Black";
    public static final String BLUE = "Blue";
    public static final String GRAY = "Gray";
    public static final String RED = "Red";

    public Car() {
        this.ID = ++Car.lastID;
        this.wheels = new Wheel[4];
    }

    public Car(String manufacturer, String model) {
        this();
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Car(String manufacturer, String model, int year) {
        this(manufacturer, model);
        this.year = year;
    }

    public Car(String manufacturer, String model, int year, Engine engine) {
        this(manufacturer, model, year);
        this.engine = engine;
    }

    public Car(String manufacturer, String model, int year, Color color, Engine engine, Tank tank) {
        this(manufacturer, model, year, engine);
        this.color = color;
        this.tank = tank;
    }

    public Car(String manufacturer, String model, int year, Color color, Engine engine, Tank tank, Person person, Wheel[] wheels) {
        this(manufacturer, model, year, color, engine, tank);
        this.person = person;
        this.wheels = wheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static String getFuelType() {
        return fuelType;
    }

    public static void setFuelType(String fuelType) {
        Car.fuelType = fuelType;
    }

    public static int getTankCapacityStatic() {
        return tankCapacityStatic;
    }

    public static void setTankCapacityStatic(int tankCapacityStatic) {
        Car.tankCapacityStatic = tankCapacityStatic;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void addWheel(Wheel wheel) {
        if(wheelsIndex < wheels.length) {
            this.wheels[wheelsIndex++] = wheel;
        }
    }

    public String details() {
        String details = this.model +
            "\nID: " + this.ID +
            "\nManufacturer: " + this.manufacturer +
            "\nYear: " + this.year +
            "\nColor: " + color.getColor() +
            "\nCylinders: " + engine.getCylinders();

        if(wheels[0] != null) {
            details += "\nWheels: ";

            int count = 0;

            for(Wheel wheel: wheels) {
                count++;
                details += "\nWheel " + count + ": " + wheel.getManufacturer() + " - " + wheel.getRing() + " - " + wheel.getBroad();
            }
        }

        details += "\nPerson: " + person;

        return details;
    }

    public String accelerate(int rpm) {
        return "The " + this.model + " car accelerating to " + rpm + " rpm";
    }

    public String brake() {
        return "The " + model + " braking";
    }

    public String accelerateBrake(int rpm) {
        String accelerate = this.accelerate(rpm);
        String brake = this.brake();

        return accelerate + "\n" + brake;
    }

    public float calculateConsumption(int km, int gasolinePercentage) {
        return (float) km / ((float) this.tank.getCapacity() / 100 * gasolinePercentage);
    }

    public static float calculateConsumptionStatic(int km, int gasolinePercentage) {
        return (float) km / ((float) Car.tankCapacityStatic / 100 * gasolinePercentage);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Car other = (Car) obj;
        return Objects.equals(this.manufacturer, other.manufacturer);
    }

    @Override
    public String toString() {
        return "Car{" +
            "manufacturer='" + manufacturer + '\'' +
            ", model='" + model + '\'' +
            ", year=" + year +
            ", color='" + color.getColor() + '\'' +
            ", cylinders=" + engine.getCylinders() +
            ", tankCapacity=" + tank.getCapacity() +
            '}';
    }

    @Override
    public int compareTo(Car c) {
        return this.manufacturer.compareTo(c.manufacturer);
    }
}