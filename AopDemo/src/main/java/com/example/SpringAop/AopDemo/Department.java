package com.example.SpringAop.AopDemo;

import org.springframework.stereotype.Component;

@Component
public class Department {

	private String dname;
	private int did;
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	
	
}
