package DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
int id;
String name;
	 arraylist(int id, String name)
	{
this.id=id;
this.name=name;
}
	
public static void main(String[] args) {
	ArrayList<arraylist> al = new ArrayList<arraylist>();
	al.add(new arraylist(0, "Rahi"));
	al.add(new arraylist(1, "Rahil"));
	al.add(new arraylist(2, "Rahil1"));
	al.add(new arraylist(3, "Rahil12"));
	Iterator<arraylist> i = al.iterator();
	while(i.hasNext()) {
		arraylist a = i.next();
		System.out.println(a.id + "  " + a.name);
	}
}
}
