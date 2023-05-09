package com.learning.basicSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record creates a class with getter, setter, constructor and toString() with variables
record Person(String name, int age, Address address) {
}

record Address(String firstLine, String city) {

}

// Annotates a Spring configuration
@Configuration
public class BasicSpringConfiguration {
	// Objects managed by Spring container
	@Bean(name = "Name")
	public String name() {
		return "Tulsi Kant";
	}

	@Bean(name = "Age")
	public int age() {
		return 25;
	}

	@Bean(name = "Person")
	@Primary
	public Person person() {
		return new Person("SatyaPrakash", 26, new Address("Sector 137", "Noida"));
	}

	@Bean(name = "Person2Method") // Using existing bean methods
	public Person person2() {
		return new Person(name(), age(), address2());
	}

	@Bean(name = "Address2Method")
	@Primary
	public Address address2() {
		return new Address("Shanti Niketan", "Patna");
	}

	@Bean(name = "Person3Beans") // Using existing bean names
	public Person person3(String Name, int Age, Address Address3Beans) {
		return new Person(Name, Age, Address3Beans);
	}

	@Bean(name = "Address3Beans")
	@Qualifier("Address3Qualifier")
	public Address address3() {
		return new Address("Okhla", "Delhi");
	}

	@Bean(name = "Person4Beans") // Using existing bean names
	public Person person4(String Name, int Age, Address address) {
		return new Person(Name, Age, address);
	}

	@Bean(name = "Person5Beans") // Using existing bean names
	public Person person5(String Name, int Age, @Qualifier("Address3Qualifier") Address address) {
		return new Person(Name, Age, address);
	}
}
