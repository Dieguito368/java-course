package org.bagon.datetime.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        LocalDateTime datetime2 = LocalDateTime.now().plusHours(5);
        Duration duration = Duration.between(datetime, datetime2);

        System.out.println("duration = " + duration);
        System.out.println("Seconds: " + duration.getSeconds());
        System.out.println(duration.getNano());
        System.out.println("Minutes: " + duration.toMinutes());
    }
}
