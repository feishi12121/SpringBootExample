package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Book;
import org.hibernate.validator.constraints.URL;

import java.util.List;

public interface BookService {
    Book get(int id);
    List<Book> getAll();
    Book save(Book book);
}
