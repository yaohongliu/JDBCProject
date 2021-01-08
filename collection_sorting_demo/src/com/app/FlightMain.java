package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightMain {

	public static void main(String[] args) {
		List<Flight> flightList = new ArrayList<>();
		flightList.add(new Flight(100,"bird", "boing", 100.99, 4.2f, true));
		flightList.add(new Flight(160,"blueAngle", "boing",108.99, 4.7f, true));
		flightList.add(new Flight(109,"blueAngle","boing", 170.99, 4.5f, false));
		flightList.add(new Flight(600,"blueAngle","boing", 180.99, 4.3f, true));
		flightList.add(new Flight(300,"blueAngle", "boing",190.99, 4.1f, true));
		flightList.add(new Flight(170,"blueAngle", "boing",190.99, 4.6f, false));
		flightList.add(new Flight(506,"blueAngle", "boing",170.99, 4.4f, true));

		System.out.println("Printing all the flights: ");
		printFlights(flightList);
		
		Collections.sort(flightList, new FlightCostComparator());
		System.out.println("\nPrinting all the flights sorted by cost high to low");
		printFlights(flightList);
		
		Collections.sort(flightList,(Flight f1, Flight f2)->{
			Float r1 = f1.getRating();
			Float r2 = f2.getRating();
			return r1.compareTo(r2);
		});
		System.out.println("\nPrinting all the flights sorted by rating low to high");
		printFlights(flightList);
		
		Collections.sort(flightList,(Flight f1, Flight f2)->{
			Float r1 = f1.getRating();
			Float r2 = f2.getRating();
			return r2.compareTo(r1);
		});
		System.out.println("\nPrinting all the flights sorted by rating high to low");
		printFlights(flightList);
		
		

	}
	
	public static void printFlights(List<Flight> flightList) {
		for(Flight f : flightList) {
			System.out.println(f);
		}
	}

}
