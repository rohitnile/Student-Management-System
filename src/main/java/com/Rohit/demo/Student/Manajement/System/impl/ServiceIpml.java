package com.Rohit.demo.Student.Manajement.System.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rohit.demo.Student.Manajement.System.entity.Student;
import com.Rohit.demo.Student.Manajement.System.repository.StudentRepository;
import com.Rohit.demo.Student.Manajement.System.service.StudentService;

@Service
public class ServiceIpml implements StudentService{
	
	@Autowired
	StudentRepository StudentRepository;

	@Override
	public List<Student> getAllStudents() {
		
		 List<Student> list = StudentRepository.findAll();
		 
		 return list;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return StudentRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return StudentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		StudentRepository.deleteById(id);
	}

}
