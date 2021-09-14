package com.elearning.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elearning.web.dao.StudentDao;
import com.elearning.web.model.Student;

@Component
public class FacultyServiceImplementation implements FacultyService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student addStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public List<Student> getStudents() {
		return (List<Student>) studentDao.findAll();
	}
	
	public Student getStudent(Integer id) {
		return studentDao.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public Student deleteStudent(Integer id) {
		Student student=getStudent(id);
		studentDao.deleteById(id);
		return student;
	}
}
