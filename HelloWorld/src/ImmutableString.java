public class ImmutableString {
    public static void main(String[] args) {
        String course = "Java Programming";
        String professor = "Juan Pérez";

        course.concat(professor);
        System.out.println("course = " + course);

        String withConcat = course.concat(professor);
        System.out.println("withConcat = " + withConcat);

        System.out.println(course == withConcat);

        System.out.println();

        course.transform(str -> str + " with professor " + professor);
        System.out.println("course = " + course);

        String withTransform = course.transform(str -> str + " with professor " + professor);
        System.out.println("withTransform = " + withTransform);

        System.out.println(course == withTransform);

        System.out.println();

        withConcat.replace("a", "A");
        System.out.println("withConcat = " + withConcat);

        String withReplace = withConcat.replace("a", "A");
        System.out.println("withReplace = " + withReplace);
    }
}
