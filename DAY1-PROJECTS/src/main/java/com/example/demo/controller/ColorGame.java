package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorGame {
	@GetMapping("/colorgame")
	public String getMyfav() {
		String color="Orange";
		return "My favorite color is "+color;
	}

}
