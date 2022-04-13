package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String base() {
		return "Welcome!";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello User!";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin!";
	}

}
