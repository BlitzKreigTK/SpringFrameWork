package com.learning.BusinessCalculation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class BusinessCalculationConfigurationAppLauncher {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(BusinessCalculationConfigurationAppLauncher.class);
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(DataServiceImpl.class).findMax());
		context.close();
	}
}
