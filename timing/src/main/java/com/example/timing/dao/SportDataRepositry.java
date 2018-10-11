package com.example.timing.dao;

import com.example.timing.entity.SportData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportDataRepositry extends JpaRepository<SportData,Integer> {
}
