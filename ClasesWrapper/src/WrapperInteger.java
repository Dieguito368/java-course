public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitive = 12345;
        Integer intObject = Integer.valueOf(123);
        Integer intObject2 = 123456;
        Integer intObject3 = Integer.valueOf(intPrimitive);

        int num = intObject3;
        int num2 = intObject3.intValue();

        String value = "12345";
        Integer intvalue = Integer.valueOf(value);

        Short shortobject = intObject.shortValue();
        System.out.println("shortobject = " + shortobject);

        Short shortobject2 = intObject2.shortValue();
        System.out.println("shortobject2 = " + shortobject2);

        Byte byteObject = intObject.byteValue();
        System.out.println("byteObject = " + byteObject);

        Byte byteObject2 = intObject2.byteValue();
        System.out.println("byteObject2 = " + byteObject2);
    }
}