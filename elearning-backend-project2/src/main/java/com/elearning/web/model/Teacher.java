package com.elearning.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	@Id
	@GeneratedValue
	@Column(name="Teacher_id",nullable=false)
	private Integer id;
	@Column(name="Teacher_name",nullable=false)
	private String name;
	@Column(name="Teacher_Mobile_Number",nullable=false)
	private Integer mobilenumber;
	@Column(name="Teacher_email",nullable=false)
	private String email;
	@Column(name="Teacher_password",nullable=false)
	private String password;
	@Column(name="Specialization",nullable=false)
	private String specialization;
	
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
	public Integer getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Integer mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	// private Course course;
	
}
