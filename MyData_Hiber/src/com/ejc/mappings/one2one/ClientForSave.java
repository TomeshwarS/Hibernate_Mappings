package com.ejc.mappings.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ClientForSave {
	public  static  void main(String args[])
	{

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		  Student s = new Student();
		  s.setStudentName("Rahul ");
		  s.setGrp("Java Study ");
		  Address ad = new Address(); 
		  ad.setPlace("Pune Baner  !!!");
		  ad.setParent(s);
		  Transaction tx = session.beginTransaction(); session.save(ad); tx.commit();
		  session.close();
		  System.out.println("One to One with annotations is done..!!!!"); sf.close();
	}
}
