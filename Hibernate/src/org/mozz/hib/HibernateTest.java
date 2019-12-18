package org.mozz.hib;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import  org.hibernate.SessionFactory;
import org.mozz.Adress;
import org.mozz.Vehicle;
import org.mozz.userDetails;

public class HibernateTest {

	public static void main(String[] args) {
		userDetails user = new userDetails();
		//user.setUserId(1);  we nolonger need to set the userid now since it will increase automaticaly
		user.setUsername("mozzy");
		
		Vehicle vehicLe= new Vehicle();
		vehicLe.setVehicleName("car");// before we set the r'ship btn the vehicle and userclass, theyll be no connection btn the vehicle and user details table
		
		Vehicle vehicLe1= new Vehicle();
		vehicLe1.setVehicleName("car1");
		
		user.getVehicle().add( vehicLe);
		user.getVehicle().add( vehicLe1);
		
		vehicLe.setUser(user);//we  have created a reverse r'ship
		vehicLe1.setUser(user);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);// a user table will be created
		session.save(vehicLe);// a vehicle table will also be created
		session.save(vehicLe1);
		session.getTransaction().commit(); 
		session.close();
		
		
	}
}

