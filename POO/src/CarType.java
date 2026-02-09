public enum CarType {
    SEDAN("Sedan", 4, "Four-door car with a separate trunk, comfortable and practical for daily use."),
    HATCHBACK("Hatchback", 5, "Compact car with a rear door and integrated trunk, ideal for city driving."),
    PICKUP("Pickup", 4, "Vehicle with an open cargo bed, designed for work and heavy loads."),
    COUPE("Coupe", 2, "Two-door car with a sporty design, focused on style and performance."),
    SUV("SUV", 5, "Tall and spacious vehicle, suitable for families and long trips."),
    CONVERTIBLE("Convertible", 2, "Car with a retractable roof, focused on driving experience and design.");

    private final String name;
    private final int numberDoors;
    private final String description;

    CarType(String name, int numberDoors, String description) {
        this.name = name;
        this.numberDoors = numberDoors;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    @Override
    public String toString() {
        return name + " " + numberDoors + " doors";
    }
}
