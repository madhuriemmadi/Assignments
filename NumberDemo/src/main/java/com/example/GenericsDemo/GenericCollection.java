package com.example.GenericsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericCollection {

	public static <T> void main(String[] args) {
		
		List<HondaCar> hondaList =new ArrayList<>();
		hondaList.add(new HondaCar("civic", 2019, 25000.0));
		hondaList.add(new HondaCar("civic", 2018, 20000.0));
		
		GenericContainer container1 =new GenericContainer<HondaCar>();
		container1.printCars(hondaList);
		
		List<ToyotaCar> toyotaList =new ArrayList<>();
		toyotaList.add(new ToyotaCar("camry", 2020, 50000.0));
		toyotaList.add(new ToyotaCar("corolla", 2019, 30000.0));
		GenericContainer container2 =new GenericContainer<HondaCar>();
		container2.printCars(toyotaList);
		
		
	}


}
