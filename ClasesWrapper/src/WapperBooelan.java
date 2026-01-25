public class WapperBooelan {
    public static void main(String[] args) {
        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean condition = num1 > num2;
        System.out.println("condition = " + condition);

        Boolean condition2 = Boolean.valueOf(false);
        System.out.println("condition2 = " + condition2);

        Boolean condition3 = Boolean.valueOf("false");
        System.out.println("condition3 = " + condition3);

        Boolean condition4 = false;
        System.out.println("condition4 = " + condition4);

        System.out.println("It is the same instance? = " + (condition2 == condition4));
    }
}