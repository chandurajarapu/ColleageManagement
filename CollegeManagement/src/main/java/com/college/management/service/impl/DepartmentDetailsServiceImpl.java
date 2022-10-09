package com.college.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.entity.DepartmentDetails;
import com.college.management.entity.DAO.DepartmentDetailsDAO;
import com.college.management.service.DepartmentDetailsService;
@Service
public class DepartmentDetailsServiceImpl implements DepartmentDetailsService {
	
	@Autowired
	DepartmentDetailsDAO departmentDetailsDAO;

	@Override
	public DepartmentDetails getDepartmentDetailsByDepartmentId(Integer departmentId) {
		return departmentDetailsDAO.getDepartmentDetailsByDepartmentId(departmentId);
	}

	@Override
	public DepartmentDetails getDepartmentDetailsByDepartmentName(String DepartmentName) {
		return departmentDetailsDAO.getDepartmentDetailsByDepartmentName(DepartmentName);
	}

	@Override
	public DepartmentDetails saveDepartmentDetails(DepartmentDetails departmentDetails) {
		return departmentDetailsDAO.saveDepartmentDetails(departmentDetails);
	}

	@Override
	public DepartmentDetails saveOrUpdateDepartmentDetails(DepartmentDetails departmentDetails) {
		return departmentDetailsDAO.saveOrUpdateDepartmentDetails(departmentDetails);
	}

}
