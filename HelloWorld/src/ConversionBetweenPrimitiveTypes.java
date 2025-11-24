public class ConversionBetweenPrimitiveTypes {
    public static void main(String[] args) {
        int integerNumber = 10000;
        short shortNumber = (short) integerNumber;
        long longNumber = (long) integerNumber;

        float floatNumber = (float) integerNumber;
        double doubleNumber = (double) integerNumber;

        System.out.println("shortNumber = " + shortNumber);
        System.out.println("longNumber = " + longNumber);

        System.out.println("floatNumber = " + floatNumber);
        System.out.println("doubleNumber = " + doubleNumber);
    }
}
