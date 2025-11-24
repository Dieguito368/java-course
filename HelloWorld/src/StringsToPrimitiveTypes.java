public class StringsToPrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("<--- Converting strings to primitive types --->");

        String integerString = "10";
        int integerNumber = Integer.parseInt(integerString);
        System.out.println("integerNumber = " + integerNumber);

        String floatString = "10.50";
        float floatNumber  = Float.parseFloat(floatString);
        System.out.println("floatNumber = " + floatNumber);

        String doubleString = "83.7323420";
        double doubleNumber  = Double.parseDouble(doubleString);
        System.out.println("doubleNumber = " + doubleNumber);

        String numberString = "24.313243e4";
        double number = Double.parseDouble(numberString);
        System.out.println("number = " + number);

        String booleanString = "1";
        boolean isTrue = Boolean.parseBoolean(booleanString);
        System.out.println("isTrue = " + isTrue);
    }
}
