package com.example.SpringAop.AopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopDemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new  AnnotationConfigApplicationContext(AopConfig.class);
    	 	
    	Employee emp = context.getBean(Employee.class);
    	Department dept =context.getBean(Department.class);
    	dept.setDname("IT");
    	dept.setDid(101);
    	emp.setEid(1001);
    	emp.setEname("James");
    	emp.showEmployeeDetails();
		
		}

}
