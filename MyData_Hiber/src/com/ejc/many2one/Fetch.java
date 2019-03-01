package com.ejc.many2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Fetch {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Customers customers = (Customers) session.load(Customers.class,121);
		Vendor vendor = customers.getParent();
		System.out.println(customers);

		System.out.println(vendor);

	}
}
