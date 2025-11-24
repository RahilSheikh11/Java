package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class admin implements Comparable<admin> {
int roll_number;
String name;
int marks;

public admin(int marks, String name,int roll_number){
this.marks=marks;
this.name=name;
this.roll_number=roll_number;
}

	@Override
	public int compareTo(admin o) {
		
		return Integer.compare(o.marks, marks);
	}
	
}
public class taskcomparable {
public static void main(String[] args) {
	ArrayList<admin> a = new ArrayList<admin>();
	a.add(new admin(50, "Darshak", 02));
	a.add(new admin(35, "Dev", 06));
	a.add(new admin(62, "Ravi", 05));
	a.add(new admin(46, "Dhruv", 03));
	a.add(new admin(33, "Dhrumil", 01));
	Collections.sort(a);
	Iterator<admin> i = a.iterator();
	while(i.hasNext()) {
	admin a1=i.next();
	System.out.println(a1.roll_number + "  " + a1.name + "  " + a1.marks);
	}
}
}
