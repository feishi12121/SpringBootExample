package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.SysUser;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SysUserRespository extends JpaRepository<SysUser,Long> {
    SysUser findByAccount(String account);
    List<SysUser> findByPasswordEquals(String password);


    @Query("from SysUser u where u.nickname like %:nickname% order by u.fans desc ")
    List<SysUser> findUsers(@Param("nickname") String nickname);
}
