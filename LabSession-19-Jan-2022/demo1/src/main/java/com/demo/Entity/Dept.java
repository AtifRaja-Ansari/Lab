package com.demo.Entity;

public class Dept {
	private String deptname;
	private String HoD;
	


	public Dept(String  deptname,String HoD) {
		super();
		this.deptname=deptname;
		this.HoD=HoD;

	}
	public String toString() {
		return "Dept[Head of Department=" + HoD +",Department Name=" +deptname +"]";
	}
}
