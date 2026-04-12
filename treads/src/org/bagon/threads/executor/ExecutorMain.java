package org.bagon.threads.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task = () -> {
            System.out.println("Start of task...");
            try {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }

            System.out.println("The task is complete...");
        };

        executor.submit(task);
        executor.shutdown();
        System.out.println("Continuing with the execution of the main 1");
        executor.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Continuing with the execution of the main 2");
    }
}
