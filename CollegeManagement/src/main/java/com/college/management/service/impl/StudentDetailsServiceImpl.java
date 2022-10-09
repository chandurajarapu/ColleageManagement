package com.college.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.entity.StudentDetails;
import com.college.management.entity.DAO.LectureDetailsDAO;
import com.college.management.entity.DAO.StudentDetailsDAO;
import com.college.management.service.StudentDetailsService;
@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {
	
	@Autowired
	StudentDetailsDAO studenDetailsDAO;
	
	
	@Override
	public StudentDetails getStudentDetailsByStudentId(Integer studentId) {
		return studenDetailsDAO.getStudentDetailsByStudentId(studentId);
				
	}

	@Override
	public List<StudentDetails> getStudentDetailsByStudentName(String studentName) {
		return studenDetailsDAO.getStudentDetailsByStudentName(studentName);
	}

	@Override
	public List<StudentDetails> getStudentDetailsByStudentNameAndDepartmentName(String studentName,
			String departmentName) {
		return studenDetailsDAO.getStudentDetailsByStudentNameAndDepartmentName(studentName, departmentName);
	}

	@Override
	public StudentDetails saveStudentDetails(StudentDetails studentDetails) {
		return studenDetailsDAO.saveStudentDetails(studentDetails);
	}

	@Override
	public StudentDetails saveOrUpdateStudentDetails(StudentDetails studentDetails) {
		return studenDetailsDAO.saveOrUpdateStudentDetails(studentDetails);
	}

}
