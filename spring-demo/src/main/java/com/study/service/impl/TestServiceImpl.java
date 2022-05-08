package com.study.service.impl;

import com.study.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Author lin
 * @Create 2022/5/8 19:01
 */
@Service(value = "TestService")
public class TestServiceImpl implements TestService {
	@Override
	public String sayHello(String name) {
		System.out.println("Last Dance，author："+name);
		return "";
	}
}
