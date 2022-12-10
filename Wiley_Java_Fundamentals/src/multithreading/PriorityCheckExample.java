package multithreading;
class ThreadAA extends Thread{
	@Override
	public void run() {
		System.out.println("Thread AA is running..");
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.println("Thread AA : " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread AA is completed..");
	}
}
class ThreadBB extends Thread{
	@Override
	public void run() {
		System.out.println("Thread BB is running..");
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.println("Thread BB : " + i);
		}
		System.out.println("Thread BB is completed..");
	}
}
public class PriorityCheckExample {

	public static void main(String[] args) {
		System.out.println("Main method starts..");
		
		//Threads are in new state
		ThreadAA tAA = new ThreadAA();
		ThreadBB tBB = new ThreadBB();
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		tAA.setPriority(Thread.MIN_PRIORITY);
		tBB.setPriority(Thread.MAX_PRIORITY);
		
		
		//Thread AA is in running state
		tAA.start();
		
		tAA.yield();
		
		/*try {
			tAA.sleep(1000);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}*/
		
		//Thread BB is in running state
		tBB.start();
		
		System.out.println("Main methods ended...");
	}

}
