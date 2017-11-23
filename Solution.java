package com.veh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		// BufferedReader bf = new BufferedReader(new
		// InputStreamReader(System.in));

		// session.getTransaction().commit();
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("car");
		TwoWheeler two = new TwoWheeler();
		two.setVehicleName("Bike");
		two.setStreeingHandle("Bike Streeing wheel");

		FourWheeler four = new FourWheeler();
		four.setVehicleName("Porsche");
		four.setStreeingWheel("Porsche Streeing Wheel");
		
		session.beginTransaction();
		session.save(vehicle);
		session.save(two);
		session.save(four);
		 session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
