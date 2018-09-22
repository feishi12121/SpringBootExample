package com.example.springdatajpa.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String intro;
    private String pic;
    private double price;
    private String author;

}
