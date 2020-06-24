package com.example.SpringCoreDemo.ProducerConsumer;

import java.util.Scanner;

public class TaxCalculator {


	public  double calculateTaxSingle(double yearlyIncome) {
		double totalTax=0.0;
		
		if(yearlyIncome<=9700 && yearlyIncome>0) 
			totalTax= yearlyIncome*0.1;
		else if(yearlyIncome>9700 && yearlyIncome<=39475) 
			totalTax= yearlyIncome*0.12;
		else if(yearlyIncome>39475 && yearlyIncome<=84200)
			totalTax= yearlyIncome*0.22;
		else if(yearlyIncome>84200 && yearlyIncome<=160725)
			totalTax= yearlyIncome*0.24;
		else if(yearlyIncome>160725 && yearlyIncome<=204100)
			totalTax= yearlyIncome*0.32;
		else if(yearlyIncome>204100 && yearlyIncome<=510300)
			totalTax= yearlyIncome*0.35;
		else if(yearlyIncome>510300)
			totalTax= yearlyIncome*0.37;
		
		return totalTax ;
	}


public  double calculateTaxJoint(double yearlyIncome) {
	double totalTax=0;

	if(yearlyIncome<=19400 && yearlyIncome>0) 
		totalTax= yearlyIncome*0.1;
	else if(yearlyIncome>19400 && yearlyIncome<=78950) 
		totalTax= yearlyIncome*0.12;
	else if(yearlyIncome>78950 && yearlyIncome<=168400)
		totalTax= yearlyIncome*0.22;
	else if(yearlyIncome>168400 && yearlyIncome<=321450)
		totalTax= yearlyIncome*0.24;
	else if(yearlyIncome>321450 && yearlyIncome<=408200)
		totalTax= yearlyIncome*0.32;
	else if(yearlyIncome>408200 && yearlyIncome<=612350)
		totalTax= yearlyIncome*0.35;
	else if(yearlyIncome>612350)
		totalTax= yearlyIncome*0.37;
	
	return totalTax ;
}
public double calculateStateTx(double yearlyIncome) {
	double stx=0.0 ;
	if(yearlyIncome<=3000 && yearlyIncome>0) 
		stx= yearlyIncome*0.02;
	else if(yearlyIncome>3000 && yearlyIncome<=5000) 
		stx= yearlyIncome*0.03;
	else if(yearlyIncome>5000 && yearlyIncome<=17000)
		stx= yearlyIncome*0.05;

	else if(yearlyIncome>17000)
		stx= yearlyIncome*0.0575;
	return stx;
}

}
