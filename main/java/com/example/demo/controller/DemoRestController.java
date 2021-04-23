package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/demo")
public class DemoRestController {

	@RequestMapping( { "" , "/" , "/home" } )
	public String sayHello() {
	return "Hello from Bridgelabz!"; 
	}
	
	@GetMapping("/hello1")
	public String hello(@RequestParam(name="name") String name)
	{
		return "Hello " + name;
	}
	
	  @GetMapping("/hello2/{name}")
	  public String hello2(@PathVariable("name") String name)
	  {
	      return "Hello " + name;
	  }

	  
	  @PostMapping("/post")
	    public String sayHello(@RequestBody User user) {
	        return "Hello" + user.getFirstName() + " " +user.getLastName()+"!";
	   }
	  
	  @PutMapping("/put/{a}")
	  public String sayHelloPut(@PathVariable String firstName,
			  @RequestParam(value = "lastName") String lastName){
		return "Hello "+firstName+ " "+ lastName+"!";  
	  }
	  
}
	




