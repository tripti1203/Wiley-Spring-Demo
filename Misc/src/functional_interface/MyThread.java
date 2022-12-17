package functional_interface;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Run method of myThread class called!!");
	}

}
