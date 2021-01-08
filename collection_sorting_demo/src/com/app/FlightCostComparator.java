package com.app;

import java.util.Comparator;

public class FlightCostComparator implements Comparator<Flight>{

	@Override
	public int compare(Flight o1, Flight o2) {
		Double d1 = o1.getCost();
		Double d2 = o2.getCost();
		
		return d2.compareTo(d1);
	}

}
