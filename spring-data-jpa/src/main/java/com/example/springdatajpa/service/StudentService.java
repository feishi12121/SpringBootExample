package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Student;

import java.util.List;

public interface StudentService {
    Student get(int id);
    List<Student> getAll();
    Student save(Student student);
    void delete(int id);
}
