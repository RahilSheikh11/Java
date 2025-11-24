package OOPS;
 class inheritance_123{
inheritance_123(){
	System.out.println("inheritance 123 is here");
}	
void child123() {
	System.out.println("Child class here");
}
void child_234() {
	System.out.println("child 234 here");
}
}
public class inheritance extends inheritance_123 {
inheritance(){
	System.out.println("Here is the constructor");
}
void child() {
	super.child123();
	System.out.println("Here is the child method");
}
void child1() {
	super.child_234();
	System.out.println("Child 2 method ");
}

public static void main(String[] args) {
inheritance i = new inheritance();
i.child();
}
}
