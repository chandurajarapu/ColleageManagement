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
@Table(name = "tbl_student_details")
public class StudentDetails implements Serializable {
	
		@Id
		@Column(name = "student_id")
		@GenericGenerator(name = "autoInc", strategy = "increment")
		@GeneratedValue(generator = "autoInc")
		private Integer studentId;
	
		@Column(name = "student_name")
		private String studentName;
		
		@Column(name = "student_department")
		private String studentDepartment;
		
		@Column(name = "accademic_year")
		private String accademicYear;

		@Column(name = "present_address")
		private String presentAddress;
		
		@Column(name = "permanent_address")
		private String permanentAddress;
		

		@Column(name = "created_date")
		private Date createdDate;
		
		@Column(name = "updated_date")
		private Date updatedDate;

		public Integer getStudentId() {
			return studentId;
		}

		public void setStudentId(Integer studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getStudentDepartment() {
			return studentDepartment;
		}

		public void setStudentDepartment(String studentDepartment) {
			this.studentDepartment = studentDepartment;
		}

		public String getAccademicYear() {
			return accademicYear;
		}

		public void setAccademicYear(String accademicYear) {
			this.accademicYear = accademicYear;
		}

		public String getPresentAddress() {
			return presentAddress;
		}

		public void setPresentAddress(String presentAddress) {
			this.presentAddress = presentAddress;
		}

		public String getPermanentAddress() {
			return permanentAddress;
		}

		public void setPermanentAddress(String permanentAddress) {
			this.permanentAddress = permanentAddress;
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
