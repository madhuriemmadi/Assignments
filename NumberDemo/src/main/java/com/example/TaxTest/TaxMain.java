package com.example.TaxTest;

import java.util.Scanner;

public class TaxMain {
public static void main(String[] args) {
		TaxCalculator tc =new TaxCalculator();
		Scanner scanner=new Scanner(System.in);
		System.out.print( "Please enter your total taxable income: $" );

        int yearlyIncome =Integer.parseInt(scanner.nextLine()) ;
        
        System.out.print( "Please enter your Filing type: S / J" );

        String filingType = scanner.nextLine();
        System.out.print( filingType);
		double totalTax=0.0, fedtax=0.0,stx=0.0;
		
		if(filingType.equals("S"))
		{
			fedtax = tc.calculateTaxSingle(yearlyIncome);
		}
		else if(filingType.equals("S"))
		{
			fedtax = tc.calculateTaxJoint(yearlyIncome);
			}
		stx=tc.calculateTaxSingle(yearlyIncome);
		totalTax = fedtax+stx;
		System.out.print("The total tax payable is: "+ totalTax);
	
	}
}
