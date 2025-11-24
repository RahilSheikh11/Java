package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "departments")
public class Department {
	@Id
	@GeneratedValue
	private int dept_id;
	@Column
	private String dep_name;
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	private List<Employee> emp;

	
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public List<Employee> getAm() {
		return emp;
	}
	public void setAm(List<Employee> emp) {
		this.emp = emp;
	}
	}
