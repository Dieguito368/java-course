import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = dateFormat.format(date);
        System.out.println("dateString = " + dateString);

        long addition = 0;

        for (int i = 1; i < 10000000; i++) {
            addition += i;
        }

        System.out.println("addition = " + addition);

        Date date2 = new Date();

        long time = date2.getTime() - date.getTime();
        System.out.println("time = " + time);
    }
}