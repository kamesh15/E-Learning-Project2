package com.elearning.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.web.dao.CourseDao;
import com.elearning.web.dao.StudentDao;
import com.elearning.web.dao.TeacherDao;
import com.elearning.web.model.Course;
import com.elearning.web.model.Student;
import com.elearning.web.model.Teacher;


@Service
public class TeacherServiceImplementation implements TeacherService {
	@Autowired
	private CourseDao courseDao;
	@Autowired
	private TeacherDao teacherDao;
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Course createCourse(Course course) {
		return courseDao.save(course);
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}
	
	@Override
	public Course updateCourse(Course course) {
		return courseDao.save(course);
	}
	
	@Override
	public boolean deleteCourse(Integer course_id){
		courseDao.deleteById(course_id);
		return true;
	}

	@Override
	public Teacher getProfile(Integer id) {
		return teacherDao.findById(id).get();
	}

	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@Override
	public Teacher login(String userId, String password) {
		List<Teacher> teacherList=teacherDao.login(userId,password);
		if(teacherList.size()>0)
			return teacherList.get(0);
		return null;
	}

}
