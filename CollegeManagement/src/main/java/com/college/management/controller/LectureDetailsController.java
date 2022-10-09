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

import com.college.management.entity.LectureDetails;
import com.college.management.entity.StudentDetails;
import com.college.management.reqresp.payloads.LecturePayload;
import com.college.management.reqresp.payloads.LectureResponse;
import com.college.management.reqresp.payloads.RootResponse;
import com.college.management.service.LectureDetailsService;

/**
 * @author SHANTHI R
 * DATE : 08-Oct-2022
 * EMPID : 200
 */
@RestController
@RequestMapping("/lecture")
public class LectureDetailsController {
Logger logger = LoggerFactory.getLogger("LectureDetailsController");
	
@Autowired
	LectureDetailsService lectureDetailsService;

@RequestMapping(value="/save-lecture-details",method=RequestMethod.POST)
public RootResponse saveLectureDetails(@RequestBody LecturePayload lecturePayload,HttpServletRequest request) {
	RootResponse resp = new RootResponse();
	LectureDetails lectureDetails = new LectureDetails();
	lectureDetails.setLectureName(lecturePayload.getLectureName());
	lectureDetails.setLecturePermanentAddress(lecturePayload.getPermanentAddress());
	lectureDetails.setLecturePresentAddress(lecturePayload.getPresentAddress());
	lectureDetails.setLectureDepartment(lecturePayload.getLectureDepartment());
	lectureDetails.setCreatedDate(new Date());
	lectureDetails.setUpdatedDate(new Date());
	lectureDetails = lectureDetailsService.saveLectureDetails(lectureDetails );
	if( lectureDetails != null && lectureDetails.getLectureId() != null ){
		logger.info("StudentId : "+lectureDetails.getLectureId());
		resp.setStatusCode("200");
		resp.setStatusmessage("Success");
	}else{
		logger.info("Somthing went wrong while saving lecture details");
		resp.setStatusCode("500");
		resp.setStatusmessage("Somthing went wrong while saving lecture details");
	}
	return resp;
}

@RequestMapping(value="/get-lecture-details",method=RequestMethod.POST)
public LectureResponse getLectureDetailsByLectureName(@RequestBody LecturePayload lecturePayload,HttpServletRequest request) {
	LectureResponse resp = new LectureResponse();
	 List<LectureDetails>  lectureDetailsList =  lectureDetailsService.getLectureDetailsByLectureName(lecturePayload.getLectureName());
	if( lectureDetailsList != null && !lectureDetailsList.isEmpty()){
		resp.setStatusCode("200");
		resp.setStatusmessage("Success");
		resp.setResponse(lectureDetailsList);
	}else{
		logger.info("Somthing went wrong while getting lecture details");
		resp.setStatusCode("500");
		resp.setStatusmessage("Recard not found");
	}
	return resp;
}


}


