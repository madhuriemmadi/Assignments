package com.example.springrest.services;

import java.util.List;
import java.util.Optional;

import com.example.springrest.entity.Student;

public interface StudentDetailsService {
	
	public void addStudent(Student student);
	public void deleteStudent( long id);
	public Student getStudentbyId(long id);
	public Iterable<Student> getAllStudents();
	public void updateStudent(Student student,long id);
}
