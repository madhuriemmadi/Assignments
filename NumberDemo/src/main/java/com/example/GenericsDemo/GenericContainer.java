package com.example.GenericsDemo;

import java.util.List;

public class GenericContainer<T extends BaseCar> {

	public void printCars(List<BaseCar> carList) {
		System.out.print(carList.getClass());
		for(BaseCar car: carList) {
			System.out.print(car.getModel() + "  " +car.getReleaseYear()+"   "+ car.getPrice()+"\n");
		}
	}
	
}
