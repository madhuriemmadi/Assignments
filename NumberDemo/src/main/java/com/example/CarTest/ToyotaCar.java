package com.example.CarTest;

public class ToyotaCar extends BaseCar {
	String color;
	
	 public ToyotaCar(String model, int releaseYear, double price,String color) {
		super(model, releaseYear, price);
		this.color=color;

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