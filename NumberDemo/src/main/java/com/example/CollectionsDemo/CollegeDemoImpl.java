package com.example.CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollegeDemoImpl implements CollegeDemo {

	List<Student> studentList = new ArrayList<>();
	HashMap<Integer,String> projAssigned = new HashMap<Integer, String>();
	
	@Override
	public void enrollStudent(Student s) {
		 if(studentList.contains(s))
			 System.out.print("Student already enrolled");
		 else {
			if(studentList.add(s))
			 System.out.print("\nStudent enrolled" );
		 }
	}

	@Override
	public void removeStudent(int id) {
	ListIterator<Student> studetnItr = studentList.listIterator();
	
	while(studetnItr.hasNext()) {
		Student s = studetnItr.next();
		if(s.getId()== id) {
			studetnItr.remove();
				 System.out.print("Student removed form college");
		}
		}
			
	}
	

	@Override
	public void assignProject(int id, String projName) {
		
		if(projAssigned.containsKey(id)) {
			System.out.print("Student already assigned to project");
		}else {
			projAssigned.put(id,projName);
		}

	}
	
	@Override
	public void changeProject(int id, String projName) {
		
		if(projAssigned.containsKey(id)) {
			projAssigned.replace(id, projName);
			System.out.print("Project assignment changed");
		}
		
	}
	
	@Override
	public void projectsAssigned() {
		System.out.print("List of Projects Assigned to students :");
		projAssigned.forEach((id,proj) ->{ System.out.println("Student id : " + id + " proj assigned : " + proj);});
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((projAssigned == null) ? 0 : projAssigned.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollegeDemoImpl other = (CollegeDemoImpl) obj;
		if (projAssigned == null) {
			if (other.projAssigned != null)
				return false;
		} else if (!projAssigned.equals(other.projAssigned))
			return false;
		return true;
	}

	@Override
	public void studentsEnrolled() {
	
		Collections.sort(studentList,new NameComparator());
		System.out.println("\n Enrolled students by name order");
		for(Student s:studentList) {
			System.out.println("Name : " + s.getName() + "  id :" + s.getId());
		}
	}

}
