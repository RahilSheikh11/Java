package Multithread;

public class multithreading extends Thread {
int num;

public multithreading(int num) {
	this.num=num;
}
public void run() {
	System.out.println("Task " + num + " is worked up by " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Task " + num + " is finished by " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
}
public static void main(String[] args) {
	multithreading m = new multithreading(1);
	multithreading m1 = new multithreading(2);
	multithreading m2 = new multithreading(3);
	m.start();
	m1.start();
	m2.start();
	try {
		m.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		m2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
