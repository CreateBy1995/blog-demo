package com.blog.loginserver.login.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserDao {
    Map selectAll();

}