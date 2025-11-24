package OOPS;
class Illegalargument extends Exception{

	public Illegalargument(String string) {
		super(string);}}
public class task_exception {

	void validateAge(int age) throws Illegalargument {
		if(age <= 18 || age >= 60 ) {
			throw new Illegalargument("Need age more 18 or Less than 60");
		}else{
			System.out.println("okay");	
		}
	}
public static void main(String[] args) throws Illegalargument {
	task_exception t = new task_exception();
	t.validateAge(60);
}
}
