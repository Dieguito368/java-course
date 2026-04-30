package org.bagon.api.stream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamInfiniteGenerate {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger(0);

        Stream.generate(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return count.incrementAndGet();
        }).limit(10).forEach(System.out::println);
    }
}
