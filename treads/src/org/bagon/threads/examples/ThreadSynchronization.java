package org.bagon.threads.examples;

import org.bagon.threads.examples.runnable.PrintPhrases;

public class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new PrintPhrases("Hi ", "how are you?"));
        Thread t2 = new Thread(new PrintPhrases("Who ", "are you?"));
        Thread t3 = new Thread(new PrintPhrases("Thanks you ", "so much"));
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(600);
        System.out.println("Thread 1: " + t1.getState());
        System.out.println("Thread 2: " + t2.getState());
        System.out.println("Thread 3: " + t3.getState());
    }

    public synchronized static void printPhrases(String phrase1, String phrase2) {
        System.out.print(phrase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(phrase2);
    }
}