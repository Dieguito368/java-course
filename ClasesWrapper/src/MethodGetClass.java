import java.lang.reflect.Method;

public class MethodGetClass {
    public static void main(String[] args) {
        String text = "Hello World";

        Class strClass = text.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass.getPackage() = " + strClass.getPackage());

        for(Method method: strClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();

        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getPackageName() = " + intClass.getPackageName());
        System.out.println("intClass.getPackage() = " + intClass.getPackage());

        for(Method method: intClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }
    }
}
