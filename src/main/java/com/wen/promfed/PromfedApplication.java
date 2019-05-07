package com.wen.promfed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
@ComponentScan
public class PromfedApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromfedApplication.class, args);
	}

}