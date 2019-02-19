package com.fullrest.restApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fullrest.restApi.response.Greeting;

@RestController
public class GreetingController {

	 private static final String template = "This is Rest Api Service! Hello, %s!";

	    @RequestMapping("/greeting")
	    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	    	Greeting greeting= new Greeting();
	    	greeting.setId(1);
	    	greeting.setContent(String.format(template, name));
	        return greeting;
	    }
}
