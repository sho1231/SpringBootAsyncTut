package com.example.springboot.asynctutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
@EnableAsync
public class AsynctutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsynctutorialApplication.class, args);
	}

}
