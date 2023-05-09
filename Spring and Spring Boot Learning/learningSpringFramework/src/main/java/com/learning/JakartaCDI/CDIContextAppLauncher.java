package com.learning.JakartaCDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
	private DataService dataService;

	public BusinessService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public DataService getDataService() {
		return dataService;
	}

	// @Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Injecting dependency");
		this.dataService = dataService;
	}

}

//@Component
@Named
class DataService {

}

@Configuration
@ComponentScan
public class CDIContextAppLauncher {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CDIContextAppLauncher.class)) {
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}
	}
}
