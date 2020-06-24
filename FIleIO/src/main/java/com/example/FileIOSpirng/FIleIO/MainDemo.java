package com.example.FileIOSpirng.FIleIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.FileIOSpirng.TaxTest.TaxCalculator;

public class MainDemo {

	public static  void main(String[] args) throws IOException {
		
		 
		ApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
		CalculateTaxImpl  service =(CalculateTaxImpl)context.getBean("CalculateTaxImplService");
	    TaxCalculator calcTax =(TaxCalculator)context.getBean("TaxCalculator");
	    String input = "Y";
		try {
			ArrayList<Person> pList=new ArrayList<Person>();
			Scanner s  = new Scanner(System.in);
			//CalculateTaxImpl calcTax = new CalculateTaxImpl();
			
			while(input.equals("Y")) {
				System.out.print("Enter person details.Enter name :");
				String name = s.nextLine();
				System.out.print("Enter address :");
				String address = s.nextLine();
				System.out.print("Enter income :");
				double income =  Double.parseDouble(s.nextLine());
				pList.add(new Person(name,address,income));
				System.out.print("Would you like to enter another person details:Y/N");
				input =s.nextLine();
			}
			
				System.out.print("Writing person details into a file..");
				service.writeToFile(pList);
				System.out.print("Calculating tax of the persons");
				service.readFromFile();
				System.out.print("Reading tax of the personn\n");
				service.readDetails();
				
			
			
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}
}
