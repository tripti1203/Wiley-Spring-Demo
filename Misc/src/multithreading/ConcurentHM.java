package multithreading;
import java.util.*;
import java.util.concurrent.*;

//Main class extending Thread class
class ConcurentHM extends Thread {

 // Creating static concurrentHashMap object
 static ConcurrentHashMap<Integer, String> m
     = new ConcurrentHashMap<Integer, String>();

 // Method 1
 // run() method for the thread
 public void run()
 {

     // Try block to check for exceptions
     try {

         // Making thread to sleep for 2 seconds
         Thread.sleep(2000);
     }

     // Catch block to handle the exceptions
     catch (InterruptedException e) {
     }

     // Display message
     System.out.println("Child Thread updating Map");

     // Inserting element
     m.put(103, "C");
 }

 // Method 2
 // Main driver method
 public static void main(String arg[])
     throws InterruptedException
 {

     // Adding elements to object created of Map
     m.put(101, "A");
     m.put(102, "B");

     // Creating thread inside main() method
     ConcurentHM t = new ConcurentHM();

     // Starting thread
     t.start();

     // Creating object of Set class
     Set<Integer> s1 = m.keySet();

     // Creating iterator for traversal
     Iterator<Integer> itr = s1.iterator();

     // Condition holds true till there is single element
     // in Set object
     while (itr.hasNext()) {

         // Iterating over elements
         // using next() method
         Integer I1 = itr.next();

         // Display message
         System.out.println(
             "Main Thread Iterating Map and Current Entry is:"
             + I1 + "..." + m.get(I1));

         // Making thread to sleep for 3 seconds
         Thread.sleep(3000);
     }

     // Display elements of map objects
     System.out.println(m);
 }
}