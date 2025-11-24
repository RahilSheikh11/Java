package DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class collection_framework {
void collections() {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(112);
	al.add(123);
	al.add(124);
	al.add(125);
	al.add(126);
	al.add(172);
	al.add(192);
	al.add(122);
	al.add(132);
	al.add(112);
	al.add(112);
	al.add(162);
	
	al.remove(1);
	
	Iterator<Integer> i = al.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
	public static void main(String[] args) {
	collection_framework cf = new collection_framework();	
	cf.collections();
	}
}
