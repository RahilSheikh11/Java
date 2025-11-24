package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class admin {
	
	int id;
	String name;
	
	public admin(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
}

class idchoice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		admin a1= (admin)o1;
		admin a2= (admin)o2;
		
		if(a1.id==a2.id) {
		return 0;
		}else if(a1.id>a2.id){
			return 1;
		}
		else 
		{
			return -1;
		}
		
		}
	}

class namechoice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		admin a1 =(admin)o1;
		admin a2 =(admin)o2;
		
		
		return a1.name.compareTo(a2.name);
	}
	
	
}
public class compareto {
public static void main(String[] args) {
	ArrayList<admin> al= new ArrayList();
	al.add(new admin(1,"z"));
	al.add(new admin(4,"c"));
	al.add(new admin(10,"z"));
	al.add(new admin(6,"a"));
	al.add(new admin(3,"a"));
	al.add(new admin(25,"g"));
	al.add(new admin(66,"f"));
	Collections.sort(al,new idchoice());
	Iterator<admin> i = al.iterator();
	while(i.hasNext()) {
		admin a = i.next();
		System.out.println(a.id + "  " + a.name);
		}
	System.out.println("String comparison");
	Collections.sort(al, new namechoice());
	Iterator<admin> name_it = al.iterator();
	while(name_it.hasNext()) {
		admin a = name_it.next();
		System.out.println(a.id + "  " + a.name);
		}
	
	
}
}