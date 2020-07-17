package com.example.springrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Department")
public class Department {

	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	@NotNull
	private String dname;
	
	
	public Department() {
		super();
		
	}
	public Department(String dname, long id) {
		super();
		this.dname = dname;
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public long getId() {
		return id;
	}
	public void setdId(long dId) {
		this.id = dId;
	}
	@Override
	public String toString() {
		return "Department [dname=" + dname + ", dId=" + id + "]";
	}
	
}
