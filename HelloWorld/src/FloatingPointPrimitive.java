public class FloatingPointPrimitive {
    public static void main(String[] args) {
        float floatNumber = 15.50F;
        System.out.println("<------- FLOAT -------> ");
        System.out.println("realNumber = " + floatNumber);
        System.out.println("Bytes: " + Float.BYTES);
        System.out.println("Bits: " + Float.SIZE);
        System.out.println("Maximum value: " + Float.MAX_VALUE);
        System.out.println("Minimum value: " + Float.MIN_VALUE);
        System.out.println(15.50E2F);
        System.out.println(15.5045E2F);
        System.out.println(15.50E-5F + " = " + 0.0001550);

        double doubleNumber = 1585.50895;
        System.out.println("<------- DOUBLE -------> ");
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println("Bytes: " + Double.BYTES);
        System.out.println("Bits: " + Double.SIZE);
        System.out.println("Maximum value: " + Double.MAX_VALUE);
        System.out.println("Minimum value: " + Double.MIN_VALUE);

        var varNumber = 3.1416;
        System.out.println("varNumber = " + varNumber);
    }
}
