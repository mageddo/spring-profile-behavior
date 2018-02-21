package com.mageddo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class App {

	public static void main(String[] args) {
		final Environment env = SpringApplication.run(App.class).getBean(Environment.class);
		System.out.printf("app.name=%s, a=%s, b=%s%n", env.getProperty("app.name"), env.getProperty("a"), env.getProperty("b"));
	}

}
