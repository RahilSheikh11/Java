package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dbconn {

	Session session;
	
	
	public Session gSession() {
	
		//Configuration is used to load the hibernate.cfg.xml file.
	Configuration con = new Configuration();
	
		//configure method is used to load the configuration file.
	con.configure();
	
		//Session factory is used to create session object.
	SessionFactory sf = con.buildSessionFactory();
	
	//Open session method is used to create session object.
	session=sf.openSession();	
		return session;}


}
