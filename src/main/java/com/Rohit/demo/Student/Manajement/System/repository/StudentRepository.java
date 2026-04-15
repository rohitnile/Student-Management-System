package com.Rohit.demo.Student.Manajement.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rohit.demo.Student.Manajement.System.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
