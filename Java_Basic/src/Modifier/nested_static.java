package Modifier;
class nested{
	void display() {
		System.out.println("Parents class here");
	}
	
	static class nested_child{
		static void display1() {
			System.out.println("Nested class ");
		}
	}
}
public class nested_static {

public static void main(String[] args) {
	nested n = new nested();
	n.display();
	nested.nested_child nc = new nested.nested_child();
	nc.display1();
}
}
