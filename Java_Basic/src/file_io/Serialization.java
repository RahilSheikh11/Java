package file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
int id;
String name;
public Student(int id, String name) {
this.id=id;
this.name=name;
}
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * Student s =new Student(1,"Uncle Sam"); FileOutputStream fout = new
		 * FileOutputStream("Test1234.txt"); ObjectOutputStream o = new
		 * ObjectOutputStream(fout); o.writeObject(s);
		 */
		
		FileInputStream fin = new FileInputStream("Test1234.txt");
		ObjectInputStream oj = new ObjectInputStream(fin); 

 st = (Student) oj.readObject();
		
		System.out.println(st.id + "  " + st.name);
	}
}
