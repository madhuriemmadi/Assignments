package com.example.SpringAop.AopDemo;

import java.time.LocalTime;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class EmployeeAspect {

	
	@Around("execution(* com.example.SpringAop.AopDemo.Employee.showEmployeeDetails(..))")
	public void logDetails(ProceedingJoinPoint jointPoint) {
		
		System.out.println("Before method call:" +LocalTime.now());
		try{
		jointPoint.proceed();
		
		}catch(Throwable e){
			e.printStackTrace();
		}
		System.out.println("After method call:" +LocalTime.now());
	}
}
