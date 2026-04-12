package org.bagon.threads.executor;

import java.util.concurrent.*;

public class ExecutorFutureMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            System.out.println("Start of task...");
            try {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }

            System.out.println("The task is complete...");

            return "Some important result of the task";
        };

        Future<?> res = executor.submit(task);
        executor.shutdown();
        System.out.println("Continuing with the execution of the main");

        // System.out.println(res.isDone());
        while (!res.isDone()) {
            System.out.println("Running Task... ");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Task result: " + res.get());
        System.out.println(res.isDone());
    }
}