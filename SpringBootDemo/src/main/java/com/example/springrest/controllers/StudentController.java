package com.example.springrest.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.entity.Student;
import com.example.springrest.services.DepartmentDetailsService;
import com.example.springrest.services.StudentDetailsService;

@RestController
public class StudentController {
	
	@Autowired
	StudentDetailsService studentService;
	@GetMapping("/hello")
	
	public ResponseEntity<String> simpleController(){
		
		
			 return new ResponseEntity<>("Hello World", HttpStatus.OK);
		}
	@GetMapping("/students")
	
	public ResponseEntity<Iterable<Student>> getAllStudentDetails(){
		
	Iterable<Student> studentList =	studentService.getAllStudents();
		 return new ResponseEntity<>(studentList, HttpStatus.OK);
	}

@GetMapping("/student/{id}")
	
	public ResponseEntity<Student> getStudentbyId(@PathVariable long id){
	
	Student student = studentService.getStudentbyId(id);
	return new ResponseEntity<>(student,HttpStatus.OK);
		
}

@PostMapping("/student")
public ResponseEntity<String> addStudent(@RequestBody  @Valid Student student){
	
	studentService.addStudent(student);
	return new ResponseEntity<>("Student with " + student.getId() +"added succesfully ",HttpStatus.CREATED);
		
}

@DeleteMapping("/student/{id}")

public ResponseEntity<String> deleteStudent(@PathVariable long id){
	
	studentService.deleteStudent(id);
	return new ResponseEntity<>("Student with " + id +"added succesfully ",HttpStatus.OK);
	
}
@PutMapping("/student/{id}")
public ResponseEntity<String> updateStudent(@RequestBody Student student, @PathVariable int id){
	studentService.updateStudent(student, id);
	return new ResponseEntity<String>("Student with " + id +"added succesfully ",HttpStatus.OK);
}


}
