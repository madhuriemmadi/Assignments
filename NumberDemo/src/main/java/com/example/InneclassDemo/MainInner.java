package com.example.InneclassDemo;

public class MainInner {

	public static void main(String[] args) {
		Car carObj =new Car("BWM","M5");
		Car.Engine engine = carObj.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for M5= " + engine.getEngineType());

        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());

		
	}

}
