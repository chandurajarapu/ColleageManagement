/**
 * 
 */
package com.college.management.entity.DAO;

import com.college.management.entity.DepartmentDetails;
import com.college.management.entity.StudentDetails;

/**
 * @author SHANTHI R
 * DATE : 06-Oct-2022
 * EMPID : 200
 */
public interface DepartmentDetailsDAO {
	DepartmentDetails getDepartmentDetailsByDepartmentId(Integer departmentId);
	
	DepartmentDetails getDepartmentDetailsByDepartmentName(String DepartmentName);
	
	DepartmentDetails saveDepartmentDetails(DepartmentDetails departmentDetails);
	
	DepartmentDetails saveOrUpdateDepartmentDetails(DepartmentDetails departmentDetails);
}

