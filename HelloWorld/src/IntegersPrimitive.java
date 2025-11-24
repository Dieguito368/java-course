public class IntegersPrimitive {
    public static void main(String[] args) {
        byte byteNumber = 7;
        System.out.println("<------- BYTE -------> ");
        System.out.println("byteNumber = " + byteNumber);
        System.out.println("Bytes: " + Byte.BYTES);
        System.out.println("Bits: " + Byte.SIZE);
        System.out.println("Maximum value: " + Byte.MAX_VALUE);
        System.out.println("Minimum value: " + Byte.MIN_VALUE);

        System.out.println("\n");

        short shortNumber = 7000;
        System.out.println("<------- SHORT -------> ");
        System.out.println("shortNumber = " + shortNumber);
        System.out.println("Bytes: " + Short.BYTES);
        System.out.println("Bits: " + Short.SIZE);
        System.out.println("Maximum value: " + Short.MAX_VALUE);
        System.out.println("Minimum value: " + Short.MIN_VALUE);

        System.out.println("\n");

        int intNumber = 7000000;
        System.out.println("<------- INT -------> ");
        System.out.println("intNumber = " + intNumber);
        System.out.println("Bytes: " + Integer.BYTES);
        System.out.println("Bits: " + Integer.SIZE);
        System.out.println("Maximum value: " + Integer.MAX_VALUE);
        System.out.println("Minimum value: " + Integer.MIN_VALUE);

        System.out.println("\n");

        long longNumber = 7000000000L;
        System.out.println("<------- LONG -------> ");
        System.out.println("longNumber = " + longNumber);
        System.out.println("Bytes: " + Long.BYTES);
        System.out.println("Bits: " + Long.SIZE);
        System.out.println("Maximum value: " + Long.MAX_VALUE);
        System.out.println("Minimum value: " + Long.MIN_VALUE);

        var valueNumber = 432784327842378L;
    }
}
