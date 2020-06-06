package com.example.ExceptionIODemo;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;
import com.example.ExceptionIODemo.Person;
public class MainDemo {

	public static  void main(String[] args) throws IOException {
		
		String input = "Y";
		try {
			ArrayList<Person> pList=new ArrayList<>();
			Scanner s  = new Scanner(System.in);
			CalculateTaxImpl calcTax = new CalculateTaxImpl();
			
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
				calcTax.writeToFile(pList);
				System.out.print("Calculating tax of the persons");
				calcTax.readFromFile();
				System.out.print("Reading tax of the personn\n");
				calcTax.readDetails();
				
			
			
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		
	}
}
