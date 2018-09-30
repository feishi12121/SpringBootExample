package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Album {
    @Id
    @GeneratedValue
    private Integer id;
    private String albumCover;
    private String albumTitle;
    private String albumDescription;
    private Integer likes;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "albumId",referencedColumnName = "id")
    private List<Photo> photos;

    public Album(String albumCover, String albumTitle, String albumDescription, Integer likes) {
        this.albumCover = albumCover;
        this.albumTitle = albumTitle;
        this.albumDescription = albumDescription;
        this.likes = likes;
    }

    public Album(String albumTitle){
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
