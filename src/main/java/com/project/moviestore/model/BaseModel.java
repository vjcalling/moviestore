package com.project.moviestore.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

import com.project.moviestore.utilities.HibernateUtil;

public class BaseModel {

	private static BaseModel instance = new BaseModel();
	
	private BaseModel(){
		
	}
	
	public static BaseModel getInstance(){
		return instance;
	}
	public List findByCriteria(Class clazz, Criterion crList){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(clazz);
		criteria.add(crList);
		
		List list = criteria.list();
		return list;
	}
}
