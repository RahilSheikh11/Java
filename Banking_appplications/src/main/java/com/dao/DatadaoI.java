package com.dao;

import java.util.List;

import com.model.User;

public interface DatadaoI {
	
public String Inserrtdata(User user); 
List<User> showalldata();

//Get all data by edit
public User getId(int id);

//Updating the data
public String update(User u);

//Deleting the data
public String delete_data(int id);

//Login 
public String login(String username,String password);

//getting image by id
public byte[] getimagebyid(int id);
}
