package com.app;

import java.util.Comparator;

public class ProductAvailabilityComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		Boolean b1 = o1.isAvailable();
		Boolean b2 = o2.isAvailable();
		
		return b2.compareTo(b1);
	}

	
	
}
