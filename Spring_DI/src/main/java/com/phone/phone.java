package com.phone;

import com.person.person;

public class phone {
private String phone;
private String phone_model;
private String phone_type;
private int phone_year;
private person Person;

public person getPerson() {
	return Person;
}
public void setPerson(person person) {
	Person = person;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPhone_model() {
	return phone_model;
}
public void setPhone_model(String phone_model) {
	this.phone_model = phone_model;
}
public String getPhone_type() {
	return phone_type;
}
public void setPhone_type(String phone_type) {
	this.phone_type = phone_type;
}
public int getPhone_year() {
	return phone_year;
}
public void setPhone_year(int phone_year) {
	this.phone_year = phone_year;
}

public void show_person() {
	System.out.println("Person Details");
	System.out.println("Person Age :: " + Person.getPerson_age());
	System.out.println("Person Age :: " + Person.getPerson_name());
}
}
