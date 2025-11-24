package com.spring.jdbctemplate;

import java.util.List;

public interface UserService {

	//Inserting new Users
	void register(User user);
	//Displaying all the Data 
	List<User> getallusers();
	//Displaying users by ID
	public User getUserById(int id);
	//Updating users
	public void updateuser(User user);
}
