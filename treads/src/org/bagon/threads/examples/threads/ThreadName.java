package org.bagon.threads.examples.threads;

public class ThreadName extends Thread {
    public ThreadName(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("The run method of the thread is started");

        for (int i = 0; i < 10 ; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(this.getName());
        }

        System.out.println("End the thread");
    }
}