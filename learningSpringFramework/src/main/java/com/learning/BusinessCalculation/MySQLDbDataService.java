package com.learning.BusinessCalculation;

import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDbDataService implements DataService {
	@Override
	public int[] retrieveData() {
		int[] data = { 1, 2, 3, 4, 5 };
		return data;
	}
}
