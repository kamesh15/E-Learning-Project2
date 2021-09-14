package com.elearning.web.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AssignmentDetails")
public class Assignment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Assignment_ID",nullable=false)
	private Integer assignment_id;
	
	@Column(name="Assignment_Link",nullable=false)
	private String assignment_link;
	
	@Column(name="Remarks",nullable=false)
	private String remark;
	
	@Column(name="Submitted_Date",nullable=false)
	private Date submitted_date;
	
	//private Student student;

	public Integer getAssignment_id() {
		return assignment_id;
	}

	public void setAssignment_id(Integer assignment_id) {
		this.assignment_id = assignment_id;
	}

	public String getAssignment_link() {
		return assignment_link;
	}

	public void setAssignment_link(String assignment_link) {
		this.assignment_link = assignment_link;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getSubmitted_date() {
		return submitted_date;
	}

	public void setSubmitted_date(Date submitted_date) {
		this.submitted_date = submitted_date;
	}

	/*public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}*/
	

}
