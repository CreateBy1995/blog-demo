package com.blog.loginclient.login.service;

import com.blog.loginclient.login.impl.LoginServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "LOGIN-SERVER" , fallback = LoginServiceHystrix.class)
public interface LoginService {
    @RequestMapping("login")
    String login();
}
