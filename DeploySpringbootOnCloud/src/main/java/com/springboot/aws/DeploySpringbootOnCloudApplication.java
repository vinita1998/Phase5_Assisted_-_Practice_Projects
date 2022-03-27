package com.springboot.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeploySpringbootOnCloudApplication {
	@GetMapping("/")
	public String home() {
		return "Welcome to AWS First Deployment...  DEPLOY SPRINGBOOT TO AWS";
	}

	public static void main(String[] args) {
		SpringApplication.run(DeploySpringbootOnCloudApplication.class, args);
	}

}
