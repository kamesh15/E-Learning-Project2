package com.elearning.web.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.web.model.Teacher;
import com.elearning.web.service.AdminService;

@RestController
public class AdminController {
	private AdminService adminservice;
	
	@PostMapping("/add-teacher")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		adminservice.addTeacher(teacher);
		return teacher;
	}
	
	@GetMapping("/get-teacher/{Teacher_id}")
	public Teacher getTeacher(@PathVariable("Teacher_id")Integer teacherId) {
		Teacher teacher=adminservice.getOneTeacher(teacherId);
		return teacher;
	}
	
	@PutMapping(path="/update-teacher")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		adminservice.updateTeacher(teacher);
		return teacher;
	}
	
	@DeleteMapping("/delete-teacher/{Teacher_id}")
	public Teacher deleteTeacher(@PathVariable("Teacher_id")Integer teacherId) {
		return adminservice.deleteTeacher(teacherId);
	}
}
