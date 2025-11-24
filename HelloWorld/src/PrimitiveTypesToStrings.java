public class PrimitiveTypesToStrings {
    public static void main(String[] args) {
        System.out.println("<--- Converting primitive types to strings --->");

        int integerNumber = 100;
        String integerString = Integer.toString(integerNumber);
        System.out.println("integerString = " + integerString);

        float floatNumber = 10.5302F;
        String floatString  = String.valueOf(floatNumber);
        System.out.println("floatString = " + floatString);

        double doubleNumber = 83.7323420e15;
        String doubleString  = Double.toString(doubleNumber);
        System.out.println("doubleString = " + doubleString);

        boolean isTrue = true;
        String booleanString = String.valueOf(isTrue);
        System.out.println("booleanString = " + booleanString);
    }
}
