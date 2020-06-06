package com.example.ExceptionIODemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface CalculateTax  {

	public void writeToFile(ArrayList<Person> pList) throws IOException;
	public void readFromFile()throws IOException;
	
}
