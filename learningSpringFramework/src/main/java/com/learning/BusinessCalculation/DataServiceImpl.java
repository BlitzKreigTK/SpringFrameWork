package com.learning.BusinessCalculation;

import java.util.Arrays;

import org.springframework.stereotype.Service;

//@Component
@Service
public class DataServiceImpl {
	private DataService dataService;

	public DataServiceImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
