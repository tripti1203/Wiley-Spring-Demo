package multithreading;

/*Problem Statement : Let’s create a simple multi-threaded program where every thread increments the shared count variable 4 times.
  So if there are two threads, after they finish count value should be 8. JavaAtomic.java*/

import java.util.concurrent.atomic.AtomicInteger;

//It gives 5,6,7,8 as an output due to inconsistency
/*class ProcessingThread implements Runnable {
    private int count;

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            count++;
        }
    }

    public int getCount() {
        return this.count;
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}*/

//Using atomicInteger it gives the expected value
class ProcessingThread implements Runnable {
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            count.incrementAndGet();
        }
    }

    public int getCount() {
        return this.count.get();
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class Atomic {
	 public static void main(String[] args) throws InterruptedException {

	        ProcessingThread pt = new ProcessingThread();
	        Thread t1 = new Thread(pt, "t1");
	        t1.start();
	        Thread t2 = new Thread(pt, "t2");
	        t2.start();
	        t1.join();
	        t2.join();
	        System.out.println("Processing count=" + pt.getCount());
	 }
}
