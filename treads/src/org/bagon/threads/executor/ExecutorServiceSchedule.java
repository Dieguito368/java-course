package org.bagon.threads.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceSchedule {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Some task in the main...");

        executor.schedule(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello World!");
        }, 0, TimeUnit.SECONDS);

        executor.shutdown();

        System.out.println("Any other tasks in the main...");
    }
}
