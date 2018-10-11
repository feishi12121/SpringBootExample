package com.example.timing.entity;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

@Component
public class TimeService {
//    /**
//     * 通过时间表达式执行定时任务
//     */
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void timerToNow(){
//        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//    }
//    /**
//     *启动时间点之后 X毫秒秒执行一次
//     */
//    @Scheduled(fixedRate = 10000)
//    public void timerToZZP(){
//        System.out.println("fixedRate:" + new Random().nextLong() + new SimpleDateFormat("HH:mm:ss").format(new Date()));
//    }
//    /**
//     * 结束时间点之后 每X毫秒执行一次
//     */
//    @Scheduled(fixedDelay = 10000)
//    public void timerToReportCount(){
//        System.out.println("fixedDelay:" + new Random().nextLong() + new SimpleDateFormat("HH:mm:ss").format(new Date()));
//    }
//    /**
//     * 第一次延迟 X毫秒执行，之后按照fixedRate的规则每X毫秒执行
//     */
//    @Scheduled(initialDelay = 1000,fixedRate = 10000)
//    public void timerToReport(){
//        System.out.println("initialDelay:" + new Random().nextLong() + new SimpleDateFormat("HH:mm:ss").format(new Date()));
//    }
//
//    public static void main(String[] args) {
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                LocalDateTime current = LocalDateTime.now();
//                String timeString = current.format(DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss"));
//                System.out.println("time task"+ timeString);
//            }
//        };
//        Timer timer = new Timer();
//        timer.schedule(timerTask,3000,1000);
//    }
}
