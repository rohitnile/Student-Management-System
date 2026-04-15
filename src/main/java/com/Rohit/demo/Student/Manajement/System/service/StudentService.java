package com.Rohit.demo.Student.Manajement.System.service;

import java.util.List;

import com.Rohit.demo.Student.Manajement.System.entity.Student;


public interface StudentService {
	
	public List<Student>  getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student getById(int id);
	
	public void deleteById(int id);

}
