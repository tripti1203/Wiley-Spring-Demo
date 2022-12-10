package multithreading;

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<50 ; i++) {
			System.out.println("Thread1 is running....");
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<50 ; i++) {
			System.out.println("Thread2 is running....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadAssesment {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
		for(int i=0 ; i<50 ; i++) {
			System.out.println("Main Thread is running...");
			Thread.sleep(500);
		}
		
	}

}
