package com.example.HelloWorld;

import org.junit.runner.RunWith;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.springframework.boot.SpringApplication;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

@SpringBootTest
public class HelloWorldApplicationTests {

	
	private final ByteArrayOutputStream  textout = new ByteArrayOutputStream();
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(textout));
	}
	@Test
	public void testHelloWorldConstructor() {
		try{
			new HelloWorldApplication();
		}catch(Exception e){
			fail("Construction failed!");
		}
	}
	@Test
	public void testHelloWorldApplicationMain(){
		HelloWorldApplication.main(new String[] {"a","b"});
		try{

			assertNotEquals("Greetings from Bookzy!" + System.getProperty("line.seperator"), textout.toString());
			
		}catch (AssertionError e) {
			fail("\"message\" is not \"Greetings from Bookzy!\"");
		}
	}
	
	@After
	public void cleanUpStreams(){
		System.setOut(null);
	}

}
