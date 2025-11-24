package com.test;

import com.dao.Datadao;
import com.model.Student;
import com.model.Subject;

public class runfile {

	
	public static void main(String[] args) {
	Subject s =new Subject();
	s.setSub_name("Maths");
	s.setSub_id(15);
	
	Student st = new Student();
	st.setRollno(34);
	st.setStd_name("College passout");
	st.setSubject(s);
	
	Datadao dao = new Datadao();
	dao.savedata(st);
	}
}
