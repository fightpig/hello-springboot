package com.zheng.learn.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTests {

	@Resource
	HelloController hc;

	@Test
	public void contextLoads() {
		String re = hc.sayHello();
		System.out.println(re);
	}

}
