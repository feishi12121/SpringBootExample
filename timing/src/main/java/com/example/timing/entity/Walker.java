package com.example.timing.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Walker implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private String password;
    private String nickname;
    private String avatar;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "account",referencedColumnName = "account")
    private List<SportData> sportDataList;

    public Walker(String account, String password, String nickname, String avatar, List<SportData> sportDataList) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
        this.sportDataList = sportDataList;
    }
}
