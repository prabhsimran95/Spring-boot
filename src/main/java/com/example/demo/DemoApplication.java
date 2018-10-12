package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {
	
	@RequestMapping("/")
	String home() {
		return "<html><body><h1>Hello world</h1></body></html>";
	
	}
@RequestMapping("/new")
	String newForm() {
		return "<h2>hii</h2>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
