package org.bagon.threads.examples;

import org.bagon.threads.examples.threads.ThreadName;

public class ExtendThread{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new ThreadName("Diego BG");
        thread.start();

        Thread thread2 = new ThreadName("Ivone BG");
        thread2.start();

        ThreadName thread3 = new ThreadName("Nancy BG");
        thread3.start();
    }
}