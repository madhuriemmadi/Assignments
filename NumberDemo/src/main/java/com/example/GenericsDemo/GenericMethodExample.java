package com.example.GenericsDemo;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {

	public static void main(String[] args) {
		List<Integer> intList =new ArrayList<Integer>();
		intList.add(20);
		intList.add(50);
		intList.add(80);
		intList.add(45);
		List<String> stringList = new ArrayList<String>();
		stringList.add("Joe");
		stringList.add("is");
		stringList.add("a");
		stringList.add("graduate");
		
				//Arrays.asList("Joe","is","a","graduate");
		
		add(intList);
		add(stringList);

	}
	public static <T> void add(List<T> list) {

		Integer sum =0;
		 String  concatValues="" ;
		
		
	        if(list.get(0) instanceof Integer) {
	        	
	        	for(Integer i : (ArrayList<Integer>) list) 
	               	sum= sum+i;
	        	System.out.print("\nSum of elements in the list:\n" +sum);
	        	
	        }
	         
	         else if (list.get(0) instanceof String)
	        	
	        	   concatValues = String.join("  ", (ArrayList<String>)list);
	        
	        System.out.print("\n Concat of elements in the list:" +concatValues);
		
	}

}
