package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespository extends JpaRepository<Book ,Integer> {
}
