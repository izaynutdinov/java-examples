package net.iskandar.for_binadox.chat.server.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BaseHibernateService {
    
    @Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

}
