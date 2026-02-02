import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        String[] colors = { "blue", "red", "pink", "black", "brown", "orange", "gray", "purple" };

        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        long randomLong = random.nextLong();
        System.out.println("randomLong = " + randomLong);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        int colorPosition = random.nextInt(colors.length);
        System.out.println("colors[" + colorPosition + "]" + " = " + colors[colorPosition]);
    }
}