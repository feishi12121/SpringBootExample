package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.entity.SysUser;
import com.example.springdatajpa.service.SysUserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.query.Param;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {
    @Resource
    private SysUserService sysUserService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByAccount() {
        SysUser user = sysUserService.findByAccount("12341@qq.com");
        System.out.println(user);
    }

    @Test
    public void get() {
        SysUser user = sysUserService.get(1l);
        System.out.println(user);
    }

    @Test
    public void getAll() {
        List<SysUser> users = sysUserService.getAll();
        users.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void findUsers() {
        List<SysUser> userList1 = sysUserService.findUsers("张");
        userList1.forEach(sysUser -> System.out.println(sysUser));
    }
}