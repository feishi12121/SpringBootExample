package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.BookRespository;
import com.example.springdatajpa.entity.Book;
import com.example.springdatajpa.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookRespository bookRespository;

    @Override
    public Book get(int id) {
        return bookRespository.getOne(id);
    }

    @Override
    public List<Book> getAll() {
        return bookRespository.findAll();
    }

    @Override
    public Book save(Book book) {
        return bookRespository.save(book);
    }
}
