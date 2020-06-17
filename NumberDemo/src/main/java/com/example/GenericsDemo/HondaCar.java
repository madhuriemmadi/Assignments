package com.example.GenericsDemo;

import java.time.LocalDate;

public class HondaCar extends BaseCar {

	public HondaCar(String model, int releaseYear, double price) {
		super( model, releaseYear,price);
		
	}

	double calcResaleValue(double price) {
		
		return price*0.6;
	}
	double calcResaleValue(double price,int year) {
		double rsvalue=0.0;
		LocalDate currentdate = LocalDate.now();
		if(currentdate.getYear()-year>=0 && currentdate.getYear()-year<=3 )
			rsvalue= price*0.6;
		else if(currentdate.getYear()-year>3 && currentdate.getYear()-year<=5)
			rsvalue =  price*0.5;
		else if(currentdate.getYear()>5)
			rsvalue =  price*0.4;
		return rsvalue;
	}
}
