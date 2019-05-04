package com.blog.loginclient.login.controller;

import com.blog.loginclient.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService ;
    @RequestMapping("login")
    public String login(){
        return loginService.login() ;
    }
}
