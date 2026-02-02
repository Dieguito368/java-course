import java.lang.Math;

public class RandomMethod {
    public static void main(String[] args) {
        String[] colors = { "blue", "red", "pink", "black", "brown", "orange", "gray", "purple" };

        double random = Math.random();
        System.out.println("random = " + random);

        random *= colors.length;
        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colors[" + (int) random + "]" + " = " + colors[(int) random]);
    }
}
