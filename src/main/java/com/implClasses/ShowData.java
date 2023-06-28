package com.implClasses;

import org.hibernate.Session;

import com.entities.Students;
import com.utilities.HibernateUtility;

public class ShowData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = HibernateUtility.buildSessionFactory().openSession();
//		Students st = (Students) session.get(Students.class, 1);
//		Students st2 = (Students) session.get(Students.class, 1);

		Students st = (Students) session.load(Students.class, 1);
		System.out.println("=========");
		Students st2 = (Students) session.load(Students.class, 1);
		// System.out.println(st);
		// System.out.println("==>" + st2);
		session.close();

	}

}
