package com.blog.loginserver.login.impl;

import com.blog.loginserver.login.dao.UserDao;
import com.blog.loginserver.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao ;
    @Override
    public Map selectAll() {
        return userDao.selectAll() ;
    }

    @Override
    @Transactional
    public void insertOne(HashMap hashMap) {
        userDao.insertOne(hashMap);
    }
}
