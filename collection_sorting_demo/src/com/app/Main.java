package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(100,"TV", 100.99, 4.2f, true));
		productList.add(new Product(160,"TV", 108.99, 4.7f, true));
		productList.add(new Product(109,"TV", 170.99, 4.5f, false));
		productList.add(new Product(600,"TV", 180.99, 4.3f, true));
		productList.add(new Product(300,"TV", 190.99, 4.1f, true));
		productList.add(new Product(170,"TV", 190.99, 4.6f, false));
		productList.add(new Product(506,"TV", 170.99, 4.4f, true));

		System.out.println("Printing all the products");
		printProducts(productList);
		
		Collections.sort(productList);//use functional interface comparable using which it compares 2 objects
		
		System.out.println("\nPrinting all the products sorted by ID");
		printProducts(productList);
		
		Collections.sort(productList, new ProductAvailabilityComparator());
		System.out.println("\nPrinting all the products sorted by availility");
		printProducts(productList);
		
		Collections.sort(productList,(Product p1, Product p2)->{
			Double d1 = p1.getCost();
			Double d2 = p2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting all the products sorted by cost low to high");
		printProducts(productList);
		
		
		Collections.sort(productList,(Product p1, Product p2)->{
			int x = 0;
			Float f1 = p1.getRating();
			Float f2 = p2.getRating();
			x = f2.compareTo(f1);
			if(x == 0) {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				x = d1.compareTo(d2);
			}
			return x;
		});
		System.out.println("\nPrinting all the products sorted by rating(high to low) and if two or more ratings are same then cost low to high");
		printProducts(productList);
		
		
	}

	public static void printProducts(List<Product> productList) {
		for(Product p : productList) {
			System.out.println(p);
		}
	}
	
}
//task: try to recreate the same for Flight(id, name, manufactureName, cost, rating, availibity)