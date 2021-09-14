package com.elearning.web.service;

import com.elearning.web.model.Teacher;

public interface AdminService {
	public Teacher addTeacher(Teacher teacher);
	public Teacher getOneTeacher(Integer id);
	public Teacher updateTeacher(Teacher teacher);
	public Teacher deleteTeacher(Integer id);
}
