/**
 * 
 */
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

import com.college.management.entity.DepartmentDetails;
import com.college.management.entity.StudentDetails;
import com.college.management.reqresp.payloads.DepartmentPayload;
import com.college.management.reqresp.payloads.DepartmentResponse;
import com.college.management.reqresp.payloads.RootResponse;
import com.college.management.reqresp.payloads.StudentPayload;
import com.college.management.reqresp.payloads.StudentResponse;
import com.college.management.service.StudentDetailsService;

/**
 * @author SHANTHI R
 * DATE : 06-Oct-2022
 * EMPID : 200-
 */

@RestController
@RequestMapping("/student")
public class StudentDetailsController {
	Logger logger=LoggerFactory.getLogger("StudentDetailsController");
	@Autowired
	StudentDetailsService studentDetailsService;
	
	@RequestMapping(value="/save-student-details",method=RequestMethod.POST)
	public RootResponse saveStudentDetails(@RequestBody StudentPayload studentPayload,HttpServletRequest request) {
		RootResponse resp = new RootResponse();
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setAccademicYear(studentPayload.getAccademicYear());
		studentDetails.setPermanentAddress(studentPayload.getPermanentAddress());
		studentDetails.setPresentAddress(studentPayload.getPresentAddress());
		studentDetails.setStudentName(studentPayload.getStudentName());
		studentDetails.setStudentDepartment(studentPayload.getDepartmentName());
		studentDetails.setCreatedDate(new Date());
		studentDetails.setUpdatedDate(new Date());
		studentDetails = studentDetailsService.saveStudentDetails(studentDetails );
		if( studentDetails != null && studentDetails.getStudentId() != null ){
			logger.info("StudentId : "+studentDetails.getStudentId());
			resp.setStatusCode("200");
			resp.setStatusmessage("Success");
		}else{
			logger.info("Somthing went wrong while saving student details");
			resp.setStatusCode("500");
			resp.setStatusmessage("Somthing went wrong while saving student details");
		}
		return resp;
	}
	
	@RequestMapping(value="/get-student-details",method=RequestMethod.POST)
	public StudentResponse getStudentDetailsByStudentName(@RequestBody StudentPayload studentPayload,HttpServletRequest request) {
		StudentResponse resp = new StudentResponse();
		 List<StudentDetails>  studentDetailsList =  studentDetailsService.getStudentDetailsByStudentName(studentPayload.getStudentName());
		if( studentDetailsList != null && !studentDetailsList.isEmpty()){
			resp.setStatusCode("200");
			resp.setStatusmessage("Success");
			resp.setResponse(studentDetailsList);
		}else{
			logger.info("Somthing went wrong while getting student details");
			resp.setStatusCode("500");
			resp.setStatusmessage("Recard not found");
		}
		return resp;
	}



}
