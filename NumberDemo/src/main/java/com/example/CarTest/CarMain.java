package com.example.CarTest;

public class CarMain {

	public static void main(String[] args) {
		
		ToyotaCar hc1 = new HondaCar("civic", 2020, 32000.0, "grey");
		VehicleInventoryImpl vi=new VehicleInventoryImpl();
		vi.addCar(new HondaCar("civic", 2019, 25000.0, "red"));
		vi.addCar(new ToyotaCar("Camry", 2017, 22000.0, "black"));
		vi.addCar(hc1);
		vi.updateInventory("wheels", 100);
		vi.updateInventory("breaks", 50);
		vi.removeCar(hc1);
		
		double rsv=hc1.calcResaleValue(hc1.getPrice());
		System.out.print("Resale value is :"+rsv);
	}

}
