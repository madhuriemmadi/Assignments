package com.example.springrest.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springrest.entity.Activity;
import com.example.springrest.entity.Department;
import com.example.springrest.entity.DepartmentRepository;
import com.example.springrest.entity.Student;
import com.example.springrest.exceptionhandler.DepartmentNotFound;
import com.example.springrest.exceptionhandler.StudentNotFound;
import com.example.springrest.services.ActivityService;
import com.example.springrest.services.DepartmentDetailsService;
import com.example.springrest.services.StudentDetailsService;

@Service
public class DepartmentDetailsServiceImpl implements DepartmentDetailsService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ActivityService activityService;
	
	List<Department> departmentList = new ArrayList();
	@Override
	public void addDepartment(Department department) {
		departmentRepository.save(department);
		
	}

	@Override
	public void deleteDepartment(long id) {
		departmentRepository.findById(id).orElseThrow( DepartmentNotFound :: new);
			departmentRepository.deleteById(id);
		}
		
	

	@Override
	public Department getDepartmentbyId(long id) {
		
	
		return 	departmentRepository.findById(id).orElseThrow(DepartmentNotFound::new);
	}

	@Override
	public Iterable<Department> getAllDepartments() {
		
		return departmentRepository.findAll();
	}

	@Override
	@Transactional(readOnly = false )
	public void updateDepartment(Department newDepartment, Long id) throws StudentNotFound {
		boolean isError =false;
		Activity activity = new Activity();
		activity.setActivityType("update department");
		try {
		departmentRepository.findById(id)
	      .map(department -> {
	    	  department.setDname(newDepartment.getDname());
	        return departmentRepository.save(department);
	      }).orElseThrow(DepartmentNotFound :: new);
		activity.setLogMessage("succesful update of department details");
		activityService.logActivity(activity);
		
		}catch (Exception e) {
			isError =true;
			e.printStackTrace();
			throw e;
		}finally {
			if(isError) {
				activity.setLogMessage("Failed while updating department details");
				activityService.logActivity(activity);
			}
				
		}
	      
	}
}