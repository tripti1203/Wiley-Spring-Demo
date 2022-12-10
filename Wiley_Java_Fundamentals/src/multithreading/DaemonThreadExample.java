package multithreading;

import java.util.Iterator;

class Daemon implements Runnable{
	
	@Override
	public void run() {
		for(int i=0 ; i<5 ; i++) {
			System.out.println("Hello from Daemon");
		}
	}
}
public class DaemonThreadExample {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		Thread child = new Thread() {
			public void run() {
				System.out.println("Child Thread running...");
			}
		};
		
		//main cannot be set daemon it throws IllegalThreadStatEexception
		//main.setDaemon(true);
		child.setDaemon(true);
		System.out.println(main.isDaemon());
		System.out.println(child.isDaemon());
		
		Daemon t1 = new Daemon();
		Thread thread1 = new Thread(t1);
		thread1.setDaemon(true);
		System.out.println(thread1.isDaemon());
	}

}
