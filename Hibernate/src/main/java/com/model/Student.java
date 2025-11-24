package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "student_details")
public class Student {

	@Id
	private int rollno;
	@Column
	private String std_name;
	@Column
	private String std_email;
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	//Fetch type is eager so that it will fetch the subject details when student details are fetched.
	//If it is lazy then it will not fetch the subject details when student details are fetched.
	//Cascade type is all so that it will perform all operations on subject when student is performed.
	
	@JoinColumn(name="sub_id")
	//Join column is used to specify the foreign key column 
	private Subject subject;
	
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_email() {
		return std_email;
	}
	public void setStd_email(String std_email) {
		this.std_email = std_email;
	}
	
	

}
