package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.entity.Book;
import com.example.springdatajpa.entity.Student;
import com.example.springdatajpa.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceImplTest {
    @Resource
    private BookService bookService;

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
//        List<Book> books = new ArrayList<>();
//        books.add(book1);
//        book1.setId(2);
//        Book book1 = new Book();
//        book1.setAuthor("莎士比亚111");
//        book1.setIntro("四大悲剧111");
//        book1.setName("李尔王111");
//        book1.setPrice(99.9);
//        book1.setPic("11.png");
//        System.out.println(bookService.save(book1));
    }
}