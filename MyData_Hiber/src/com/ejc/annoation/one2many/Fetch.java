package com.ejc.annoation.one2many;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Fetch {
	
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		List<Vendor> vendor=(List<Vendor>) session.createCriteria(Vendor.class).list();
	
		 System.out.println(vendor);
	
	
	}

}
