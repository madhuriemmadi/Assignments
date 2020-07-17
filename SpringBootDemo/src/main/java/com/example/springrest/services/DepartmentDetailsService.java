package com.example.springrest.services;

import java.util.List;
import java.util.Optional;

import com.example.springrest.entity.Department;

public interface DepartmentDetailsService {


	public void addDepartment(Department department);
	public void deleteDepartment(long id);
	public Optional<Department> getDepartmentbyId(long Id);
	public Iterable<Department> getAllDepartments();
	public void updateDepartment(Department department, Long id);
}
