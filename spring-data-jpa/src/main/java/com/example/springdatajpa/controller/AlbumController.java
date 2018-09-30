package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.Album;
import com.example.springdatajpa.service.AlbumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.AbstractList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/album")
public class AlbumController {
    @Resource
    private AlbumService albumService;

    @GetMapping("/all")
    public List<Album> getAll(){
        return albumService.getAll();
    }

    @GetMapping("/order")
    public List<Album> findHotAlbum(){
        return albumService.findHotAlbum();
    }

    @GetMapping("/all/{name}")
    public Album findByAlbumTitle(@RequestParam String albumName){return albumService.findByAlbumTitle(albumName);}
}
