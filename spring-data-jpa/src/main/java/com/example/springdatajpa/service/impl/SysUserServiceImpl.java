package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.SysUserRespository;
import com.example.springdatajpa.entity.SysUser;
import com.example.springdatajpa.service.SysUserService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRespository sysUserRespository;

    @Override
    public SysUser findByAccount(String account) {
        return sysUserRespository.findByAccount(account);
    }


    @Override
    public SysUser get(Long id) {
        return sysUserRespository.findById(id).get();
    }

    @Override
    public List<SysUser> getAll() {
        return sysUserRespository.findAll();
    }

    @Override
    public List<SysUser> findUsers(String nickname) {
        return sysUserRespository.findUsers(nickname);
    }

}
