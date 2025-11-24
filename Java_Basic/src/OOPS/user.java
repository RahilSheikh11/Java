package OOPS;
class invalid_age extends Exception{

	public invalid_age(String string) {
		super(string);
	}
	
}
public class user{
	int age = 00;
	String email = "cpandiy@gmail.com";
	String name = "Rahil";
	public user() {
	}
	
	void register() throws invalid_age {
		if(age>18) {
			System.out.println("The name is :: " + name + " The Age is :: " + age + " The email is :: " + email);
		}else {
			throw new invalid_age ("The required age is 18");
		}
	}
public static void main(String[] args) throws invalid_age {
	user u = new user();
	u.register();
}
}