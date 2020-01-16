package com.study.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author xueshiqi
 * @since 2020/1/8
 */
@Service
public class ScheduledTaskService {

    /**
     * 每隔5秒执行一次
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒钟执行一次"+ LocalTime.now());
    }

    /**
     * 每分钟的15-30秒触发，没6秒执行一次
     */
    @Scheduled(cron = "15-30/6 * * * * ? ")
    public void fixTimeExecution(){
        System.out.println("在指定的时间执行：" + LocalDateTime.now());
    }
}
