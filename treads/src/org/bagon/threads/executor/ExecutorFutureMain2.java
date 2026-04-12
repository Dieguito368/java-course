package org.bagon.threads.executor;

import java.util.concurrent.*;

public class ExecutorFutureMain2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        System.out.println("Pool size: " + executor.getPoolSize());
        System.out.println("Number of tasks in queue: " + executor.getQueue().size());

        Callable<String> task = () -> {
            System.out.println("Start of task 1...");
            System.out.println("Thread name: " + Thread.currentThread().getName());

            TimeUnit.SECONDS.sleep(3);

            System.out.println("The task 1 is complete...");

            return "Some important result of the task 1";
        };

        Callable<String> task2 = () -> {
            System.out.println("Start of task 2...");
            System.out.println("Thread name: " + Thread.currentThread().getName());

            TimeUnit.SECONDS.sleep(3);

            System.out.println("The task 2 is complete...");

            return "Some important result of the task 2";
        };

        Callable<Integer> task3 = () -> {
            System.out.println("Start of task 3...");
            System.out.println("Thread name: " + Thread.currentThread().getName());

            TimeUnit.SECONDS.sleep(3);

            System.out.println("The task 3 is complete...");

            return 10;
        };

        Future<String> res = executor.submit(task);
        Future<String> res2 = executor.submit(task2);
        Future<Integer> res3 = executor.submit(task3);

        System.out.println("Pool size: " + executor.getPoolSize());
        System.out.println("Number of tasks in queue: " + executor.getQueue().size());

        executor.shutdown();

        System.out.println("Continuing with the execution of the main");

        while (!(res.isDone() && res2.isDone() && res3.isDone())) {
            System.out.println("Running Task... ");
            TimeUnit.SECONDS.sleep(1);
        }
    }
}