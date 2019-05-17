package com.blog.loginclient.login.impl;

import com.blog.loginclient.login.service.LoginService;
import org.springframework.stereotype.Component;

/**
 * Hystrix 回调类
 */
@Component
public class LoginServiceHystrix implements LoginService{

    @Override
    public String login() {
        return "call loginService failed" ;
    }
}
