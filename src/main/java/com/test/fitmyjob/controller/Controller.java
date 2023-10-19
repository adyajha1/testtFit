package com.test.fitmyjob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/home")
	public String ss() {
		System.out.println("Hello");
		return "hello working";
	}
}
