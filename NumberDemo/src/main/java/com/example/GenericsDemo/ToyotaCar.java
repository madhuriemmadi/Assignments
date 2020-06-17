package com.example.GenericsDemo;

public class ToyotaCar extends BaseCar {
	String color;
	
	 public ToyotaCar(String model, int releaseYear, double price) {
		super(model, releaseYear, price);
		
	 }
	
	 public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		double calcResaleValue(double price) {
			
			return price*0.5;
		}
		
}