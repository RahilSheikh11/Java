package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employese")
public class Employee {
	@Id
	@GeneratedValue
private int emp_id;
	@Column
private String emp_name;
	@Column
private Double emp_sal;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dept_id")
private Department department;
public int getEmp_id() {
	return emp_id;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public Double getEmp_sal() {
	return emp_sal;
}
public void setEmp_sal(Double emp_sal) {
	this.emp_sal = emp_sal;
}

}
