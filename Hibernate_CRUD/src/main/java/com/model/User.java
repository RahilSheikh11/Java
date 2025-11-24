package com.model;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// POJO class - Plain old java object
//POJO class is a simple java class that contains only fields and getter setter
//It is used to represent a table in the database
//It is also known as entity class
//It is also used to transfer data between applications.
//@entity annotation is used to specify that the class is an entity

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String username;
	@Column
	private String email;
	@Column
	private String password;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
	
	}

}
