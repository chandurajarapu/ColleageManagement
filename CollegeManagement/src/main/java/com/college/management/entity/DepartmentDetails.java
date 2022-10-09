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
@Table(name = "tbl_department_details")
public class DepartmentDetails implements Serializable {
	@Id
	@Column(name = "department_id")
	@GenericGenerator(name = "autoInc", strategy = "increment")
	@GeneratedValue(generator = "autoInc")
	private Integer departmentId;

	@Column(name = "department_name")
	private String departmentName;
	@Column(name = "department_start_date")
	private Date departmentStartDate;
	
	@Column(name = "department_end_date")
	private Date departmentEndDate;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "updated_date")
	private Date updatedDate;


	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Date getDepartmentStartDate() {
		return departmentStartDate;
	}

	public void setDepartmentStartDate(Date departmentStartDate) {
		this.departmentStartDate = departmentStartDate;
	}

	public Date getDepartmentEndDate() {
		return departmentEndDate;
	}

	public void setDepartmentEndDate(Date departmentEndDate) {
		this.departmentEndDate = departmentEndDate;
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
