package com.hello_world.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class HelloWorldController {

	@RequestMapping("/hellocall")
	public WebServiceResponse fetchRequest(@RequestParam(name="name") String name) {
		WebServiceResponse res = new WebServiceResponse();
		res.setSucess(true);
		res.setReturnObj(name);
        return res;
	}
	
}
