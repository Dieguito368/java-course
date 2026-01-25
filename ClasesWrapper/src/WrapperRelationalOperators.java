public class WrapperRelationalOperators {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Are they the same object? = " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Are they the same object? = " + (num1 == num2));

        System.out.println("Do they have the same value? = " + (num1.equals(num2)));
        System.out.println("Do they have the same value? = " + (num1.intValue() == num2.intValue()));

        boolean condition = num1 > num2;
        System.out.println("condition = " + condition);
    }
}
