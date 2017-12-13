package com.easter.bunnies;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@SpringBootApplication
public class BunniesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BunniesApplication.class, args);
	}
}
