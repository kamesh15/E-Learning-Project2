package com.elearning.web.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.web.model.Assignment;
import com.elearning.web.model.Course;
import com.elearning.web.model.Student;
import com.elearning.web.model.Teacher;
import com.elearning.web.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping(path="/add-student",consumes="application/json")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/get-allcourses")
	public List<Course> getCourses () {
		return studentService.getCourses();
	}
	
	@PostMapping(path="/enroll-course")
	public Student enrollCourse(@RequestParam("cid")String cid,@RequestParam("sid")String sid)
	{
		
		return studentService.enrollCourse(Integer.parseInt(cid),Integer.parseInt(sid));
	}
	
	
	
	
	
	
	
	@PostMapping("/student-login")
	public Student login(@RequestParam("userid")String userId,@RequestParam("password")String password,HttpServletRequest request) {
		return studentService.login(userId, password);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//--------------------------------------------------------------------------------------------------------	
	@PostMapping("/add-assignment")
	@ResponseBody
	public Assignment addAssignment(@RequestBody Assignment assignment) {
		studentService.addAssignment(assignment);
		return assignment;
	}
	
	@GetMapping("/get-assignment/{assignment_id}")
	@ResponseBody
	public Assignment getOneAssignment(@PathVariable("assignment_id")Integer assignment_id) {
		Assignment assignment=studentService.getOneAssignment(assignment_id);
		return assignment;
	}
	
	@PutMapping(path="/update-assignment")
	public Assignment updateAssignment(@RequestBody Assignment assignment) {
		studentService.updateAssignment(assignment);
		return assignment;
	}
	
	@DeleteMapping("/delete-assignment/{assignment_id}")
	public Assignment deleteAssignment(@PathVariable("assignment_id")Integer assignment_id) {
		return studentService.deleteAssignment(assignment_id);
	}
}

