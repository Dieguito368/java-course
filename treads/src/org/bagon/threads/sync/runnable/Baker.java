package org.bagon.threads.sync.runnable;

import org.bagon.threads.sync.Bakery;

import java.util.concurrent.ThreadLocalRandom;

public class Baker implements Runnable {
    private final Bakery bakery;

    public Baker(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            bakery.bake("Bread no. " + i);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
