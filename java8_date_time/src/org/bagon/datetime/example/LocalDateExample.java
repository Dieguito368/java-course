package org.bagon.datetime.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        System.out.println();

        System.out.println("<------- Get Month -------->");
        Month month = currentDate.getMonth();
        System.out.println("Month: " + month );
        System.out.println("Number of the month: " + month.getValue());
        System.out.println("Month in Spanish: " + month.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        System.out.println("\n<------- Get Day -------->");

        DayOfWeek day = currentDate.getDayOfWeek();
        System.out.println("Day: " + day );
        System.out.println("Number of the week: " + day.getValue());
        System.out.println("Day in Spanish: " + day.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        System.out.println();

        LocalDate date = LocalDate.of(2026, 1, 1);
        System.out.println("date = " + date);

        LocalDate date2 = LocalDate.of(2026, Month.FEBRUARY, 2);
        System.out.println("date2 = " + date2);

        LocalDate date3 = LocalDate.parse("2026-03-03");
        System.out.println("date3 = " + date3);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow = " + tomorrow);

        LocalDate previousMonth = LocalDate.now().minusMonths(1);
        System.out.println("previousMonth = " + previousMonth);

        DayOfWeek tuesday = LocalDate.now().getDayOfWeek();
        System.out.println("tuesday = " + tuesday);

        int dayNumber = LocalDate.of(2002, 11, 13).getDayOfMonth();
        System.out.println("dayNumber = " + dayNumber);

        boolean isLeapYear = LocalDate.now().isLeapYear();
        System.out.println("isLeapYear = " + isLeapYear);

        boolean  isBefore = LocalDate.now().isBefore(LocalDate.parse("2026-04-04"));
        System.out.println("isBefore = " + isBefore);

        boolean isAfter = LocalDate.now().isAfter(LocalDate.parse("2026-05-05"));
        System.out.println("isAfter = " + isAfter);
    }
}
