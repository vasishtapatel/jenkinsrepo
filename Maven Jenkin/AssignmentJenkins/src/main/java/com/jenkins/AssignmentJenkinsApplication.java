package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentJenkinsApplication.class, args);
		
		System.out.println("Hello Jenkins");
	}

}
