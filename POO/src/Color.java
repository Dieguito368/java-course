public enum Color {
    WHITE("White"),
    BLACK("Black"),
    GRAY("Gray"),
    BLUE("Blue"),
    RED("Red");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}