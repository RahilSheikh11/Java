package Multithread;

public class start_thread extends Thread{
	public void run() {
		for(int i = 0;i<=10;i++) {
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
		start_thread s = new start_thread();
		s.run();
	}
}