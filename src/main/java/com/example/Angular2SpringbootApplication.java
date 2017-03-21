package com.example;

import java.lang.System.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Angular2SpringbootApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.trigger-file", "true");
		SpringApplication.run(Angular2SpringbootApplication.class, args);
	}
}
