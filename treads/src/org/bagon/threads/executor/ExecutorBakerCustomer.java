package org.bagon.threads.executor;

import org.bagon.threads.sync.Bakery;
import org.bagon.threads.sync.runnable.Baker;
import org.bagon.threads.sync.runnable.Customer;

import java.util.concurrent.*;

public class ExecutorBakerCustomer {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Pool size: " + executor.getPoolSize());
        System.out.println("Number of tasks in queue: " + executor.getQueue().size());

        Bakery bakery = new Bakery();
        Future<?> res = executor.submit(new Baker(bakery));
        Future<?> res2 = executor.submit(new Customer(bakery));

        System.out.println("Pool size: " + executor.getPoolSize());
        System.out.println("Number of tasks in queue: " + executor.getQueue().size());

        executor.shutdown();

        System.out.println("Continuing with the execution of the main");
    }
}