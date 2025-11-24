package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dbutil.dbutil;
import com.model.Student;

public class Datadao {
dbutil db = new dbutil();
Transaction tr;
Session session;

public void savedata(Student s) {
	session=db.gSession();
	tr=session.beginTransaction();
	session.save(s);
	tr.commit();
}
}
