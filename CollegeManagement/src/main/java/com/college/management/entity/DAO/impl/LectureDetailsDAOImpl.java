package com.college.management.entity.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.college.management.entity.LectureDetails;
import com.college.management.entity.StudentDetails;
import com.college.management.entity.DAO.LectureDetailsDAO;
@Repository
public class LectureDetailsDAOImpl extends HibernateUtil implements LectureDetailsDAO {
	Logger logger = LoggerFactory.getLogger("LectureDetailsDAOImpl");
	@Override
	public LectureDetails getLectureDetailsByLectureId(Integer lectureId) {
		logger.info("start:getLecureDetailsByLectureId()");
		Session session = getSession();
		LectureDetails lectureDetails = session.get(LectureDetails.class, lectureId);
		closeSession(session);
		
		return lectureDetails;
	}

	@Override
	public List<LectureDetails> getLectureDetailsByLectureName(String lectureName) {
		logger.info("start:getLectureDetailsByLectureName()");
		Session session=getSession();
		Query query = session.createQuery("from LectureDetails where lectureName=:lName");
		query.setParameter("lName", lectureName);
		List<LectureDetails> resp =  query.list();
		closeSession(session);
		return resp;
	}

	@Override
	public List<LectureDetails> getLectureDetailsByLectureNameAndDepartname(String lectureName, String departmentName){
		logger.info("start:getlectureDetailsByLectureNameAndDepartname()");
		Session session=getSession();
		Query query = session.createQuery("from lectureDetails where lectureName=:lname and deparname=:dName");
		query.setParameter("lName", lectureName);
		query.setParameter("dName", departmentName);
		List<LectureDetails> resp = query.list();

		
	return resp;	
	}

	@Override
	public LectureDetails saveLectureDetails(LectureDetails lectureDetails) {
		logger.info("START : saveLectureDetails()");
		Session session = getSession();
		Transaction txn = session.beginTransaction();
		try {
			Integer count = (Integer) session.save(lectureDetails);
			txn.commit();
			return lectureDetails;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		
		return null;
	}

	@Override
	public LectureDetails saveOrUpdateLectureDetails(LectureDetails lectureDetails) {
		logger.info("START : saveOrUpdateLectureDetails()");
		Session session = getSession();
		Transaction txn = session.beginTransaction();
		try {
			session.saveOrUpdate(lectureDetails);
			txn.commit();
			return lectureDetails;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}

}
