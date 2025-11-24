package OOPS;

public class factorial {
	public factorial()
	{	
		int fact=1;
		int i=1;
	while(i<=10) {
		fact=fact*i;
		i++;
	}	
	System.out.println(fact);
	}
public static void main(String[] args) {
	factorial f=new factorial();
}
}
