package org.bagon.threads.examples.runnable;

public class TripTask implements Runnable {
    private final String name;

    public TripTask(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + ": " + name);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Finally trip: " + name);
    }
}
