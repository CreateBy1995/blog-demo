package com.blog.loginserver.login.controller;

import com.blog.loginserver.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private UserService userService ;
    private static int requestCount = 0 ;
    @RequestMapping(value = "login" , method = RequestMethod.GET)
    public String login() throws InterruptedException {
        System.out.println("请求次数为:------- "+requestCount++);
        Thread.sleep(3000);
        return "login1" ;
    }
    @RequestMapping(value = "user" , method = RequestMethod.GET)
    public Map userInfo(){
        return userService.selectAll() ;
    }
    @RequestMapping(value = "insert" , method = RequestMethod.GET)
    public void insert(){
        HashMap hashMap = new HashMap() ;
        hashMap.put("name","test") ;
        userService.insertOne(hashMap) ;
    }
}
