package com.app.model;

import java.util.Date;

public class Player {
	private int id;
	private String name;
	private int age;
	private long contact;
	private Date dob;
	private String gender;
	private String teamname;
	
	public Player() {
		
}
	
	
	public Player(int id, String name, int age, long contact, Date dob, String gender,String teamname) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.dob = dob;
		this.gender = gender;
		this.teamname = teamname;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getTeamname() {
		return teamname;
	}


	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(java.sql.Date date) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Player [id="+id+", name="+name+",age="+age+",contact"+contact+",teamname"+",gender"+gender
				+",dob="+dob+"]";
	}


}