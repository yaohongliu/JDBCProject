package com.app;

public class Product implements Comparable<Product>{

	private int id;
	private String name;
	private double cost;
	private float rating;
	private boolean available;
	
	
	
	public Product() {

		// TODO Auto-generated constructor stub
	}



	public Product(int id, String name, double cost, float rating, boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
		this.available = available;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public float getRating() {
		return rating;
	}



	public void setRating(float rating) {
		this.rating = rating;
	}



	public boolean isAvailable() {
		return available;
	}



	public void setAvailable(boolean available) {
		this.available = available;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product [id = " + id+", name = "+ name+ ", cost = "+cost+", rating = "+ rating +", avaibale = "+ available+ "]";
	}



	@Override
	public int compareTo(Product o) {
		Integer id1 = this.id;
		Integer id2 = o.id;
		
		return (id1.compareTo(id2));
	}
	
	
	
	
	
	
	
	
	
}
