package com.example.springdatajpa.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Photo {
    @Id
    @GeneratedValue
    private Integer id;
    private String photoUrl;
    private String photoName;
    private String photoDescription;

    public Photo(String photoUrl, String photoName, String photoDescription) {
        this.photoUrl = photoUrl;
        this.photoName = photoName;
        this.photoDescription = photoDescription;
    }
    public void Photo(){

    }
}
