package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.SysUser;
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
public class SysUserRespositoryTest {
    @Resource
    private SysUserRespository sysUserRespository;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByAccount() {
        SysUser user = sysUserRespository.findByAccount("12341@qq.com");
        System.out.println(user);
    }

    @Test
    public void findByFans() {
        List<SysUser> users = sysUserRespository.findByFans(300);
        users.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void findByAccountAndNickname() {
        SysUser user = sysUserRespository.findByAccountAndNickname("12345@qq.com","小猪");
        System.out.println(user);
    }
}