package com.college.management.entity.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.college.management.entity.DepartmentDetails;
import com.college.management.entity.StudentDetails;
import com.college.management.entity.DAO.StudentDetailsDAO;
@Repository
public class StudentDetailsDAOImpl extends HibernateUtil implements StudentDetailsDAO {
	Logger logger = LoggerFactory.getLogger("StudentDetailsDAOImpl");
	@Override
	public StudentDetails getStudentDetailsByStudentId(Integer studentId) {
			logger.info("start:getStudentDetailsByStudentId()");
			Session session = getSession();
			StudentDetails studentDetails = session.get(StudentDetails.class, studentId);
			closeSession(session);
			
			return studentDetails;
	}

	@Override
	public List<StudentDetails> getStudentDetailsByStudentName(String studentName) {
		
		logger.info("START : getStudentDetailsStudentName()");
		Session session = getSession();
		Query query = session.createQuery("from StudentDetails where studentName=:sName");
		query.setParameter("sName", studentName);
		List<StudentDetails> resp =  query.list();
		closeSession(session);
		return resp;
		
		
		
	
	}

	@Override
	public List<StudentDetails> getStudentDetailsByStudentNameAndDepartmentName(String studentName,
			String departmentName) {
		logger.info("START:getStudentDetailsStudentNameAndDepartmentName");
		Session session=getSession();
		Query query=session.createQuery("from StudentDetails where studentName=:sName and departmentName=:dName;");
		query.setParameter("sName",studentName);
		query.setParameter("dName",departmentName);
		List<StudentDetails> resp = query.list();
		closeSession(session);
		
		return resp;
	}

	@Override
	public StudentDetails saveStudentDetails(StudentDetails studentDetails) {
		logger.info("START : saveStudentDetails()");
		Session session = getSession();
		Transaction txn = session.beginTransaction();
		try {
			Integer count = (Integer) session.save(studentDetails);
			txn.commit();
			return studentDetails;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		
		return null;
	}

	@Override
	public StudentDetails saveOrUpdateStudentDetails(StudentDetails studentDetails) {
		logger.info("START : saveOrUpdateStudentDetails()");
		Session session = getSession();
		Transaction txn = session.beginTransaction();
		try {
			session.saveOrUpdate(studentDetails);
			txn.commit();
			return studentDetails;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}

}
