package org.bagon.threads.examples;

import org.bagon.threads.examples.runnable.TripTask;

public class InterfaceRunnable {
    public static void main(String[] args) {
        new Thread(new TripTask("Veracruz")).start();
        new Thread(new TripTask("Oaxaca")).start();
        new Thread(new TripTask("San Luis Potosi")).start();
        new Thread(new TripTask("Hidalgo")).start();
    }
}