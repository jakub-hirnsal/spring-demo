package com.sda.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.sda")
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		SpringApplication.run(DemoApplication.class, args);
	}

}
