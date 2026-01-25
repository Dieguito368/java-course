import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2026, 0, 24, 19, 0, 0);
        calendar.set(2026, Calendar.JANUARY, 24, 19, 0, 0);
        Date date = calendar.getTime();

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.YEAR, 2025);
        calendar2.set(Calendar.MONTH, Calendar.JANUARY);
        calendar2.set(Calendar.DAY_OF_MONTH, 24);
        calendar2.set(Calendar.HOUR_OF_DAY, 19);
        calendar2.set(Calendar.MINUTE, 0);
        calendar2.set(Calendar.SECOND, 0);
        Date date2 = calendar2.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        System.out.println("date = " + dateFormat.format(date));
        System.out.println("date2 = " + dateFormat.format(date2));
    }
}
