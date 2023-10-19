package com.test.fitmyjob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/home")
	public String ss() {
		System.out.println("Hello");
		System.out.println();
		System.out.println("u nm ccfcfx");
		System.out.println("Utkarsh Sysaten");
		return "hello working";
	}
}
