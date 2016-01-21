package com.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}

	@RequestMapping("hi")
	@ResponseBody
	public String hi() {
		return "Hello, world.";
	}

	@RequestMapping("/h/{id}/h")
	public String test(@PathVariable("id") Long id) {
		System.out.println(id);
		return "hello";
	}

	@RequestMapping(value="/addUser",method=RequestMethod.GET)
	public String addUser() {
		return "addUser";
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUserSubmit(@RequestParam("firstName") String fn) {
		System.out.println(fn);
		return "addUser";
	}
}
