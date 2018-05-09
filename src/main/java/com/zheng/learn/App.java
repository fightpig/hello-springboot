package com.zheng.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 此App类必须在最外层，则不能和要加载的其它类在同一层如
 * com.zheng.learn.controller
 *                      HelloController
 *                      App
 * 则启动springboot之后，加载不到HelloController
 * 必须是如此的格式：
 * com.zheng.learn.controller
 *                       HelloController
 *              App
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
