package org.bagon.datetime.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

        ZoneId newYork = ZoneId.of( "America/New_York");
        ZonedDateTime newYorkZone = dateTime.atZone(ZoneOffset.of("-04:00"));
        System.out.println("Departure times in New York: " + newYorkZone);

//        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime madridZone = newYorkZone.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Arrival time in Madrid: " + madridZone);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

        System.out.println("Trip Details");
        System.out.println("Departure in New York: " + dtf.format(newYorkZone));
        System.out.println("Arrival in Madrid: " + dtf.format(madridZone));

//        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}