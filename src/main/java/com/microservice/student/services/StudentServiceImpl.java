package com.microservice.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.student.entities.Student;
import com.microservice.student.persistence.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> findAll() {
		return (List<Student>)studentRepo.findAll();
	}

	@Override
	public List<Student> findByIdCourse(Long idCourse) {
		return (List<Student>) studentRepo.findAllStudent(idCourse);
	}

	@Override
	public Student findById(Long id) {
		return studentRepo.findById(id).orElseThrow();
	}

	@Override
	public void save(Student student) {
		studentRepo.save(student);
	}
}
