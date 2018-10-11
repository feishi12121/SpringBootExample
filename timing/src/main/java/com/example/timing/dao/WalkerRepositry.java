package com.example.timing.dao;

import com.example.timing.entity.Walker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalkerRepositry extends JpaRepository<Walker,Integer> {
    Walker findByAccountAndPassword(String account,String password);
}
