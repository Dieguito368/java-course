import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter your date of birth in dd/MM/yyyy format: ");

        try {
            Date dateBirth = dateFormat.parse(scanner.next());

            long currentTime = new Date().getTime();
            long dateBirthTime = dateBirth.getTime();
            long differenceTime = currentTime - dateBirthTime;

            float days = (float) differenceTime / 86400000;
            int years = (int) days / 365;

            System.out.println("Your age is: " + years + " years");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
