package com.college.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.entity.LoginDetails;
import com.college.management.entity.DAO.LoginDetailsDAO;
import com.college.management.service.LoginDetailsService;
@Service
public class LoginDetailsServiceImpl implements LoginDetailsService {
	
	@Autowired
    LoginDetailsDAO loginDetailsDAO;
	
	@Override
	public LoginDetails getLoginDetailsByLoginId(Integer loginId) {
		return loginDetailsDAO.getLoginDetailsByLoginId(loginId);
	}

	@Override
	public LoginDetails getLoginDetailsByUserNameAndUserPassword(String userName, String userPassword) {
		return loginDetailsDAO.getLoginDetailsByUserNameAndUserPassword(userName, userPassword);
	}

	@Override
	public LoginDetails saveLogindetails(LoginDetails loginDetails) {
		return loginDetailsDAO.saveLogindetails(loginDetails);
	}

	@Override
	public LoginDetails saveOrUpdateLoginDetails(LoginDetails loginDetails) {
		return loginDetailsDAO.saveOrUpdateLoginDetails(loginDetails);
	}

	
	@Override
	public List<LoginDetails> getLoginDetailsByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
