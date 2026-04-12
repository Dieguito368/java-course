package org.bagon.threads.sync.runnable;

import org.bagon.threads.sync.Bakery;

public class Customer implements Runnable {
    private final Bakery bakery;

    public Customer(Bakery bakery) {
        this.bakery = bakery;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            this.bakery.consume();
        }
    }
}
