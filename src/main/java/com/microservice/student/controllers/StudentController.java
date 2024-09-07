package com.microservice.student.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.student.entities.Student;
import com.microservice.student.services.IStudentService;

@RestController
@RequestMapping("api/student")
public class StudentController {
	
	private IStudentService studentService;
	
	@GetMapping("/all")
	public ResponseEntity<?> findAllStudents() {
		
		return ResponseEntity.ok(studentService.findAll());
		
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id) {
		
		return ResponseEntity.ok(studentService.findById(id));
	}
	
	@GetMapping("/search/{idCourse}")
	public ResponseEntity<?> findAllByCourse(@PathVariable Long idCourse) {
		
		return ResponseEntity.ok(studentService.findByIdCourse(idCourse));
	}
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveStudent(@RequestBody Student student) {
		
		studentService.save(student);	
	}
}
