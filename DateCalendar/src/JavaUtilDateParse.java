import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Enter a date in dd/MM/yyyy format: ");
            Date date = dateFormat.parse(scanner.nextLine());

            System.out.println("date = " + date);
            System.out.println("formatted date = " + dateFormat.format(date));

            if(date.after(new Date())) {
                System.out.println("The entered date is after the current date");
            } else if(date.before(new Date())){
                System.out.println("The entered date is before the current date");
            } else if(date.equals(new Date())) {
                System.out.println("The entered date is equal to the current date");
            }

            System.out.println("date.compare(new Date()) = " + date.compareTo(new Date()));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
