package multithreading;

class ThreadA extends Thread{
	@Override
	public void run() {
		System.out.println("Thread A is running..");
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.println("Thread A : " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread A is completed..");
	}
}
class ThreadB extends Thread{
	@Override
	public void run() {
		System.out.println("Thread B is running..");
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.println("Thread B : " + i);
		}
		System.out.println("Thread B is completed..");
	}
}

public class ThreadLifeCycleExample {

	public static void main(String[] args) {
		System.out.println("Main method starts..");
		
		//Threads are in new state
		ThreadA tA = new ThreadA();
		Thread tB = new ThreadB();
		
		//Thread A is in running state
		tA.start();
		
		tA.yield();
		
		try {
			tA.sleep(1000);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		//Thread B is in running state
		tB.start();
		
		System.out.println("Main methods ended...");
	}

}
