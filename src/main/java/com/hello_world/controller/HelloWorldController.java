package com.hello_world.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWithName(@RequestParam(name="name",required=false,defaultValue="world") String name) {
		return "hello : "+name;
	}
	
	@RequestMapping("/hello/{name}")
	public String helloWithNameInPath(@PathVariable("name") String name) {
		return "hello : "+name;
	}
}
