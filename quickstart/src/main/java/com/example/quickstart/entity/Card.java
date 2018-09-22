package com.example.quickstart.entity;

import lombok.Data;

/**
 * 卡片类
 */
@Data
public class Card {
    private String avatar;
    private String name;
    private String lastuploadtime;
    private String title;
    private String intro;
    private String pic;
    private int like;
    private int good;

    public Card(String avatar, String name, String lastuploadtime, String title, String intro, String pic, int like, int good) {
        this.avatar = avatar;
        this.name = name;
        this.lastuploadtime = lastuploadtime;
        this.title = title;
        this.intro = intro;
        this.pic = pic;
        this.like = like;
        this.good = good;
    }
}
