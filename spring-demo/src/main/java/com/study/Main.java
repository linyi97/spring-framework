package com.study;

import com.study.config.TestConfig;
import com.study.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author lin
 * @Create 2022/5/8 19:28
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);

		TestService testService = (TestService) context.getBean("TestService");
		testService.sayHello("林北");
	}
}
