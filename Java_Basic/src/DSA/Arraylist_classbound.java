package DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_classbound {
int id;
String name;
	public Arraylist_classbound(int id, String name) {
	this.id=id;
	this.name=name;
	}
public static void main(String[] args) {
	Arraylist_classbound a1 = new Arraylist_classbound(1, "Top no chokro 1");
	Arraylist_classbound a2 = new Arraylist_classbound(2, "Top no chokro 2");
	Arraylist_classbound a3 = new Arraylist_classbound(3, "Top no chokro 3");
	Arraylist_classbound a4 = new Arraylist_classbound(4, "Top no chokro 4");
	
	ArrayList<Arraylist_classbound> al= new ArrayList<Arraylist_classbound>();
	al.add(a1);
	al.add(a2);
	al.add(a3);
	al.add(a4);
	Iterator<Arraylist_classbound> it= al.iterator();
	while(it.hasNext()) {
		Arraylist_classbound cb = it.next();
		System.out.println(cb.id + " " + cb.name);
	}
	
}
}
