package file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
	int id;
	String student;
	
	public student(int id, String student) {
		this.id=id;
		this.student=student;
	}
}
public class serialization_concept {

	
public static void main(String[] args) throws IOException, ClassNotFoundException {
	student s = new student(80000, "Tops");
//	FileOutputStream fout = new FileOutputStream("Student.txt");
//	ObjectOutputStream o = new ObjectOutputStream(fout);
//	o.writeObject(s);
	FileInputStream fin = new FileInputStream("Student.txt");
	ObjectInputStream oj = new ObjectInputStream(fin);
	student Student = (student)oj.readObject();
	System.out.println(Student.id + Student.student);
}
}
