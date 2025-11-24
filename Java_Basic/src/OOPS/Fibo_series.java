package OOPS;

public class Fibo_series 
{

	public Fibo_series(int num)
{
		
		int a=0;
		int b=1;
		int i=0;
		while(i<=num) 
		{
		int c=a+b;
		System.out.println(c);
		b=a;
		a=c;
		i++;
		}
}
public static void main(String[] args) {
	Fibo_series f=new Fibo_series(10);
}		 
}
