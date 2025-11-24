public class Concatenation {
    public static void main(String[] args) {
        String course = "Java Programming";
        String professor = "Juan Pérez";
        String details = course + " with professor " + professor;

        System.out.println(details);

        int numberA = 10;
        int numberB = 5;

        System.out.println(details + numberA + numberB);
        System.out.println(details + (numberA + numberB));
        System.out.println(numberA + numberB + details);

        String details2 = course.concat(" with professor ").concat(professor);

        System.out.println(details2);
    }
}