/**
 * 
 */
package com.college.management.entity.DAO;

import java.util.List;

import com.college.management.entity.LoginDetails;

/**
 * @author SHANTHI R
 * DATE : 08-Oct-2022
 * EMPID : 200
 */
public interface LoginDetailsDAO {
	LoginDetails getLoginDetailsByLoginId(Integer loginId);
	List<LoginDetails> getLoginDetailsByUserNameAndUserPassword(String userName, String userPassword);
	LoginDetails saveLogindetails(LoginDetails loginDetails);
	LoginDetails saveOrUpdateLoginDetails(LoginDetails loginDetails);

}
