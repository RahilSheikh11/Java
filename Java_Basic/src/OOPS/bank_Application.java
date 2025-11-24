package OOPS;
import java.util.Scanner;
public class bank_Application {
private int  balance;
private String accountholdername;
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getAccountholdername() {
	return accountholdername;
}
public void setAccountholdername(String accountholdername) {
	this.accountholdername = accountholdername;
}

void deposit(int amount){
	balance += amount;
	System.out.println("The total balance is :: " + balance);
}
void withdrwal(int amount){
	balance -= amount;
	System.out.println("The withdrawl amount is :: " + amount);
	System.out.println("The balance remaining is :: " + balance);
}
void display(){
	System.out.println("The balance is :: " + balance);
}

}
