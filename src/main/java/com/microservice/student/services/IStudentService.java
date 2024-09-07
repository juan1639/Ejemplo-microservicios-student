package com.microservice.student.services;

import java.util.List;

import com.microservice.student.entities.Student;

public interface IStudentService {
	
	List<Student> findAll();
	List<Student> findByIdCourse(Long idCourse);
	Student findById(Long id);
	void save(Student student);
}
