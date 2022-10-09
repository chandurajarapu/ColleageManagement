/**
 * 
 */
package com.college.management.reqresp.payloads;

import java.io.Serializable;

/**
 * @author SHANTHI R
 * DATE : 08-Oct-2022
 * EMPID : 200
 */
public class LecturePayload implements Serializable {
	
	private String lectureName;
	private String  lectureDepartment;
	private String  presentAddress;
	private String permanentAddress;
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
	

}
