package OOPS;
class Invalidexception extends user{

	public Invalidexception(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}
	
}
public class thdrawl_Exception {
int withdrawl_amount=60000;
int deposit = 500;
	public thdrawl_Exception() throws Invalidexception {
		if(withdrawl_amount < deposit) {
			System.out.println("Thank you for choosing us");
		}else {
			throw new Invalidexception("Insufficient Balance");
		}
	}
public static void main(String[] args) throws Invalidexception {
	thdrawl_Exception e = new thdrawl_Exception();
}
}
