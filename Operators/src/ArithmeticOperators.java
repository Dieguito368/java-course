public class ArithmeticOperators {
    public static void main(String[] args) {
        int i = 5, j = 4, addition = i + j, subtraction = i - j, multiplication = i * j, division = i / j, module = i % j;

        System.out.println("addition = " + addition);
        System.out.println(i + " + " + j + " = " + i + j);
        System.out.println(i + " + " + j + " = " + ( i + j));

        System.out.println();

        System.out.println("subtraction = " + subtraction);
        // System.out.println(i + " - " + j + " = " + i - j);
        System.out.println(i + " - " + j + " = " + (i - j));

        System.out.println();

        System.out.println("multiplication = " + multiplication);
        System.out.println(i + " x " + j + " = " + (i * j));

        System.out.println();

        System.out.println("division = " + division);
        System.out.println(i + " / " + j + " = " + (i / j));

        System.out.println();

        System.out.println("module = " + module);
        System.out.println(i + " % " + j + " = " + (i % j));
    }
}