package com.example.SpringAop.AopDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ClassDescription(description="It is a Employee Bean")
public class Employee {
 private String ename;
 private int eid;
 private Department department;
 
public Department getDepartment() {
	return department;
}
@Autowired
public void setDepartment(Department department) {
	this.department = department;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
 
public void showEmployeeDetails(){
    System.out.println("Employee Id : " + eid);
    System.out.println("Employee Name : " + ename);
    System.out.println("Department : " + department.getDname());
}
 
}
