package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task_hashmap {
public static void main(String[] args) {
	
	int marks;
	String Student;
	
	HashMap<Integer, String> h = new HashMap<Integer, String>();
	int size;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the size of the data");
	size = sc.nextInt();
	System.out.println("Please enter the key value pair");
	for(int i=0; i<size;i++) {
	marks=sc.nextInt();
	Student=sc.next();
	h.put(marks, Student);
	}
	for(Map.Entry<Integer, String> mapelement: h.entrySet()) {
		System.out.println(mapelement.getKey() + "::::" +mapelement.getValue());	
	}
	System.out.println("Please enter the name of student to update the marks");
	String name=sc.next();
	int up_marks=sc.nextInt();
	if(h.containsValue(name)) {
		h.put(up_marks, name);
	}
System.out.println("updated map:"+h);	
}
}

