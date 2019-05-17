package com.blog.loginservercopy.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private static int requestCount = 0 ;
    @RequestMapping("login")
    public String login() throws InterruptedException {
        System.out.println("请求次数为:------- "+requestCount++);
        Thread.sleep(2000);
        return "login22" ;
    }
}
