public class Wheel {
    private final String manufacturer;
    private final int ring;
    private final double broad;

    Wheel(String manufacturer, int ring, double broad) {
        this.manufacturer = manufacturer;
        this.ring = ring;
        this.broad = broad;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRing() {
        return ring;
    }

    public double getBroad() {
        return broad;
    }
}
