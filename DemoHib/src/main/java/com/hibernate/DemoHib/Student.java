package com.hibernate.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity(name = "AKASH")

public class Student 
{	@Id
	private int id;
	private String name;
	@Column(name="Adnav")
	private String sirname;
	//private long Image;
	
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

	/*
	 * public long getImage() { return Image; } public void setImage(long Image) {
	 * this.Image = Image; }
	 */

}
