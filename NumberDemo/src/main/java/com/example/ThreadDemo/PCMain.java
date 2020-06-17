package com.example.ThreadDemo;

public class PCMain {

	    public static void main(String[] args) 
	        throws InterruptedException 
	    { 
	        // Object of a class that has both produce() 
	        // and consume() methods 
	         PC pc = new PC(); 
	  
	        // Create producer thread 
	        Runnable t1=() ->{  try { 
                pc.produce(); 
            } 
            catch (InterruptedException e) { 
                e.printStackTrace(); 
            } }; 
	      /*  Thread t1 = new Thread(new Runnable() { 
	            @Override
	            public void run() 
	            { 
	                try { 
	                    pc.produce(); 
	                } 
	                catch (InterruptedException e) { 
	                    e.printStackTrace(); 
	                } 
	            } 
	        });*/ 
	  
	        // Create consumer thread 
            
            Runnable t2=() ->{  try { 
                pc.consume(); 
            } 
            catch (InterruptedException e) { 
                e.printStackTrace(); 
            } };
	      /*  Thread t2 = new Thread(new Runnable() { 
	            @Override
	            public void run() 
	            { 
	                try { 
	                    pc.consume(); 
	                } 
	                catch (InterruptedException e) { 
	                    e.printStackTrace(); 
	                } 
	            } 
	        });*/ 
	  
	        // Start both threads 
	    new Thread (t1).start(); 
	    new Thread (t2).start(); 
	  
	        // t1 finishes before t2 
	    new Thread (t1).join(); 
	    new Thread (t2).join(); 
	    } 

}
