package org.bagon.datetime.example;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(2026, 6, 30);

        Period period = Period.between(date, date2);
        System.out.println("period = " + period);

        System.out.printf(
            "Between the period %s and %s%n%d years %n%d months %n%d days%n",
            date,
            date2,
            period.getYears(),
            period.getMonths(),
            period.getDays()
        );
    }
}