package com.learning.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication has below dependencies which are implemented
//@SpringBootConfiguration --> Tells that this class is Configuration class just like @Configuration
//@EnableAutoConfiguration --> To enable auto configuration of depenedencies 
//@ComponentScan --> To scan packages for beans
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}
}
