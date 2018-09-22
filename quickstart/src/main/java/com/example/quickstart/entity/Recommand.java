package com.example.quickstart.entity;

import lombok.Data;

@Data
public class Recommand {
    private String pic;
    private String name;

    public Recommand(String pic, String name) {
        this.pic = pic;
        this.name = name;
    }
}
