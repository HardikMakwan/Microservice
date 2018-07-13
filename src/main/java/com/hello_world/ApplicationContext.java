package com.hello_world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationContext {

	@RequestMapping("hello")
	public String hello() {
		
		return "hello_word";
	}
}
