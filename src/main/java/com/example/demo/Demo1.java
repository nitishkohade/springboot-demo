package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class Demo1 {

	@GetMapping("/g")
	public User g() {
		throw new NotFound("jjj");
	}
}
