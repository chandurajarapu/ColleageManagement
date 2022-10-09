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
public class DepartmentPayload implements Serializable{
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
