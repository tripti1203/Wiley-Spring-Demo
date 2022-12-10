package multithreading;

class FirstThread extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<50 ; i++) {
			System.out.println("New Thread Running");
		}
	}
}
public class CreatingThreadExample {

	public static void main(String[] args) {
		FirstThread firstThread = new FirstThread();
		firstThread.start();
		for(int i=0 ; i<50 ; i++) {
			System.out.println("Main Thread Running");
		}
	}

}
