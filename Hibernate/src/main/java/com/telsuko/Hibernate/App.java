package com.telsuko.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Laptop lp = new Laptop();
		lp.setId(1);
		lp.setLname("Mac");

		Student student = new Student();
		FLMname aname = new FLMname();
		aname.setFname("krishna");
		aname.setLname("reddy");
		aname.setMname("khambam");

		student.setRollno(105);
		student.setAname(aname);
		student.setMarks(21);
		student.setGrade("A");
		student.getLaptop().add(lp);

		// Only Hibernate Configuration
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		// To maintain Acid properties, we use transaction
 
		Transaction tx = session.beginTransaction();

		session.save(student);
		session.save(lp);

		// student = (Student) session.get(Student.class, 105);

		tx.commit();

		// System.out.println(student);
	}
}
