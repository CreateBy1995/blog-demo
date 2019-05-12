package com.blog.loginserver.login.controller;

import com.blog.loginserver.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private UserService userService ;
    @RequestMapping("login")
    public String login(){
        return "login1" ;
    }
    @RequestMapping("user")
    public Map userInfo(){
        return userService.selectAll() ;
    }
}
