public class Person {
    private String name;
    private String surnames;

    public Person(String name, String surnames) {
        this.name = name;
        this.surnames = surnames;
    }

    @Override
    public String toString() {
        return name + " " + surnames;
    }
}
