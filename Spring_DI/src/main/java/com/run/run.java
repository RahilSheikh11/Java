package com.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.phone.phone;

public class run {
	
	
	
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
	phone p =(phone) context.getBean("phone");
	System.out.println(p.getPhone() + " " + p.getPhone_model() + " " + p.getPhone_type() + " " + p.getPhone_year());
	p.show_person();
}
}
