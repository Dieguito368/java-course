public class Engine {
    private double cylinders;
    private EngineType type;

    public Engine() {
    }

    public Engine(double cylinders, EngineType type) {
        this.cylinders = cylinders;
        this.type = type;
    }

    public double getCylinders() {
        return cylinders;
    }

    public void setCylinders(double cylinders) {
        this.cylinders = cylinders;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }
}
