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
 * DATE : 08-Oct-2022
 * EMPID : 200
 */
@Entity
@Table(name = "tbl_login_details")
public class LoginDetails implements Serializable {
	@Id
	@Column(name = "login_id")
	@GenericGenerator(name = "autoInc", strategy = "increment")
	@GeneratedValue(generator = "autoInc")
	private Integer loginId;

	@Column(name = "user_name")
	private String userName;
	

	@Column(name = "user_password")
	private String userPassword;
	

	@Column(name = "first_name")
	private String firstName;
	

	@Column(name = "last_name")
	private String lastName;
	

	@Column(name = "middle_name")
	private String middleName;
	

	@Column(name = "email_address")
	private String emailAddress;
	

	@Column(name = "mobile_number")
	private String mobileNumber;
	

	@Column(name = "last_Login_date")
	private Date lastLoginDate;
	

	@Column(name = "created_date")
	private Date createdDate;
	

	@Column(name = "updated_date")
	private Date updatedDate;


	public Integer getLoginId() {
		return loginId;
	}


	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Date getLastLoginDate() {
		return lastLoginDate;
	}


	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
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
