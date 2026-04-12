package org.bagon.threads.timer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduleTaskTimerPeriod {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger count = new AtomicInteger(3);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = count.getAndDecrement();

                if(i > 0) {
                    toolkit.beep();

                    System.out.println("Task " + (4 - i) + " completed on " +  new Date() + "\nThread name: " + Thread.currentThread().getName());
                } else {
                    System.out.println("Time´s up");
                    timer.cancel();
                }
            }
        }, 2000, 5000);

        System.out.println("We schedule a task every 5 seconds");
    }
}
