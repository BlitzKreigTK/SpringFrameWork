package com.learning.LazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	@SuppressWarnings("unused")
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Class B is initialized");
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("Do Something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationAppLauncher {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LazyInitializationAppLauncher.class)) {
			context.getBean(ClassB.class).doSomething();
		}

	}
}
