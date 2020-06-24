package com.example.FileIOSpirng.FIleIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;

import com.example.FileIOSpirng.TaxTest.TaxCalculator;

public class CalculateTaxImpl implements CalculateTax {
	TaxCalculator tc =new TaxCalculator();

	
	public void writeToFile(ArrayList<Person> pList) throws IOException{
		
		File file=  new File("C:/Ajay/Personal/Assignments/NumberDemo/src/main/java/com/example/employees.txt");
		FileOutputStream fileOut = new FileOutputStream(file);
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		try{
			objectOut.writeObject(pList);
			objectOut.close();
            System.out.println("The Object  are succesfully written to a file");	
		}
		catch ( IOException e) {
			e.printStackTrace();
			} 
		
	}

	
	public void readFromFile() throws IOException {
		
		InputStream in =new FileInputStream("C:/Ajay/Personal/Assignments/NumberDemo/src/main/java/com/example/employees.txt");
		ObjectInputStream objectIn = new ObjectInputStream(in);
		
		File file=  new File("C:/Ajay/Personal/Assignments/NumberDemo/src/main/java/com/example/employeestax.txt");
		FileOutputStream fileOut = new FileOutputStream(file);
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		
		
		double income;
		try {
		
			ArrayList<Person> pList =	(ArrayList<Person>)objectIn.readObject();
			objectIn.close();
			ListIterator<Person> personItr =pList.listIterator();
				while(personItr.hasNext()) {
					Person p =personItr.next();
					income =p.getIncome();
					Double tax = tc.calculateTaxSingle(income);
					p.setTax(tax);
			 
			}
				objectOut.writeObject(pList);
					objectOut.close();
					
			} catch ( IOException e) {
				e.printStackTrace();
				} catch(ClassNotFoundException e){
					e.printStackTrace();
				}
		
			}
	
	
	public void readDetails() throws IOException {
		try {
		InputStream in =new FileInputStream("C:/Ajay/Personal/Assignments/NumberDemo/src/main/java/com/example/employeestax.txt");
		ObjectInputStream objectIn = new ObjectInputStream(in);
		
		ArrayList<Person> pList =	(ArrayList<Person>)objectIn.readObject();
		objectIn.close();
		for(Person p:pList) {
			System.out.print(p);
		}
		
		}catch ( IOException e) {
			e.printStackTrace();
			} catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		
		
	}
	}

