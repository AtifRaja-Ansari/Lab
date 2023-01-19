package com.demo.Entity;

public class Emp {
	private double salary;
	private String ename;
	public Emp() {
		System.out.println("def cons");
		
	}
		
	public Emp(double salary) {
		this.salary=salary;
	}
	public Emp(String ename) {
		this.ename=ename;
	}
	public Emp(double salary,String ename) {
		this.salary=salary;
		this.ename=ename;
	}

	public void display() {
		System.out.println("Name:"+ename+"\nSalary:"+ salary);	
	}

}
