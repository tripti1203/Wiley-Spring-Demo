package multithreading;

class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println("MyThread is running...");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadWithRunnableInterfaceExample {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		Thread thread1 = new Thread(t1);
		thread1.start();
		for(int i=0 ; i<10 ; i++) {
			System.out.println("MainThread Runing...");
			Thread.sleep(500);
		}
	}

}
