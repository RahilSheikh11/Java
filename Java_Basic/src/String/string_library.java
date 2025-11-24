package String;

public class string_library {

	
public static void main(String[] args) {
	String str = "Tops";
	String str1 = "Tops";
	
	System.out.println(str.toUpperCase());
	System.out.println(str.trim());
	System.out.println(str.equals(str1));
	System.out.println(str.contains("p"));
	System.out.println(str.indexOf(2));
	System.out.println(str.replace('s' , 't'));
	String str2  = "Mr Sheikh@tops.com";
	int index=(str2.indexOf('@'));
	System.out.println("Welcome! " + str2.substring(0,index));
	
}}