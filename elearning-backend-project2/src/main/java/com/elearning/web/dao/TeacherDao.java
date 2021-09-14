package com.elearning.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.elearning.web.model.Teacher;

public interface TeacherDao  extends JpaRepository<Teacher,Integer> {
	
	@Query("FROM Teacher WHERE email=:userId AND password=:password")
	List<Teacher> login(@Param("userId")String userId,@Param("password")String password);
}
