package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class dbutil {
Session session;

public Session gSession() {

	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory sf = cfg.buildSessionFactory();
	session=sf.openSession();
	
	return session;
}
}
