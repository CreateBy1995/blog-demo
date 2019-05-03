package com.blog.loginservercopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoginServerCopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginServerCopyApplication.class, args);
	}

}
