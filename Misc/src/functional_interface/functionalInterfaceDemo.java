package functional_interface;

public class functionalInterfaceDemo {

	public static void main(String[] args) {
		
		//Traditional Approach
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		t1.start();
		
		Thread t2 = new Thread(new MyThread());
		t2.start();
		
		//Anonymous Inner Class
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("In run method of anonymous inner class!!");
			}
			
		};
		Thread t3 = new Thread(r1);
		t3.start();
		
		//Anonymous method with argument in inner class
		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("In run method of argument inner class!!");
			}
			
		});
		t4.start();
	}

}
