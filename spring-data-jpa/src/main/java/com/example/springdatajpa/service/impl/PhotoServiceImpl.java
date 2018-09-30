package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.PhotoRepositry;
import com.example.springdatajpa.entity.Photo;
import com.example.springdatajpa.service.PhotoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {
    @Resource
    private PhotoRepositry photoRepositry;

    @Override
    public List<Photo> getAll() {
        return photoRepositry.findAll();
    }
}
