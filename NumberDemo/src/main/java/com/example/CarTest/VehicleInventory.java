package com.example.CarTest;

public interface VehicleInventory {

	public void addCar(BaseCar bc);
	public void removeCar(BaseCar bc);
	public void updateInventory(String part,Integer count);
	
}
