package Modifier;

public class Static_modifier {

	static int a=10;
	
	static void display() {
		System.out.println("Static method is here");
	}
	static {
		System.out.println("Static block is here");
	}
	
public static void main(String[] args) {
	display();
	System.out.println(a);
}
}
