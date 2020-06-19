package com.example.Java8Demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapStreamExample {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Jim", 101, 70000.0));
		empList.add(new Employee(2, "Joe", 101, 75000.0));
		empList.add(new Employee(3, "John", 101, 80000.0));
		empList.add(new Employee(4, "Maggi", 102, 65000.0));
		empList.add(new Employee(5, "Sam", 102, 90000.0));
		empList.add(new Employee(6, "Lisa", 102, 100000.0));
		empList.add(new Employee(7, "Jeff", 102, 95000.0));
		
		//calculate bonus 
		calculateBonus(empList);
		
		//putting values of list into Map
		HashMap<Integer,List<Employee>> empHashMap =	empList.stream().collect(
			      Collectors.groupingBy(Employee::getDeptid, HashMap::new, Collectors.toCollection(ArrayList::new))
			    );
		
		empHashMap.forEach((k, v) -> System.out.println((k + ":" + v)));
		
		//write bonus details to fail
		writeBonusDetails(empHashMap);
		
		//filter list
		List<Employee> empListFilter =	empList.stream().filter(e -> e.getIncome() > 80000 && e.getName().startsWith("J"))
				  .collect(Collectors.toList());
		System.out.print("List of Employees with Salary greater than 80000 and Name starts with J\n");
		for(Employee e :empListFilter) {
			System.out.print(e.getName() +"  :"+ e.getIncome());
		}
		
}
	
	public static void calculateBonus(List<Employee> empList){
		
		for(Employee e :empList){
			e.setBonus(e.getIncome()*0.05);
		}
		
	}
	public static void writeBonusDetails(HashMap<Integer, List<Employee>> empHashMap) {
		
	 File file = new File("C:/Users/Ajay/NumberDemo/src/main/java/com/example/employeeBonus.txt");
     
     BufferedWriter bf = null;;
     
     try{
         
         bf = new BufferedWriter( new FileWriter(file) );

         //iterate map entries
         for(Map.Entry<Integer, List<Employee>> entry : empHashMap.entrySet()){
             
             //put key and value separated by a colon
             bf.write( entry.getKey() + ":" + entry.getValue() );
             
             //new line
             bf.newLine();
         }
         
         bf.flush();

     }catch(IOException e){
         e.printStackTrace();
     }finally{
         
         try{
            
             bf.close();
         }catch(Exception e){}
     }
}
}
