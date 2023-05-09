package com.learning.basicSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBasic {
	public static void main(String[] args) {
		// Launch Spring Context
		var context = new AnnotationConfigApplicationContext(BasicSpringConfiguration.class);
		// Configure the things which we Spring framework to manage by launching
		// BasicSpringConfiguration --> @Configuration
		// Method --> @Bean(Name)
		System.out.println(context.getBean("Name"));
		System.out.println(context.getBean("Age"));
		System.out.println(context.getBean("Person"));
		System.out.println(context.getBean("Person2Method"));
		System.out.println(context.getBean("Person3Beans"));
		System.out.println(context.getBean("Person4Beans"));
		System.out.println(context.getBean("Person5Beans"));
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));
//		System.out.println("=================================== List of beans ===================================");
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//		System.out.println("=================================== Count of beans ===================================");
//		System.out.println(context.getBeanDefinitionCount());
//		System.out.println("================================= Definition of bean =================================");
//		System.out.println(context.getBeanDefinition("Name"));
		context.close();
	}
}
