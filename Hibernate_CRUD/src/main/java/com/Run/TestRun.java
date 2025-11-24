package com.Run;

import com.dao.Datadao;
import com.model.User;

public class TestRun {

	public TestRun() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String[] args) {
	User u = new User();
	u.setId(1);
	u.setEmail("Testupdate@gmail.com");
	u.setPassword("54dsds");
	u.setUsername("Rahilupdated");

	Datadao dao = new Datadao();
	//dao.deletedata(u);
	dao.alldata().forEach(i->{System.out.println(i.getEmail()+ " "+ i.getUsername()+" "+i.getPassword()+" "+i.getUsername());
	});
	//System.out.println(u.getEmail()+" "+u.getId()+" "+u.getPassword()+" "+u.getUsername());
	

}
}
