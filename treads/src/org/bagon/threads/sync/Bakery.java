package org.bagon.threads.sync;

public class Bakery {
    private String bread;
    private boolean available;

    public synchronized void bake(String masa) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        bread = masa;

        System.out.println("Baker baking " + bread);
        available = true;
        notify();
    }

    public synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("The customer consumes the " + bread);
        available = false;
        notify();
    }
}