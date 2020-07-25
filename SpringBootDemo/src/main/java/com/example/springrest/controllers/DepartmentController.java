package com.example.springrest.controllers;

import java.util.List;
import java.util.Optional;

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

import com.example.springrest.entity.Department;
import com.example.springrest.services.DepartmentDetailsService;

@RestController
public class DepartmentController {


	@Autowired
	DepartmentDetailsService departmentService;
	
@GetMapping("/departments")
	
	public ResponseEntity<Iterable<Department>> getAllDepartmentDetails(){
		
	Iterable<Department> departmentList =	departmentService.getAllDepartments();
		return new ResponseEntity<>(departmentList, HttpStatus.OK);
	}

@GetMapping("/department/{id}")
	
	public ResponseEntity<Department> getDepartmentbyId(@PathVariable int id){
	
	Department department = departmentService.getDepartmentbyId(id);
	return new ResponseEntity<>(department, HttpStatus.OK);
		
}

@PostMapping("/department")
public ResponseEntity<String> addDepartment(@RequestBody Department department){
	
	departmentService.addDepartment(department);
	return new ResponseEntity<>("Department with id " +department.getId()+"added successfully",HttpStatus.CREATED);
		
}
@PutMapping("/department/{id}")
public ResponseEntity<String> updateDepartmentbyId(@RequestBody Department department ,@PathVariable long id){
	departmentService.updateDepartment(department,id);
	return new ResponseEntity<>("Department with id " + id +"updated successfully",HttpStatus.OK);
}

@DeleteMapping("/department/{id}")

public ResponseEntity<String> deleteDepartmentbyId(@PathVariable long id){
	departmentService.deleteDepartment(id);
	return new ResponseEntity<>("Department with id " + id +" deleted successfully",HttpStatus.OK);
}



}
