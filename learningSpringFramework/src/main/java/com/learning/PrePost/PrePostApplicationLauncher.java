package com.learning.PrePost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("Some Dependency Injected");
	}

	@PostConstruct
	public void initialize() {
		someDependency.getReady();
		System.out.println("Initialization done");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("CleanUp done");
	}
}

@Component
class SomeDependency {
	public void getReady() {
		System.out.println("Some Dependency");
	}
}

@Configuration
@ComponentScan
public class PrePostApplicationLauncher {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PrePostApplicationLauncher.class)) {
		}
	}
}
