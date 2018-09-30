package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.AlbumRepositry;
import com.example.springdatajpa.entity.Album;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumServiceImplTest {
    @Resource
    private AlbumRepositry albumRepositry;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void initData(){
        Album[] albums = {
                new Album("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3669703049,2881793439&fm=27&gp=0.jpg","麋鹿的生活","麋鹿相关",100),
                new Album("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=25569273,1318272322&fm=11&gp=0.jpg","稻田","感受大自然与人工美的结合",354),
                new Album("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3148430398,2329845638&fm=26&gp=0.jpg","芦苇荡","这是芦苇荡",211),
                new Album("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=201287909,3640358840&fm=200&gp=0.jpg","雨林","感受大自然的奇迹美",333),
                new Album("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2040721692,2209366190&fm=26&gp=0.jpg","天空","美丽的天空",667),
                new Album("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3982454796,889454059&fm=26&gp=0.jpg","红枫","啊！秋天最美",222)
        };
        for (int i = 0; i < 6; i++) {
            albumRepositry.save(albums[i]);
        }
    }

    @Test
    public void getAll() {
        List<Album> albumList = albumRepositry.findAll();
        albumList.forEach(album -> System.out.println(albumList));
    }

    @Test
    public void findHotAlbum() {
        List<Album> albums = albumRepositry.findHotAlbum();
        albums.forEach(album -> System.out.println(album));
    }

    @Test
    public void findByAlbumTitle() {
        Album album = albumRepositry.findByAlbumTitle("红枫");
        System.out.println(album);
    }
}