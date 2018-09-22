package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.StudentRespository;
import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentRespository studentRespository;

    @Override
    public Student get(int id) {
        return studentRespository.findById(id).get();
    }

    @Override
    public List<Student> getAll() {
        return studentRespository.findAll();
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public void delete(int id) {
        studentRespository.deleteById(id);
    }

}
