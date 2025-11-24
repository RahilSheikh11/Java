package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Department;
import com.util.dbutil;

public class datadao {
	dbutil db = new dbutil();
	Session session;
	Transaction tr;
	public void save_dept(Department dept) {
		session=db.gSession();
		tr=session.beginTransaction();
		session.save(dept);
		tr.commit();
		session.close();
		
		


	}
}
