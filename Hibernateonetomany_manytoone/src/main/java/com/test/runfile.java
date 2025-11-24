package com.test;

import java.util.ArrayList;

import com.dao.datadao;
import com.model.Department;
import com.model.Employee;

public class runfile {

	
	public static void main(String[] args) {
		Department dept = new Department();
		datadao dao = new datadao();
		
		dept.setDep_name("IT");
		
		Employee emp = new Employee();
		
		emp.setEmp_name("Rahil");
		emp.setEmp_sal(45000.05);
		emp.setDepartment(dept);
		
		Employee emp1 = new Employee();
		emp1.setEmp_name("Ravi");
		emp1.setEmp_sal(60000.06);
		emp1.setDepartment(dept);
		Employee emp3 = new Employee();
		emp3.setEmp_name("Dev");
		emp3.setEmp_sal(90999.06);
		emp3.setDepartment(dept);
		Employee emp4 = new Employee();
		emp4.setEmp_name("Dhruv");
		emp4.setEmp_sal(50000.05);
		emp4.setDepartment(dept);
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(emp);
		al.add(emp1);
		al.add(emp3);
		al.add(emp4);
		
		
		dept.setAm(al);
		dao.save_dept(dept);
		System.out.println("data saved");
	}
}
