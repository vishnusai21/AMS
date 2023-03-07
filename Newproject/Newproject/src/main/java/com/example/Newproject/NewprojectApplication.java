package com.example.Newproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(NewprojectApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}
}