package com.dest.springframework.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dest.springframework.springdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	@Autowired
	GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	
}
