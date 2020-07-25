package com.example.springrest.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springrest.entity.Student;
import com.example.springrest.entity.StudentRepository;
import com.example.springrest.exceptionhandler.StudentNotFound;
import com.example.springrest.services.StudentDetailsService;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {
	
@Autowired
StudentRepository studentRepository;

List<Student> studentList = new ArrayList();

	
	@Override
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public void addStudent(Student student) {
	studentRepository.save(student);
	
	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.findById(id).orElseThrow(StudentNotFound :: new);
		studentRepository.deleteById(id);
		}
	

	@Override
	public Student getStudentbyId(long id) {
		
		return studentRepository.findById(id).orElseThrow(StudentNotFound :: new);
	}

	@Override
	public Iterable<Student> getAllStudents() {
		
		System.out.print("count :"+ studentRepository.count());
		return studentRepository.findAll();
		
	}

	@Override
	
	public void updateStudent(Student newStudent, long id)  {
		
		studentRepository.findById(id).map(student ->{ student.setName(newStudent.getName());
		student.setAddress(student.getAddress());
		student.setDob(student.getDob());
		return studentRepository.save(student);
		}).orElseThrow(StudentNotFound::new);
      
      
      
	}

	

	
}
