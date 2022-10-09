package com.college.management.entity.DAO.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.college.management.entity.DepartmentDetails;
import com.college.management.entity.DAO.DepartmentDetailsDAO;

@Repository
public class DepartmentDetailsDAOImpl extends HibernateUtil implements DepartmentDetailsDAO {

	Logger logger = LoggerFactory.getLogger("DepartmentDetailsDAOImpl");
	@Override
	public DepartmentDetails getDepartmentDetailsByDepartmentId(Integer departmentId) {
		logger.info("start:getDepartmentDetailsByDepartmentId()");
		Session session = getSession();
		DepartmentDetails departmentDetails = session.get(DepartmentDetails.class, departmentId);
		closeSession(session);
		
		return departmentDetails;
	}
	@Override
	public DepartmentDetails getDepartmentDetailsByDepartmentName(String departmentName) {
		logger.info("START : getDepartmentDetailsByDepartmentName()");
		Session session = getSession();
		Query query = session.createQuery("from DepartmentDetails where  departmentName=:dName");
		query.setParameter("dName", departmentName);
		DepartmentDetails resp = (DepartmentDetails) query.uniqueResult();
		closeSession(session);
		return resp;
	}

	@Override
	public DepartmentDetails saveDepartmentDetails(DepartmentDetails departmentDetails) {
		logger.info("START : saveDepartmentDetails()");
		Session session = getSession();
		Transaction txn = session.beginTransaction();
		try {
			Integer count = (Integer) session.save(departmentDetails);
			txn.commit();
			return departmentDetails;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		
		return null;
	}

	@Override
	public DepartmentDetails saveOrUpdateDepartmentDetails(DepartmentDetails departmentDetails) {
		logger.info("START : saveOrUpdateDepartmentDetails()");
		Session session = getSession();
		Transaction txn = session.beginTransaction();
		try {
			session.saveOrUpdate(departmentDetails);
			txn.commit();
			return departmentDetails;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}

}
