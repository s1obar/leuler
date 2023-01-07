package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectEulerSolutionsApplication {
	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(ProjectEulerSolutionsApplication.class);
		sa.run(args);
	}
}
