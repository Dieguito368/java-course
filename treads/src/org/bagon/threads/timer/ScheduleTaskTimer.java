package org.bagon.threads.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleTaskTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task completed on " +  new Date() + "\nThread name: " + Thread.currentThread().getName());
                System.out.println("Time´s up");
                timer.cancel();
            }
        }, 5000);

        System.out.println("We will schedule a task for 5 more minutes...");
    }
}
