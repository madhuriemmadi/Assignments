package com.example.DatabaseDemo;

public class Department {
	
	private String dName;
	private int dId;
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	
	public Department(String dName, int dId) {
		super();
		this.dName = dName;
		this.dId = dId;
	}
	@Override
	public String toString() {
		return "Department [dName=" + dName + ", dId=" + dId + "]";
	}
	
	

}
