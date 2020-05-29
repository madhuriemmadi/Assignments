package com.example.CarTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.example.CarTest.BaseCar;

public class VehicleInventoryImpl implements VehicleInventory {
	
	List<BaseCar> carsList = new ArrayList<BaseCar>();
	HashMap<String,Integer> parts = new HashMap<String, Integer>();
	
	
	@Override
	public  void addCar(BaseCar bc) {
		 carsList.add(bc);
		System.out.print("\nAfter adding cars Present" );
		for(BaseCar car:carsList){
			System.out.print(car );
		}
	}
	@Override
	public void removeCar(BaseCar bc) {
		carsList.remove(bc);
		System.out.print("\nAfter removing cars Present" );
		for(BaseCar car:carsList){
			System.out.println(car );
		}
	}
	@Override
	public void updateInventory(String part,Integer count){
		Integer newCount;
		
		if(parts.containsKey(part)) {
			newCount  = parts.get(part)+count;
			parts.replace(part, newCount);
		}else 
			parts.put(part, count);
		System.out.print("\nParts in Inventory after update");
		parts.forEach((p,c) ->{ System.out.println("Parts : " + p + " Count : " + c);});
	}
	}


