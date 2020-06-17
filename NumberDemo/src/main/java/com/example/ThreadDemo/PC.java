package com.example.ThreadDemo;
import java.util.LinkedList;
import java.util.Scanner;

import com.example.ExceptionIODemo.Person;

public  class PC { 
  
      
        LinkedList<Person> list = new LinkedList<>(); 
        LinkedList<Person> taxLlist = new LinkedList<>();
        int capacity = 2; 
  
       
        public void produce() throws InterruptedException 
        { 
            int value = 0; 
            while (true) { 
                synchronized (this) 
                { 
                	
                    while (list.size() == capacity) 
                        wait(); 
  
                    System.out.println("Producer produced-"
                                       + value); 
  
                    // to insert the jobs in the list 
                    Scanner s = new Scanner(System.in);
                    System.out.print("Enter person details.Enter name :");
    				String name = s.nextLine();
    				System.out.print("Enter address :");
    				String address = s.nextLine();
    				System.out.print("Enter income :");
    				double income =  Double.parseDouble(s.nextLine());
    				list.add(new Person(name,address,income)); 
  
                    // notifies the consumer thread that 
                    notify(); 
  
                  
                } 
            } 
        }
        public void consume() throws InterruptedException 
        { 
            while (true) { 
                synchronized (this) 
                { 
                   
                    while (list.size() == 0) 
                        wait(); 
  
                    
                    Person person = list.removeFirst(); 
                    TaxCalculator tx =new TaxCalculator();
                  person.setTax(tx.calculateStateTx(person.getIncome()));  
                    System.out.println("Consumer calculated tax for Person-"
                                       + person.getName()); 
                    taxLlist.add(person);
                    // Wake up producer thread 
                    notify(); 
  
        
                	}
                }
            }
        }