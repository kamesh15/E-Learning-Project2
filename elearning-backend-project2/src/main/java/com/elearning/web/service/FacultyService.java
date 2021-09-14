package com.elearning.web.service;

import java.util.List;

import com.elearning.web.model.Student;

public interface FacultyService {
	Student addStudent(Student student);
	List<Student> getStudents();
	Student updateStudent(Student student);
	Student deleteStudent(Integer id);
}
