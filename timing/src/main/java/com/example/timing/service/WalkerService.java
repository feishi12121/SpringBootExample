package com.example.timing.service;

import com.example.timing.entity.Walker;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface WalkerService{
    Walker findByAccountAndPassword(String account,String password);
    Walker get(Integer id);
    List<Walker> getAll();
}
