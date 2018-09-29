package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Album;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumService {
    List<Album> getAll();
    List<Album> findHotAlbum();
}
