package com.elearning.web.service;

import java.util.List;

import com.elearning.web.model.Course;
import com.elearning.web.model.Student;
import com.elearning.web.model.Teacher;

public interface TeacherService {
	public Course createCourse(Course course);
	public List<Course> getCourses();
	public Course updateCourse(Course course);
	public boolean deleteCourse(Integer course_id);
	public Teacher getProfile(Integer id);
	public List<Student> getStudents();
	public Teacher login(String userId, String password);
}
