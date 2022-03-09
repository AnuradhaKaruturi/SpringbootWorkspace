package com.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PutMappingNumbers {
	
	@PutMapping(value="/putting/{one}")
	public String getNumbers(@PathVariable("one") int first) {
		return "number  is -->" + first;
		
	}


}
