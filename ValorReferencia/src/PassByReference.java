public class PassByReference {
    public static void main(String[] args) {
        int[] age = { 10, 11, 12 };

        System.out.println("We start the main method");

        System.out.println("Before calling the main method");

        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i} = " + age[i]);

        }

        test(age);

        System.out.println("After calling the main method");

        for (int i = 0; i < age.length; i++) {
            System.out.println("age[i} = " + age[i]);

        }

        System.out.println("We finish with the main method");
    }

    public static void test(int[] ageArr) {
        System.out.println("We start the test method");

        for (int i = 0; i < ageArr.length; i++) {
            ageArr[i] = ageArr[i] + 20;
        }

        System.out.println("We finish with the test method");
    }
}
