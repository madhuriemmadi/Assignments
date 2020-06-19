package com.example.Java8Demo;

public class Employee {
	private int id;
	private String name;
	private int deptid;
	private double income;
	private double bonus;
	
	
	public Employee(int id, String name, int deptid, double income) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.income = income;
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
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptid=" + deptid + ", income=" + income + ", bonus="
				+ bonus + "]";
	}
	
	

}
