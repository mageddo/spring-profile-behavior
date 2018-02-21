package com.mageddo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class App {

	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(App.class).getBean(App.class).doTest();
	}

	public void doTest(){
		System.out.println("success");
	}
}
