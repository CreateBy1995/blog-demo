package com.blog.loginclient.login.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "LOGIN-SERVER")
public interface LoginService {
    @RequestMapping("login")
    String login();
}
