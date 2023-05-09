package com.learning.BusinessCalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDbDataService implements DataService {
	@Override
	public int[] retrieveData() {
		int[] data = { 11, 22, 33, 44, 55 };
		return data;
	}
}
