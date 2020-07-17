package com.example.springrest.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void addStudent(Student student) {
	studentRepository.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.findById(id).orElseThrow(RuntimeException :: new);
		studentRepository.deleteById(id);
		}
	

	@Override
	public Optional<Student> getStudentbyId(long id) {
		Optional<Student> student=null;
		student =studentRepository.findById(id);
	
		return student;
	}

	@Override
	public Iterable<Student> getAllStudents() {
		
		System.out.print("count :"+ studentRepository.count());
		return studentRepository.findAll();
		
	}

	@Override
	public void updateStudent(Student newStudent, long id) {
		
		studentRepository.findById(id).map(student ->{ student.setName(newStudent.getName());
		student.setAddress(student.getAddress());
		student.setDob(student.getDob());
		return studentRepository.save(student);
		}).orElseThrow(RuntimeException::new);
      
      
      
	}

	

	
}
