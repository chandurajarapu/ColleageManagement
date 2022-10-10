package com.college.management.entity.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.college.management.entity.DepartmentDetails;
import com.college.management.entity.LoginDetails;
import com.college.management.entity.StudentDetails;
import com.college.management.entity.DAO.LoginDetailsDAO;
@Repository
public class LoginDetailsDAOImpl extends HibernateUtil implements LoginDetailsDAO {

		Logger logger = LoggerFactory.getLogger("LoginDetailsDAOImpl");
		@Override
		public LoginDetails getLoginDetailsByLoginId(Integer loginId) {
				logger.info("start:getLoginDetailsByLoginId()");
				Session session = getSession();
				LoginDetails loginDetails = session.get(LoginDetails.class, loginId);
				closeSession(session);
				
				return loginDetails;
	}

	@Override
	public LoginDetails getLoginDetailsByUserNameAndUserPassword(String userName, String userPassword) {
		logger.info("START:getLoginDetailsuserNameAndUserPassword()");
		Session session=getSession();
		Query query=session.createQuery("from LoginDetails where userName=:uName and userPassword=:uPassword");
		query.setParameter("uName",userName);
		query.setParameter("uPassword",userPassword);
		LoginDetails resp = (LoginDetails) query.uniqueResult();
		closeSession(session);
		return resp;
	}
		

	@Override
	public LoginDetails saveLogindetails(LoginDetails loginDetails) {
		logger.info("START : saveLoginDetails()");
		Session session = getSession();
		Transaction txn = session.beginTransaction();
		try {
			Integer count = (Integer) session.save(loginDetails);
			txn.commit();
			return loginDetails;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}

	@Override
	public LoginDetails saveOrUpdateLoginDetails(LoginDetails loginDetails) {
		logger.info("START : saveOrUpdateLoginDetails()");
		Session session = getSession();
		Transaction txn = session.beginTransaction();
		try {
			session.saveOrUpdate(loginDetails);
			txn.commit();
			return loginDetails;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}

}
