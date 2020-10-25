package com.devops.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication {

	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println("git plugin added");
		SpringApplication.run(DevopsApplication.class, args);
	}

}
