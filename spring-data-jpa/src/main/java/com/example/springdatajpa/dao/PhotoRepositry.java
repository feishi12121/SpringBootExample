package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhotoRepositry extends JpaRepository<Photo,Integer> {
}
