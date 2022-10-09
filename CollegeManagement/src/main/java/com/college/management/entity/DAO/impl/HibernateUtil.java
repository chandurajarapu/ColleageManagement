/**
 * 
 */
package com.college.management.entity.DAO.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author SHANTHI R
 * DATE : 07-Oct-2022
 * EMPID : 200
 */

@Component
public class HibernateUtil {
	
	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 public Session getSession() {
		return sessionFactory.openSession();
	}
	 
	 public void closeSession(Session session){
		 if ( session != null ) {
			session.close();
		}
	 }
}
