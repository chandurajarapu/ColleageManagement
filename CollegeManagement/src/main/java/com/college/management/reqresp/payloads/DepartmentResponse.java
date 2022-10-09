/**
 * 
 */
package com.college.management.reqresp.payloads;

import java.io.Serializable;

/**
 * @author SHANTHI R
 * DATE : 07-Oct-2022
 * EMPID : 200
 */
public class DepartmentResponse extends RootResponse implements Serializable{
	
	private String departmentName;

	private Integer departmentId;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	
	
	
}
