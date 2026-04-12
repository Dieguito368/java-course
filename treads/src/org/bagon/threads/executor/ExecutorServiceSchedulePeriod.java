package org.bagon.threads.executor;

import java.util.concurrent.*;

public class ExecutorServiceSchedulePeriod {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Some task in the main...");

        CountDownLatch lock = new CountDownLatch(5);

        Future<?> res = executor.scheduleAtFixedRate(() -> {

            System.out.println("Hello World!");

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                lock.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 0, 2000, TimeUnit.MILLISECONDS);

        lock.await();
        res.cancel(true);

        System.out.println("Any other tasks in the main...");
        executor.shutdown();
    }
}
