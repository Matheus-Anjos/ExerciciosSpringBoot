package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class HelloController {
	
	@GetMapping
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Generation";
	}
	
	@GetMapping
	@RequestMapping("/skills")
	public String Skills() {
		return "Habilidades e Mentalidades : Persistência, Atenção aos detalhes, Mentalidade de Crescimento";
	}
	
	@GetMapping
	@RequestMapping("/focus")
	public String Focus() {
		return "Revisão Java, Spring Boot, MVC e Git";
	}
	
	

}
