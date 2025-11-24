package DSA;

import java.util.HashSet;
import java.util.Iterator;

public class sethash {
	int id;
	String name;
	
	public sethash(int id,String name) {
		this.id=id;
		this.name=name;
	}
public static void main(String[] args) {
	HashSet<sethash> sh = new HashSet<sethash>();
	sh.add(new sethash(200,"test"));
	sh.add(new sethash(202,"we"));
	sh.add(new sethash(206,"wewew"));
	sh.add(new sethash(202,"erer"));
	sh.add(new sethash(200,"rtt"));
	Iterator<sethash> i = sh.iterator();
	while(i.hasNext()) {
		sethash s = i.next();
		System.out.println(s.id+" "+s.name);
	}}
}