package com.revature.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //endpoints return only data, not views
public class HelloWorldController {
	
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<>("Hello!", HttpStatus.OK);
	}
}
