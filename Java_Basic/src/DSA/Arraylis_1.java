package DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylis_1 {

	public Arraylis_1() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(65);
		al.add(45);
		al.add(89);
		al.add(78);
		al.add(55);
//		for(Integer i:al) {
//			System.out.println(i);
//			
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		}
	
public static void main(String[] args) {
	Arraylis_1 l = new Arraylis_1();
	}
}
