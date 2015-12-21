package net.iskandar.examples.chat.app.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseHibernateService {
    
    @Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

}
