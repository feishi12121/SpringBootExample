package com.example.timing.service.impl;

import com.example.timing.dao.WalkerRepositry;
import com.example.timing.entity.Walker;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WalkerServiceImplTest {
    @Resource
    private WalkerRepositry walkerRepositry;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByAccount() {
    }

    @Test
    public void get() {

    }

    @Test
    public void getAll() {
        List<Walker> walkerList = walkerRepositry.findAll();
        walkerList.forEach(walker -> System.out.println(walkerList));
    }
}