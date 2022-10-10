package com.college.management.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.LoginDetails;
import com.college.management.entity.StudentDetails;
import com.college.management.reqresp.payloads.LoginPayload;
import com.college.management.reqresp.payloads.LoginResponse;
import com.college.management.reqresp.payloads.RootResponse;
import com.college.management.reqresp.payloads.StudentPayload;
import com.college.management.reqresp.payloads.StudentResponse;
import com.college.management.service.LoginDetailsService;

@RestController
@RequestMapping("/login")
public class LoginDetailsController {
	Logger logger = LoggerFactory.getLogger("LoginDetailsController");
@Autowired	

		LoginDetailsService	loginDetailsService;
@RequestMapping(value="/save-login-details",method=RequestMethod.POST)
public RootResponse saveLoginDetails(@RequestBody LoginPayload loginPayload,HttpServletRequest request) {
	RootResponse resp = new RootResponse();
	LoginDetails loginDetails = new LoginDetails();
	loginDetails.setFirstName(loginPayload.getFirstName());
	loginDetails.setEmailAddress(loginPayload.getEmailAddress());
	loginDetails.setMobileNumber(loginPayload.getMobileNumber());
	loginDetails.setLastName(loginPayload.getLastName());
	loginDetails.setMiddleName(loginPayload.getMiddleName());
	loginDetails.setUserPassword(loginPayload.getUserPassword());
	loginDetails.setUserName(loginPayload.getUserName());
	loginDetails.setCreatedDate(new Date());
	loginDetails.setUpdatedDate(new Date());
	loginDetails = loginDetailsService.saveLogindetails(loginDetails );
	if( loginDetails != null && loginDetails.getLoginId() != null ){
		logger.info("LoginId : "+loginDetails.getLoginId());
		resp.setStatusCode("200");
		resp.setStatusmessage("Success");
	}else{
		logger.info("Somthing went wrong while saving login details");
		resp.setStatusCode("500");
		resp.setStatusmessage("Somthing went wrong while saving login details");
	}
	return resp;
}

@RequestMapping(value="/get-login-details",method=RequestMethod.POST)
public LoginResponse getLoginDetailsByUserName(@RequestBody LoginPayload loginPayload,HttpServletRequest request) {
	LoginResponse resp = new LoginResponse();
	 LoginDetails  loginDetails =  loginDetailsService.getLoginDetailsByUserNameAndUserPassword(loginPayload.getUserName(), loginPayload.getUserPassword());
	if( loginDetails != null){
		loginDetails.setLastLoginDate(new Date());
		loginDetails.setUpdatedDate(new Date());
		loginDetails = loginDetailsService.saveOrUpdateLoginDetails(loginDetails );
		resp.setStatusCode("200");
		resp.setStatusmessage("Success");
		resp.setResponse(loginDetails);
	}else{
		logger.info("Somthing went wrong while getting login details");
		resp.setStatusCode("500");
		resp.setStatusmessage("Recard not found");
	}
	return resp;
}

	

}
