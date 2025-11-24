package DSA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalDate;

public class student_switch {
int id;
String name;
double salary;
LocalDate joiningDate;
student_switch(int id, String name, double salary, LocalDate joiningDate){
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.joiningDate=joiningDate;
	
}

	public static void main(String[] args) {
	ArrayList<student_switch> al = new ArrayList<student_switch>();
	
	Scanner sc = new Scanner(System.in);
	
	int choice=0;
	do {
		//sc.nextLine();
		System.out.println();
	System.out.println("Please select the choice");
	System.out.println("1: Add the data");
	System.out.println("2: display the data");
	System.out.println("3: to search the persn by ID");
	System.out.println("4: Removing the data");
	System.out.println("5: Exit");
	System.out.println("6: Let me show you the most money wasted in the organization");
	System.out.println("Enter the choice");
 choice = sc.nextInt();
	
	switch (choice) {
	case 1:
		System.out.println("Enter the number of Student data");
		int number=sc.nextInt();
		System.out.println("Enter ID, Name and Salary of the student");
		
		for(int i=0;i<number;i++)
		{
		int id=sc.nextInt();
		String name=sc.next();
		double salary = sc.nextDouble();
		LocalDate joiningDate = LocalDate.parse(sc.next());
		al.add(new student_switch( id,name,salary,joiningDate));
		
		}
		break;
		
	case 2: 
		for(student_switch s:al) {
			System.out.println(s.id + " " + s.name + " " + s.salary + " " + s.joiningDate);
		}
	break;
	case 5:
		System.out.println("Thnk you for your ..........");
		System.exit(0);
		break;

		
	case 3: 
		System.out.println("Enter the ID to search :: ");
		int search_id = sc.nextInt();
		boolean found=false;
		for(student_switch s:al) {
			if(s.id==search_id) {
				System.out.println("name is :"+s.name + " Joining Date is " + s.joiningDate + " Salary is"+ s.salary);
			}
		}
		break;
	case 4 :
		System.out.println("Please enter the ID to remove");
		Iterator<student_switch> i = al.iterator();
		int remover = sc.nextInt();
		if(i.hasNext()) {
			student_switch s= i.next();
			if(s.id == remover) {
				i.remove();
				System.out.println("The id has been removed" + s.name + s.id);
				break;
			}
			}
		break;
	case 6:
		double max=0;
		String maxsalempname="";
		for(student_switch s:al) {
		if(max<s.salary) {
			max=s.salary;
			maxsalempname=s.name;
		}	
		System.out.println(maxsalempname+" has the highest salary" +" " + max);
		break;
		}
		
	break;
	}
	}
	while(choice!=6);
	}
}
