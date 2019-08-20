package com.hibernate.XML;

import java.util.Set;

//@Entity
public class Employee {
	
	private int id;
	   private String firstName; 
	   private String lastName;   
	   private int salary; 
	   Set<MCertificate> certificate;

	   public Employee() {}
	   
	   
	   
	   
	   public Employee(int id, String firstName, String lastName, int salary, Set<MCertificate> certificate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.certificate = certificate;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	public Set<MCertificate> getCertificate() {
		return certificate;
	}




	public void setCertificate(Set<MCertificate> certificate) {
		this.certificate = certificate;
	}




	public boolean equals(Object o) {
		   if(o == null)return false;
		   if(id==0)return false;
		   if(o instanceof Employee) {
			   return((Employee)o).getId()==this.id;
		   }
		   else return false;
	   }




	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", certificate=" + certificate + "]";
	}
	
	   
}
	



			