package com.blog.loginserver.login.service;

import java.util.HashMap;
import java.util.Map;

public interface UserService {
    Map selectAll() ;
    void insertOne(HashMap hashMap) ;
}
