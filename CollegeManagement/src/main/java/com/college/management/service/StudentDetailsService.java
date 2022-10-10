/**
 * 
 */
package com.college.management.service;

import java.util.List;

import com.college.management.entity.StudentDetails;

/**
 * @author SHANTHI R
 * DATE : 06-Oct-2022
 * EMPID : 200
 */
public interface StudentDetailsService {
	StudentDetails getStudentDetailsByStudentId(Integer studentId);
	
	List<StudentDetails> getStudentDetailsByStudentName(String studentName);
	
	List<StudentDetails> getStudentDetailsByStudentNameAndDepartmentName(String studentName,String departmentName);
	
	StudentDetails saveStudentDetails(StudentDetails studentDetails);
	
	StudentDetails saveOrUpdateStudentDetails(StudentDetails studentDetails);
}
