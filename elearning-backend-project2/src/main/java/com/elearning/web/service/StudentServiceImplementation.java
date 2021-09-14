package com.elearning.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.elearning.web.dao.AssignmentDao;
import com.elearning.web.dao.CourseDao;
import com.elearning.web.dao.StudentDao;
import com.elearning.web.model.Assignment;
import com.elearning.web.model.Course;
import com.elearning.web.model.Student;
import com.elearning.web.model.Teacher;

@Component
public class StudentServiceImplementation implements StudentService {
	@Autowired
	private AssignmentDao studentDao;
	
	@Autowired
	private StudentDao studentdao;
	
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public Student addStudent(Student student) {
		return studentdao.save(student);
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}
	
	@Override
	public Student enrollCourse(Integer id,Integer sid) {
		Course c= courseDao.findById(id).get();
		Student s=studentdao.findById(sid).get();
		s.getCourselist().add(c);
		return studentdao.save(s);
	}
	
	
	
	@Override
	public Student login(String userId, String password) {
		List<Student> studentList=studentdao.login(userId,password);
		if(studentList.size()>0)
			return studentList.get(0);
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
//-------------------------------------------------------------------------------------------------------------

	@Override
	public Assignment addAssignment(Assignment assignment) {
		return studentDao.save(assignment);
	}

	@Override
	public Assignment getOneAssignment(Integer assignment_id) {
		Optional<Assignment> assignment=studentDao.findById(assignment_id);
		return assignment.isPresent()?(Assignment)assignment.get():null;
	}

	@Override
	public Assignment updateAssignment(Assignment assignment) {
		return studentDao.save(assignment);
	}

	@Override
	public Assignment deleteAssignment(Integer assignment_id){
		Assignment assignment=getOneAssignment(assignment_id);
		studentDao.deleteById(assignment_id);
		return assignment;
	}
}
