public class DefinitionStrings {
    public static void main(String[] args) {
        String course = "Java Programming";
        String course2 = new String("Java Programming");
        String course3 = "Java Programming";

        boolean isSameObject = course == course2;
        System.out.println("course == course2 = " + isSameObject);
        boolean isEqualValue = course.equals(course2);
        System.out.println("course.equals(course2) = " + isEqualValue);

        isSameObject = course == course3;
        System.out.println("course == course3 = " + isSameObject);
    }
}