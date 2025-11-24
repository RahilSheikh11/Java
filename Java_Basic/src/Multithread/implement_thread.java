package Multithread;

public class implement_thread implements Runnable{
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}	
	
public static void main(String[] args) {
	


implement_thread i = new implement_thread();
Thread t= new Thread(i);
t.start();
}
}
