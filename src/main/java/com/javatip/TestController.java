package com.javatip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/api/message")
	public String getMessage() {
		return "Welcome to ci cd git hub and docker helloss";
	}
}
