package com.example.timing.service.impl;

import com.example.timing.dao.WalkerRepositry;
import com.example.timing.entity.Walker;
import com.example.timing.service.WalkerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WalkerServiceImpl implements WalkerService {
    @Resource
    private WalkerRepositry walkerRepositry;

    @Override
    public Walker findByAccountAndPassword(String account,String password) {
        return walkerRepositry.findByAccountAndPassword(account,password);
    }

    @Override
    public Walker get(Integer id) {
        return null;
    }

    @Override
    public List<Walker> getAll() {
        return walkerRepositry.findAll();
    }
}
