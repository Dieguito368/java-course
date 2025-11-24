public class ValidateString {
    public static void main(String[] args) {
        String course = null;

        boolean isNull = course == null;
        System.out.println("isNull = " + isNull);

        if(isNull) course = " ";

        // boolean isEmpty = course.length() == 0;
        boolean isEmpty = course.trim().isEmpty();
        System.out.println("isEmpty = " + isEmpty);

        if(isEmpty) return;

        course = course.toUpperCase();

        System.out.println("Welcome to the course ".concat(course));
    }
}
