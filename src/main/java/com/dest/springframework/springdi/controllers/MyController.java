package com.dest.springframework.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String greetings(String name) {
		System.out.println("Hello " + name);
		return "Greeting generated";
	}
	
}
