package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.PhotoRepositry;
import com.example.springdatajpa.entity.Photo;
import com.example.springdatajpa.entity.SysUser;
import com.example.springdatajpa.service.PhotoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoServiceImplTest {
    @Resource
    private PhotoService photoService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAll() {
        List<Photo> photos = photoService.getAll();
        photos.forEach(photo -> System.out.println(photo));
    }
}