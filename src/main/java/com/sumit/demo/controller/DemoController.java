package com.sumit.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/dockertest")
	public String testData() {
		return "Hi Sumit";
	}
}
