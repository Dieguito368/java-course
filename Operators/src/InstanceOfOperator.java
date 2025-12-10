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


        Object text2 = "Hi, my name is Diego";

        boolean isTypeObject2 = text2 instanceof Object;
        System.out.println("isTypeObject2 = " + isTypeObject2);

        boolean isTypeString2 = text2 instanceof String;
        System.out.println("isTypeString2 = " + isTypeString2);

        boolean isTypeInteger2 = text2 instanceof Integer;
        System.out.println("isTypeInteger2 = " + isTypeInteger2);

        Number number2 = 10.50F;

        boolean isTypeNumber2 = number2 instanceof Number;
        System.out.println("isTypeNumber2 = " + isTypeNumber2);

        boolean isTypeDouble = number2 instanceof Double;
        System.out.println("isTypeDouble = " + isTypeDouble);

        boolean isTypeInteger3 = number2 instanceof Integer;
        System.out.println("isTypeInteger3 = " + isTypeInteger3);
    }
}