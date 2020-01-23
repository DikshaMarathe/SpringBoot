package com.springboot.udemy.entity;

import java.sql.Date;

public class Person {
	private long id;
	private String name;
	private String location;
	private Date DOB;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	Person(){
		
	}
	
	Person(long id, String name, String location, Date DOB){
		this.id = id;
		this.name = name;
		this.location = location;
		this.DOB = DOB;
	}
	@Override
	public String toString() {
		return "\n Person [id=" + id + ", name=" + name + ", location=" + location + ", DOB=" + DOB + "]";
	}
	
	
}
