package OOPS;

import java.util.Scanner;

public class Userdefined_value {

	int i;
	 public Userdefined_value(int i) {
		 this.i=i;
			System.out.println(i);
	}
	 
	 public Userdefined_value(int a,String b) {
		 System.out.println(a+"  "+b);
	 }
	public Userdefined_value(int c,double g) {
		System.out.println(c+"  "+g);
	}
	public Userdefined_value(Userdefined_value u) {
		
		// TODO Auto-generated constructor stub
		System.out.println("copy construtor"+u.i);
	}
	
	
	 public static void main(String[] args) {
		 System.out.println("Please enter the value of i ");
			Scanner scn=new Scanner(System.in);
			int i = scn.nextInt();
		 Userdefined_value ud=new Userdefined_value(i);
		
		 System.out.println("Please enter the value of a ");
			int a = scn.nextInt();
			System.out.println("Please enter the value of String ");
			String b = scn.next();
		Userdefined_value ud1=new Userdefined_value(a, b);
		
		System.out.println("Please enter the value of c ");
		int c = scn.nextInt();
		System.out.println("Please enter the value of d ");
		double g = scn.nextDouble();
		Userdefined_value ud2=new Userdefined_value(c, g);
		
		//call  copy con..
		Userdefined_value udc=new Userdefined_value(ud);
		
		
		
	}
	}

