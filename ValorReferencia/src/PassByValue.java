public class PassByValue {
    public static void main(String[] args) {
        int i = 10;

        System.out.println("We start the main method with i = " + i);

        test(i);

        System.out.println("We finish with the main method with i = " + i);
    }

    public static void test(int i) {
        System.out.println("We start the test method with i = " + i);

        i = 35;

        System.out.println("We finish with the test method with i = " + i);
    }
}