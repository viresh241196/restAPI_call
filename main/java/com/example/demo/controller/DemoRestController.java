package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoRestController {

	@RequestMapping( { "" , "/" , "/home" } )
	public String sayHello() {
	return "Hello from Bridgelabz!"; 
		}
}
	




