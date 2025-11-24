package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class sorting_algo implements Comparable<sorting_algo>{
int id;
String name;
public sorting_algo(int id, String name) {
	this.id=id;
	this.name=name;
}
	@Override
	public int compareTo(sorting_algo o) {
//		if(id==o.id) {
//		return 0;
//	}else if(id>o.id) {
//		return 1;}
//	else {return -1;
//	}
		return Integer.compare(o.id,id);
		}
}
public class sorting {
public static void main(String[] args) {
	ArrayList<sorting_algo> al = new ArrayList<sorting_algo>();
	al.add(new sorting_algo(0,"tops0"));
	al.add(new sorting_algo(8,"tops8"));
	al.add(new sorting_algo(22,"tops22"));
	al.add(new sorting_algo(100,"tops36"));
	al.add(new sorting_algo(55,"tops55"));
	al.add(new sorting_algo(2,"tops98"));
	Collections.sort(al);
	Iterator<sorting_algo> i = al.iterator();
	while(i.hasNext()) {
	sorting_algo s = i.next();
	System.out.println(s.id + "  " +s.name);
	}
	}
}



