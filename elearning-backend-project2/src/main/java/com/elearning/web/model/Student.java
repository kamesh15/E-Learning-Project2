package com.elearning.web.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue
	@Column(name="student_id")
	private Integer id;
	@Column(name="student_name",nullable=false)
	private String name;
	@Column(name="student_email",nullable=false)
	private String email;
	@Column(name="student_phone_number")
	private String phoneNumber;
	@Column(name="student_password",nullable=false)
	private String password;
    //private Assignment assignment;
    
	@ManyToMany
	private List<Course> courselist;
	
	public List<Course> getCourselist() {
		return courselist;
	}
	public void setCourselist(List<Course> courselist) {
		this.courselist = courselist;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*public Assignment getAssignment() {
		return assignment;
	}
	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}*/
}
