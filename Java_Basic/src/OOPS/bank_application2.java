package OOPS;
import java.util.Scanner;
public class bank_application2 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	bank_Application b = new bank_Application();
	System.out.println("Enter the amount to Deposit");
	int amount = scn.nextInt();
	b.deposit(amount);
	System.out.println("Enter the amount withdrawal");
	int wamount = scn.nextInt();
	b.withdrwal(wamount);
	b.display();
	}
}
