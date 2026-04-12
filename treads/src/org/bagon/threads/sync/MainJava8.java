package org.bagon.threads.sync;

import java.util.concurrent.ThreadLocalRandom;

public class MainJava8 {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                bakery.bake("Bread no. " + i);

                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 1; i <= 10 ; i++) {
                bakery.consume();
            }
        }).start();
    }
}