package com.BankingManagement_hibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BMSUtil {
	private static SessionFactory sessionFactory;
	static {
		try {
			sessionFactory=new Configuration().configure().buildSessionFactory();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	}
