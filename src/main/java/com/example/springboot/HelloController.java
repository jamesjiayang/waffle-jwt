package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/greeting")
	public String index() {
		
		return "Greetings from Spring Boot!";
		
	}
	
	
	@RequestMapping(SecurityConstants.SIGN_UP_URL)
	public String signUp() {
		
		return "signing up...";
		
	}

}
