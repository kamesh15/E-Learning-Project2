package com.elearning.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.web.model.Assignment;


public interface AssignmentDao extends JpaRepository<Assignment,Integer>{

}
