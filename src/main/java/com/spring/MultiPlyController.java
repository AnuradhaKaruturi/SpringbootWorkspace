package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MultiPlyController {
	
	String url = "http://localhost:1975/wish/50/4";
	
	@GetMapping(value="/show")
	public Integer show() {
		RestTemplate rt = new RestTemplate();
		Integer res = rt.getForObject(url, Integer.class);
		return res;
		
	}

}
