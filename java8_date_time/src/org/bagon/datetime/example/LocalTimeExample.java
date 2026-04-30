package org.bagon.datetime.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);

        System.out.println("Hour: " + now.getHour());
        System.out.println("Minutes: " + now.getMinute());
        System.out.println("Seconds: " + now.getSecond());

        System.out.println();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String formattedTime = now.format(df);
        System.out.println("formattedTime = " + formattedTime);
    }
}