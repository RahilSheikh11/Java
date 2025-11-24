package OOPS;

class InvalidAgeException extends user {

	public InvalidAgeException(String string) {
		super(string);
	}

}
public class custom{
	int i = -11;
	void display() throws InvalidAgeException {
		if(i>0) {
			System.out.println("Successful");
		}else {
		throw new InvalidAgeException("Failed");
		}	
	}
public static void main(String[] args) throws InvalidAgeException {
	new custom().display();
}	
}
