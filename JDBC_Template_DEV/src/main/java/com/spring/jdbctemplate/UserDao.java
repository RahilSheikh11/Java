package com.spring.jdbctemplate;

import java.util.List;

public interface UserDao {

	void register (User user);
	
	List<User> getallusers();
	
	public User getUserById(int id);
	
	public void updateuser(User user);
	
	public void deleteuser(int id);
}
