package com.example.ThreadDemo;

import java.io.Serializable;

public class Person implements Serializable{

	
	String name;
	String address;
	double income;
	double tax;
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getName() {
		return name;
	}
	
	public Person(String name, String address, double income) {
		super();
		this.name = name;
		this.address = address;
		this.income = income;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", income=" + income + ", tax=" + tax + "]";
	}
	
	
	
}
