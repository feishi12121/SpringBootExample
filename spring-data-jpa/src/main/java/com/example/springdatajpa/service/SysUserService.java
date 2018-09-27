package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.SysUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SysUserService {
    SysUser findByAccount(String account);
    SysUser get(Long id);
    List<SysUser> getAll();
    List<SysUser> findUsers(String nickname);
}
