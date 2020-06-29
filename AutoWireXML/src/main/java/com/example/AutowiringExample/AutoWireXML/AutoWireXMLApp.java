package com.example.AutowiringExample.AutoWireXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AutoWireXMLApp 
{
    public static void main( String[] args )
    {

    	
    	ApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Employee emp = context.getBean(Employee.class);
    	Department dept =context.getBean(Department.class);
    	dept.setDeptName("IT");
    	emp.setEid(101);
    	emp.setEname("James");
    	emp.showEmployeeDetails();
    }
}
