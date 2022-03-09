package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class additionOfNumbers {
	
	@GetMapping(value="/api/hello")
	public int add(@RequestParam("val1") int first ,@RequestParam("val2") int second ) {
		int sum = first+second;
		return  sum;
	}

	@GetMapping(value="/wish/{val1}/{val2}")
	public int multiply(@PathVariable("val1") int first ,@PathVariable("val2") int second ) {
		int mul = first*second;
		return  mul;
	}
}
