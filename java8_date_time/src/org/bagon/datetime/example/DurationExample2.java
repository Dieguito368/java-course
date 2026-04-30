package org.bagon.datetime.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class DurationExample2 {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Instant instant2 = Instant.now();

        Duration duration = Duration.between(instant, instant2);
        System.out.println("duration = " + duration);
    }
}