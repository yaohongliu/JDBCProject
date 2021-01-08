package com.app;
//task: try to recreate the same for Flight(id, name, manufactureName, cost, rating, availibity)
public class Flight {
	private int id;
	private String name;
	private String manufactureName;
	private double cost;
	private float rating;
	private boolean available;
	
	public Flight() {
	
	}

	public Flight(int id, String name, String manufactureName, double cost, float rating, boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.manufactureName = manufactureName;
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

	public String getManufactureName() {
		return manufactureName;
	}

	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
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
		return "Flight [id = " + id+", name = "+ name+", manufactureNamename = "+ manufactureName+ ", cost = "+cost+", rating = "+ rating +", avaibale = "+ available+ "]";
	}
	
	
	

}
