package com.dest.springframework.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dest.springframework.springdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {		//All this does is return the greeting from the Greeting Service
		return greetingService.sayGreeting();
	}
	
}
