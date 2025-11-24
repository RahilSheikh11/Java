package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.User;
import com.util.Dbconn;

public class Datadao {
	
	Transaction t;
	Session s;
	Dbconn db  = new Dbconn();

	
	
	public void insertdata(User user) {
		//insert query.
		s=db.gSession();
		t=s.beginTransaction();
		s.save(user);
		t.commit();
		s.close();	
	}
	
	public void updatdata(User user) {
		s=db.gSession();
		t=s.beginTransaction();
		s.update(user);
		t.commit();
		s.close();
	}
	
	public void deletedata(User user) {
		s=db.gSession();
		t=s.beginTransaction();
		s.delete(user);
		t.commit();
		s.close();
	}
	
	public User fetchdata(int id) {
		s=db.gSession();
		User u =(User) s.get(User.class, id);
		return  u;
	}
	
	public List<User> alldata(){
		s=db.gSession();
		List<User> list= s.createQuery("from User").list();
		
		return list;
		
		
	}
}
