/**
 * 
 */
package com.college.management.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.college.management.entity.DepartmentDetails;
import com.college.management.reqresp.payloads.DepartmentPayload;
import com.college.management.reqresp.payloads.DepartmentResponse;
import com.college.management.reqresp.payloads.RootResponse;
import com.college.management.service.DepartmentDetailsService;

/**
 * @author SHANTHI R
 * DATE : 07-Oct-2022
 * EMPID : 200
 */

@RestController
@RequestMapping("/department")
public class DepartmentDetailsController {
	
	Logger logger = LoggerFactory.getLogger("DepartmentDetailsController");
		
	@Autowired
	DepartmentDetailsService departmentDetailsService;
	
	@RequestMapping(value="/save-department-details",method=RequestMethod.POST)
	public RootResponse saveDepartmentDetails(@RequestBody DepartmentPayload departmentPayload,HttpServletRequest request) {
		RootResponse resp = new RootResponse();
		DepartmentDetails departmentDetails = new DepartmentDetails();
		departmentDetails.setDepartmentStartDate(new Date());
		departmentDetails.setCreatedDate(new Date());
		departmentDetails.setUpdatedDate(new Date());
		departmentDetails.setDepartmentName(departmentPayload.getDepartmentName());
		departmentDetails = departmentDetailsService.saveDepartmentDetails(departmentDetails );
		if( departmentDetails != null && departmentDetails.getDepartmentId() != null ){
			logger.info("DeartmentId : "+departmentDetails.getDepartmentId());
			resp.setStatusCode("200");
			resp.setStatusmessage("Success");
		}else{
			logger.info("Somthing went wrong while saving department details");
			resp.setStatusCode("500");
			resp.setStatusmessage("Somthing went wrong while saving department details");
		}
		return resp;
	}
	
	@RequestMapping(value="/get-department-details",method=RequestMethod.POST)
	public DepartmentResponse saveDepartmentDetailsByDepartmentName(@RequestBody DepartmentPayload departmentPayload,HttpServletRequest request) {
		DepartmentResponse resp = new DepartmentResponse();
		logger.info("Start: saveDepartmentDetailsByDepartmentName");
		DepartmentDetails departmentDetails = departmentDetailsService.getDepartmentDetailsByDepartmentName(departmentPayload.getDepartmentName());
		if( departmentDetails != null && departmentDetails.getDepartmentId() != null ){
			logger.info("DeartmentId : "+departmentDetails.getDepartmentId());
			resp.setStatusCode("200");
			resp.setStatusmessage("Success");
			resp.setDepartmentId(departmentDetails.getDepartmentId());
			resp.setDepartmentName(departmentDetails.getDepartmentName());
		}else{
			logger.info("Somthing went wrong while saving department details");
			resp.setStatusCode("500");
			resp.setStatusmessage("Recard not found");
		}
		return resp;
	}
}
