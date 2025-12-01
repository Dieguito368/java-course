import javax.lang.model.SourceVersion;

public class IncreaseDecrease {
    public static void main(String[] args) {
        // INCREMENT
        // Pre-increment
        int i = 1;
        int j = ++i;

        System.out.println("/***** Increment *****/");
        System.out.println("<-- Pre-increment -->");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();

        // Post-increment
        i = 1;
        j = i++;

        System.out.println("<-- Post-increment -->");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();

        // DECREMENT
        // Pre-decrement
        i = 1;
        j = --i;

        System.out.println("/***** Decrement *****/");
        System.out.println("<-- Pre-decrement -->");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();

        // Post-decrement
        i = 1;
        j = i--;

        System.out.println("<-- Post-decrement -->");
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));

        System.out.println("j = " + j);
    }
}
