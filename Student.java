package com.hibernate.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{	@Id
	private int id;
	private String name;
	private String sirname;
	
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
	public String getSirname() {
		return sirname;
	}
	public void setSirname(String sirname) {
		this.sirname = sirname;
	}

	

}
