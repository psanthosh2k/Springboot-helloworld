package com.example.HelloWorld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String printHelloWorld() {
		return "Greetings from Bookzy.Welcome 2021!";
	}
}
