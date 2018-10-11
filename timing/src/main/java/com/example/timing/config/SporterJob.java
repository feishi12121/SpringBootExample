package com.example.timing.config;

import com.example.timing.service.UpdateService;
import com.example.timing.service.WalkerService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SporterJob {

    @Resource
    private UpdateService updateService;

    @Scheduled(cron = "0 26 22 * * ?")
    public void updateTodayWalks() throws Exception {
        updateService.updateWalks();
    }
}
