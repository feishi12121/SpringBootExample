package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Random;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceImplTest {
    @Resource
    private StudentService studentService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void get() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void save() {
        String[] names = {"aa","bb","cc","dd","ee"};
        Random random = new Random();
        for (int i=0;i<5;i++) {
            Student student = new Student();
            student.setUserName(names[i]);
            student.setUserAge(random.nextInt(30));
            System.out.println(studentService.save(student));
        }
    }

    @Test
    public void delete() {
    }
}