package com.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String getPage() {
		return "<h1>Jenkins</h1>";
	}

}
