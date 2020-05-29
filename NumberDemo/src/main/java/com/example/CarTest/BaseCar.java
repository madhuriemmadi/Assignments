package com.example.CarTest;

import java.util.List;

public class BaseCar {

 String model;
 int releaseYear;
 double price;
 
 public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


List<String> parts;
public BaseCar( String model, int releaseYear,double price) {
	super();
	
	this.model = model;
	this.releaseYear = releaseYear;
	this.price = price;
	
}


public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}
public int getReleaseYear() {
	return releaseYear;
}
public void setReleaseYear(int releaseYear) {
	this.releaseYear = releaseYear;
}


@Override
public String toString() {
	return "BaseCar [model=" + model + ", releaseYear=" + releaseYear + ", price=" + price + ", parts=" + parts + "]";
}


}
