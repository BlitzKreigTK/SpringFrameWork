package com.learning.XMLConfigurations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.BusinessCalculation.DataServiceImpl;

public class XMLAppLauncherConfiguration {

	public static void main(String[] args) {
		try (var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml")) {
			System.out.println("====================Running beans from Java Package=====================");
			System.out.println("Name == " + context.getBean("name"));
			System.out.println("Age == " + context.getBean("age"));
			System.out.println("=============Running beans from BusinessCalculation Package=============");
			System.out.println(context.getBean(DataServiceImpl.class).findMax());
		}
	}

}
