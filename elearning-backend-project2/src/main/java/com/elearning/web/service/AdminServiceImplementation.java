package com.elearning.web.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elearning.web.dao.TeacherDao;
import com.elearning.web.model.Teacher;

@Component
public class AdminServiceImplementation implements AdminService {
	@Autowired
	private TeacherDao admindao;
	
	@Override
	public Teacher addTeacher(Teacher teacher)
	{
		return admindao.save(teacher);
		
	}
	
	@Override
	public Teacher getOneTeacher(Integer id)
	{
		Optional<Teacher> teacher=admindao.findById(id);
		return teacher.isPresent()?(Teacher)teacher.get():null;
	}
	
	@Override
	public Teacher updateTeacher(Teacher teacher)
	{
		return admindao.save(teacher);
	}
	
	@Override
	public Teacher deleteTeacher(Integer id)
	{
		Teacher teacher=getOneTeacher(id);
		admindao.deleteById(id);
		return teacher;
		
	}
}
