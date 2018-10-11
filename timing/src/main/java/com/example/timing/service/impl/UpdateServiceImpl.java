package com.example.timing.service.impl;

import com.example.timing.dao.SportDataRepositry;
import com.example.timing.entity.SportData;
import com.example.timing.service.UpdateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class UpdateServiceImpl implements UpdateService {
    @Resource
    private SportDataRepositry sportDataRepositry;

    @Override
    public void updateWalks() {
        List<SportData> list = sportDataRepositry.findAll();
        Random random = new Random();
        for (int i=0;i <list.size();i++) {
            SportData sportData = list.get(i);
            sportData.setSteps(random.nextInt(2000)+2000);
            sportData.setDate(new Date());
            sportDataRepositry.saveAndFlush(sportData);
        }
    }
}
