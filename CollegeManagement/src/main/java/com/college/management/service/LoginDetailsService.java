package com.college.management.service;

import java.util.List;

import com.college.management.entity.LoginDetails;

public interface LoginDetailsService {
	
	LoginDetails getLoginDetailsByLoginId(Integer loginId);
	
	List<LoginDetails> getLoginDetailsByUserName(String username);
	
	LoginDetails getLoginDetailsByUserNameAndUserPassword(String userName,String userPassword);
	
	LoginDetails saveLogindetails(LoginDetails loginDetails);
	
	LoginDetails saveOrUpdateLoginDetails(LoginDetails loginDetails);

}
