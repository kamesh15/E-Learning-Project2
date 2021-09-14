package com.elearning.web.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.web.model.Student;
import com.elearning.web.service.FacultyService;

@RestController
public class FacultyController {
	private FacultyService profileService;
	
	@PostMapping(path="/add-student1",consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
		profileService.addStudent(student);
		return student;
	}
	
	@GetMapping("/students")
	@ResponseBody
	public List<Student> getStudents() {
		return profileService.getStudents();
	}
	
	@PutMapping(path="/update-student")
	public Student updateStudent(@RequestBody Student student) {
		profileService.updateStudent(student);
		return student;
	}
	
	@DeleteMapping("/delete-student/{student_id}")
	public Student deleteStudent(@PathVariable("student_id")Integer studentId) {
		return profileService.deleteStudent(studentId);
	}
}
