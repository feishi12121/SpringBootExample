package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRespository extends JpaRepository<Student,Integer> {
}
