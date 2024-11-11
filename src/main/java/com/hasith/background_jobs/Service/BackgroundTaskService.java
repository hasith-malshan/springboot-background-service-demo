package com.hasith.background_jobs.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BackgroundTaskService {

    // This task runs every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void performTask() {
        System.out.println(Thread.currentThread().getName() + " Task executed at: " + LocalDateTime.now());
    }

    // This task runs at a fixed delay after the last task finishes
    @Scheduled(fixedDelay = 5000)
    public void performDelayedTask() {
        System.out.println(Thread.currentThread().getName() + " Delayed Task executed at: " + LocalDateTime.now());
    }

    // This task runs according to a cron expression (e.g., every day at 2 AM)
    @Scheduled(cron = "0 0 2 * * ?")
    public void performCronTask() {
        System.out.println(Thread.currentThread().getName() + " Cron task executed at: " + LocalDateTime.now());
    }

}
