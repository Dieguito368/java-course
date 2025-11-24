public class BooleansPrimitive {
    public static void main(String[] args) {
        boolean logicalData = true;
        boolean logicalData2 = Boolean.FALSE;
        boolean logicalData3 = Boolean.TRUE.booleanValue();

        System.out.println("<------- BOOLEAN -------> ");
        System.out.println("logicalData = " + logicalData);
        System.out.println("logicalData2 = " + logicalData2);
        System.out.println("logicalData3 = " + logicalData3);

        System.out.println();

        double d = 12345.456e-3; // 12.345456
        float f = 1.2345e2f; // 123.45

        logicalData = d < f;

        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("logicalData = " + logicalData);

        System.out.println();

        boolean isSame = d == f;
        System.out.println("isSame = " + isSame);
    }
}