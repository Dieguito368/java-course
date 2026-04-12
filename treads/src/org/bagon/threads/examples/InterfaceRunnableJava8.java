package org.bagon.threads.examples;

public class InterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();

        Runnable trip = () -> {
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(i + ": " + Thread.currentThread().getName());

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Finally trip: " + Thread.currentThread().getName());
            System.out.println(main.getName() + ": " + main.getState());
        };

        Thread v1 = new Thread(trip, "Veracruz");
        Thread v2 = new Thread(trip, "Oaxaca");
        Thread v3 = new Thread(trip,    "San Luis Potosi");
        Thread v4 = new Thread(trip, "Hidalgo");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();

        // Thread.sleep(100);
        System.out.println("Continuing with the execution of the main method: " + main.getName());
    }
}