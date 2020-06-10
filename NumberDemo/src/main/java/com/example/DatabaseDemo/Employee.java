package com.example.DatabaseDemo;

import java.util.Date;
import java.util.List;

public class Employee {

	private int eId;
	private String firstName;
	private String lastName;
	private int dId;
	private List<Integer> address;
		
	
	public Employee(int eId, String firstName, String lastName, int dId, List<Integer> address) {
		super();
		this.eId = eId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dId = dId;
		this.address = address;
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public List<Integer> getAddress() {
		return address;
	}
	public void setAddress(List<Integer> address) {
		this.address = address;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
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
	public int getEid() {
		return eId;
	}
	public void setEid(int eid) {
		this.eId = eid;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", eId=" + eId + ", address=" + address
				+ ", dId=" + dId + "]";
	}
	
}