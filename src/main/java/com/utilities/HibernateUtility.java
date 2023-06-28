package com.utilities;

import javax.security.auth.Subject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Address;
import com.entities.Students;
import com.entities.Subjects;
import com.entities.Teachers;

public class HibernateUtility {

	public static SessionFactory buildSessionFactory() {

		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Students.class);
		configuration.addAnnotatedClass(Teachers.class);
		configuration.addAnnotatedClass(Subjects.class);
		configuration.addAnnotatedClass(Address.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}

}
