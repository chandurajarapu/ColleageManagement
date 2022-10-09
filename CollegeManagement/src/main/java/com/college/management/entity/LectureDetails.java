/**
 * 
 */
package com.college.management.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author SHANTHI R
 * DATE : 06-Oct-2022
 * EMPID : 200
 */
@Entity
@Table(name ="tbl_lecture_details")
public class LectureDetails implements Serializable {
	@Id
	@Column(name = "lecture_id")
	@GenericGenerator(name = "autoInc", strategy = "increment")
	@GeneratedValue(generator = "autoInc")
	private Integer lectureId;

	@Column(name = "lecture_name")
	private String lectureName;
	
	@Column(name = "lecture_department")
	private String lectureDepartment;
	
	@Column(name = "lecture_present_address")
	private String lecturePresentAddress;
	
	@Column(name = "lecture_permanent_address")
	private String lecturePermanentAddress;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "updated_date")
	private Date updatedDate;

	public Integer getLectureId() {
		return lectureId;
	}

	public void setLectureId(Integer lectureId) {
		this.lectureId = lectureId;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public String getLectureDepartment() {
		return lectureDepartment;
	}

	public void setLectureDepartment(String lectureDepartment) {
		this.lectureDepartment = lectureDepartment;
	}

	public String getLecturePresentAddress() {
		return lecturePresentAddress;
	}

	public void setLecturePresentAddress(String lecturePresentAddress) {
		this.lecturePresentAddress = lecturePresentAddress;
	}

	public String getLecturePermanentAddress() {
		return lecturePermanentAddress;
	}

	public void setLecturePermanentAddress(String lecturePermanentAddress) {
		this.lecturePermanentAddress = lecturePermanentAddress;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
}
