package com.hibernate.XML;

public class MCertificate {


	int id;
	String name;
	Employee employee;
	public MCertificate()
	{
	}
	public MCertificate(String name,Employee e)
	{
		this.employee=e;
		this.name=name;
	}
	public MCertificate(String name)
	{
		this.name=name;
	}
	public void setEmployee(Employee e)
	{
		this.employee=e;
	}
	public Employee getEmployee()
	{
		return employee;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return name;
	}

};
