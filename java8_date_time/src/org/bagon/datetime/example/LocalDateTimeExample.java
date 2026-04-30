package org.bagon.datetime.example;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now(); 
        System.out.println("datetime = " + datetime);

        datetime = LocalDateTime.of(2026, Month.APRIL, 28, 9, 7, 10);
        System.out.println("datetime = " + datetime);
        
        datetime = LocalDateTime.parse("2026-04-28T11:07:10");
        System.out.println("datetime = " + datetime);

        datetime = LocalDateTime.now().plusDays(1);
        System.out.println("datetime = " + datetime);

        String format = datetime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("datetime = " + format);
        String format2 = datetime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a"));
        System.out.println("datetime = " + format2);
    }
}