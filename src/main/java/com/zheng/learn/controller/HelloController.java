package com.zheng.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello Spring Boot";
    }

    /**
     * 使用@EnableAutoConfiguration，相当于@SpringBootApplication
     */
//    public static void main(String[] args) {
//        SpringApplication.run(HelloController.class, args);
//    }
}
