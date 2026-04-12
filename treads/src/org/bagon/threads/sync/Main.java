package org.bagon.threads.sync;

import org.bagon.threads.sync.runnable.Baker;
import org.bagon.threads.sync.runnable.Customer;

public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        new Thread(new Baker(bakery)).start();
        new Thread(new Customer(bakery)).start();
    }
}
