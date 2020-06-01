package com.example.CarTest;

public interface VehicleInventory {

	public void addCar(BaseCar bc);
	public void removeCar(BaseCar bc);
	public void updateInventory(String part,Integer count);
	default void getinventoryDetails() {
		System.out.print("This inventory has detilas about cars  and the parts available in the inventory");
	}
}
