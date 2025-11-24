package file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class inoutfileio {

	public inoutfileio() throws IOException {
		FileOutputStream fout = new FileOutputStream("Test.txt");
		String s ="Welcome to the wonderland of coding!";
		byte b[]=s.getBytes();
		fout.write(b);
		
		FileInputStream fin = new FileInputStream("Test.txt");
		int i = 0;
		while((i=fin.read())!=-1) {
			System.out.print((char)i);
		}
	}
public static void main(String[] args) throws IOException {
new inoutfileio();	
}
}
