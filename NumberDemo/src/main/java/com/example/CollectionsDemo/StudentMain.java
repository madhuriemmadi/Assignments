package com.example.CollectionsDemo;

public class StudentMain {

	public static void main(String[] args) {


		CollegeDemoImpl cd = new CollegeDemoImpl();
		 cd.enrollStudent(new Student("Kate",1));
		 cd.enrollStudent(new Student("Mary",2));
		 cd.enrollStudent(new Student("Joy",3));
		 cd.enrollStudent(new Student("Ria",4));
		 cd.enrollStudent(new Student("Ryan",5));
		 cd.studentsEnrolled();
		 cd.assignProject(1, "Library Management");
		 cd.assignProject(2, "Inventory Management");
		 cd.projectsAssigned();
		 cd.changeProject(2, "  Mobile Application");
		 cd.projectsAssigned();
		 cd.removeStudent(4);
		 
	}

}
