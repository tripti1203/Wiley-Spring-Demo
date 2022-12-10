package multithreading;

/*Throws declaration doesn't work with override methods*/

class SecondThread extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<50 ; i++) {
			System.out.println("New Thread Running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void display() {
		System.out.println("Displaying....");
	}
}

public class CreatingThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		SecondThread secondThread = new SecondThread();
		secondThread.start();
		secondThread.display();
		for(int i=0 ; i<50 ; i++) {
			System.out.println("Main Thread Running");
			Thread.sleep(1000);
		}
	}

}
