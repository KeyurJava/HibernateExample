package com.implClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.entities.Address;
import com.entities.Students;
import com.entities.Teachers;
import com.utilities.HibernateUtility;

public class StudentAdd {

	public static void main(String args[]) throws IOException {

		Students st = new Students();
		st.setS_id(1);
		st.setS_name("Keyur");
		st.setS_emailId("Keyur.patel0921@gmail.com");

		Teachers tc = new Teachers();
		tc.setT_id(1);
		tc.setT_name("Pinkesh Thakker");
		tc.setT_emailId("PinkshThakker@gmail.com");

		Address address = new Address();
		address.setAddressId(1);
		address.setCity("Waterloo");
		address.setIsopen(true);
		address.setStreet("University evenue");
		address.setAddedDate(new Date());
		address.setTemp(1.1);

		FileInputStream stream = new FileInputStream("src/main/resources/img.png");
		byte[] data = new byte[stream.available()];
		stream.read(data);

		address.setImage(data);

		Session session = HibernateUtility.buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(st);
		session.save(tc);
		session.save(address);
		session.getTransaction().commit();
		session.close();

	}

}
