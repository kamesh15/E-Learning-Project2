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
import org.springframework.web.bind.annotation.RestController;

import com.elearning.web.model.Course;
import com.elearning.web.model.Student;
import com.elearning.web.model.Teacher;
import com.elearning.web.service.TeacherService;

@RestController
@CrossOrigin
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping(path="/add-course",consumes="application/json")
	public Course createCourse(@RequestBody Course course) {
		return teacherService.createCourse(course);
	}
	
	@GetMapping("/get-courses")
	public List<Course> getCourses () {
		return teacherService.getCourses();
	}
	
	@PutMapping("/update-course")
	public Course updateCourse(@RequestBody Course course) {
		return teacherService.updateCourse(course);
	}
	
	@DeleteMapping("/delete-course/{course_id}")
	public boolean deleteCourse(@PathVariable("course_id")Integer course_id) {
		teacherService.deleteCourse(course_id);
		return true;
	}
	
	@GetMapping("/get-profile")
	public Teacher getProfile(HttpServletRequest request) {
		return (Teacher)request.getSession().getAttribute("profile");
	}
	
	@GetMapping("/get-students")
	public List<Student> getStudents(){
		return teacherService.getStudents();
	}
	
	@PostMapping("/login")
	public Teacher login(@RequestParam("userid")String userId,@RequestParam("password")String password,HttpServletRequest request) {
		return teacherService.login(userId, password);	
	}
}
