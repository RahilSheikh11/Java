package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hash_map {
public static void main(String[] args) {
	HashMap<Integer, String> hs = new HashMap<Integer, String>();
	hs.put(5, "Five");
	hs.put(1, "One");
	hs.put(3, "Three");
	hs.put(0, "Zero");
	hs.put(7, "Seven");
	
	for(Map.Entry<Integer, String> mapelement:hs.entrySet()) {
	System.out.println(mapelement.getKey() + "  " + mapelement.getValue());
}
for(Integer key : hs.keySet()) {
System.out.println(hs.get(key));	
}
for(String values : hs.values()) {
System.out.println(values);	
}

System.out.println(hs.keySet());

Scanner sc = new Scanner(System.in);
int key;
String value;

HashMap<Integer, String> m  = new HashMap<Integer, String>();
System.out.println("Please enter ID and value");
for(int i=0;i<3;i++) {
	key=sc.nextInt();
	value=sc.next();
	m.put(key, value);	
}
for(Map.Entry<Integer, String> mapelement:m.entrySet()) {
System.out.println(mapelement.getKey() + " " + mapelement.getValue());	
	
}
}

}
