package com.elearning.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elearning.web.model.Course;

@Repository
public interface CourseDao extends JpaRepository<Course,Integer>{

}
