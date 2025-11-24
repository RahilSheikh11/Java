package OOPS;
import java.util.Scanner;
public class encapsulation_display {

	
public static void main(String[] args) {
	

	encapsulation e=new encapsulation();
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter ID  ");
	 int ID= scn.nextInt();
	 e.setID(ID);
	System.out.println(e.getID());
	
	
}
}
