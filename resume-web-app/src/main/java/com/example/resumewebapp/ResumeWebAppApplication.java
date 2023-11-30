package com.example.resumewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TO DOs:
// 1. Check id all fields are completed (show an error if a field is empty)
// 2. Change the database for dat to persist between site reloads
// 3. Search resume using education or skills fields
// 4. 

@SpringBootApplication
public class ResumeWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeWebAppApplication.class, args);
	}

}
