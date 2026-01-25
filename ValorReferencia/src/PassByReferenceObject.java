class Person {
    private String name;

     public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }
}

public class PassByReferenceObject {
    public static void main(String[] args) {
        System.out.println("Start the main method");

        Person person = new Person();

        person.setName("Diego");

        System.out.println("Before calling the test method");
        System.out.println("person.getName() = " + person.getName());

        test(person);

        System.out.println("After calling the test method");
        System.out.println("person.getName() = " + person.getName());

        System.out.println("The test method ends");
    }

    public static void test(Person person) {
        System.out.println("Start the test method");

        person.setName("Juan");

        System.out.println("The test method ends");
    }
}
