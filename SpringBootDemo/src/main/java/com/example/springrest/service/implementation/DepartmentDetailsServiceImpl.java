package com.example.springrest.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrest.entity.Department;
import com.example.springrest.entity.DepartmentRepository;
import com.example.springrest.entity.Student;
import com.example.springrest.services.DepartmentDetailsService;
import com.example.springrest.services.StudentDetailsService;

@Service
public class DepartmentDetailsServiceImpl implements DepartmentDetailsService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	List<Department> departmentList = new ArrayList();
	@Override
	public void addDepartment(Department department) {
		departmentRepository.save(department);
		
	}

	@Override
	public void deleteDepartment(long id) {
		departmentRepository.findById(id).orElseThrow( RuntimeException :: new);
			departmentRepository.deleteById(id);
		}
		
	

	@Override
	public Optional<Department> getDepartmentbyId(long id) {
		
	
		return 	departmentRepository.findById(id);
	}

	@Override
	public Iterable<Department> getAllDepartments() {
		
		return departmentRepository.findAll();
	}

	@Override
	public void updateDepartment(Department newDepartment, Long id) {
		departmentRepository.findById(id)
	      .map(department -> {
	    	  department.setDname(newDepartment.getDname());
	        return departmentRepository.save(newDepartment);
	      }).orElseThrow(RuntimeException :: new);
	      
	      
	}
}