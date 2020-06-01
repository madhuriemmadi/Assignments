package com.example.InneclassDemo;

public class MotherBoard {
	String model;
	   public MotherBoard(String model) {
	       this.model = model;
	   }
	 static class USB{
	       int usb2 = 2;
	       int usb3 = 1;
	       int getTotalPorts(){
	           return usb2 + usb3;
	       }
	   }
}
