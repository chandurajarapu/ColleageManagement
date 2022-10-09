/**
 * 
 */
package com.college.management.service;

import com.college.management.entity.DepartmentDetails;

/**
 * @author SHANTHI R
 * DATE : 06-Oct-2022
 * EMPID : 200
 */
public interface DepartmentDetailsService {
DepartmentDetails getDepartmentDetailsByDepartmentId(Integer departmentId);
	
	DepartmentDetails getDepartmentDetailsByDepartmentName(String DepartmentName);
	
	DepartmentDetails saveDepartmentDetails(DepartmentDetails departmentDetails);
	
	DepartmentDetails saveOrUpdateDepartmentDetails(DepartmentDetails departmentDetails);
}
