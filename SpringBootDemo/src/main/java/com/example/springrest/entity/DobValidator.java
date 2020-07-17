package com.example.springrest.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.springrest.entity.Student;

public class DobValidator implements ConstraintValidator<DobCheck,LocalDate > {

	private LocalDate date ;
	@Override
	public void initialize(DobCheck dc) {
		
		date = LocalDate.parse("01-01-1980",DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		
		}
	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		if(value.isAfter(date) && value.isBefore(LocalDate.now()))
		return true;
		else
			return false;
	}
	
	

}
