package file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_making {

	public file_making() throws IOException {
		/*
		 * FileWriter fout= new FileWriter("Test12.txt"); String s =
		 * "This is th example!!"; fout.write(s); fout.close();
		 */
		
		char c[]=new char[20];
		int i;
		FileReader fin = new FileReader("Test12.txt");
		fin.read(c);
		System.out.println(c);
		fin.close();
		
	}
public static void main(String[] args) throws IOException {
	file_making f= new file_making();
	
}
}
