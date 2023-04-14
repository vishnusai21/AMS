package com.example.major;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableJpaRepositories("com.example.major")
@ComponentScan("com.example.major")
@EntityScan("com.example.major.entity")
public class MajorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajorApplication.class, args);
	}

public void ant(){

}
}
