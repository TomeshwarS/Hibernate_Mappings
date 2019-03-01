package com.test.annoatation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {

	
	public static void main(String[] args) {

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		
	}
}
