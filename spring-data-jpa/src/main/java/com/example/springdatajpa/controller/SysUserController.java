package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.SysUser;
import com.example.springdatajpa.service.SysUserService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/sysuser")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @GetMapping("/all")
    public List<SysUser> getAll() {
        return sysUserService.getAll();
    }

    @GetMapping("/{id}")
    public SysUser get(Long id) {
        return sysUserService.get(id);
    }

    @GetMapping("/account")
    public SysUser findByAccount(String account) {
        return sysUserService.findByAccount(account);
    }

    @GetMapping("/paixv")
    public List<SysUser> findUsers(@RequestParam String nickname) {
        return sysUserService.findUsers(nickname);
    }
}
