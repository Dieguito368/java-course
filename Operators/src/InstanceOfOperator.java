public class InstanceOfOperator {
    public static void main(String[] args) {
        String text = "Hello World!";

        Integer number = 10;

        boolean isTypeString = text instanceof String;
        boolean isTypeObject = text instanceof Object;

        boolean isTypeInteger = number instanceof Integer;
        boolean isTypeNumber = number instanceof Number;


        System.out.println("Is the text variable of type String? " + isTypeString);
        System.out.println("Is the text variable of type Object? " + isTypeObject);

        System.out.println("Is the number variable of type Integer? " + isTypeInteger);
        System.out.println("Is the number variable of type Number? " + isTypeNumber);
    }
}
