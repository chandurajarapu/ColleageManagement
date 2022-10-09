package com.college.management.reqresp.payloads;

import java.io.Serializable;

public class StudentPayload implements Serializable {
	
	private String studentName;
	private String departmentName;
	private String accademicYear;
	private String permanentAddress;
	private String presentAddress;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getAccademicYear() {
		return accademicYear;
	}
	public void setAccademicYear(String accademicYear) {
		this.accademicYear = accademicYear;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

}