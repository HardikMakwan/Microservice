package com.hello_world.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hellocall")
	public String fetchRequest(@RequestParam(name="name",required=false,
	defaultValue="This is spring Boot Demo") String name) {
		return "Response Message : "+name; 
	}
}
