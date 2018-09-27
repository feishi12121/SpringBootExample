package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.SysUser;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SysUserRespository extends JpaRepository<SysUser,Long> {
    SysUser findByAccount(String account);
    List<SysUser> findByFans(Integer fans);
    SysUser findByAccountAndNickname(String account,String nickName);
}
