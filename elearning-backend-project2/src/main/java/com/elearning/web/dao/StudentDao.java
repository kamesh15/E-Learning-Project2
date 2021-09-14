package com.elearning.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.elearning.web.model.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{

	@Query("FROM Student WHERE email=:userId AND password=:password")
	List<Student> login(@Param("userId")String userId,@Param("password")String password);
	
	
}
