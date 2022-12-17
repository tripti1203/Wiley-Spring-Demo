package multithreading;
import java.lang.*;
import java.util.concurrent.atomic.DoubleAdder;
  
public class DoubleAdderExample {
    public static void main(String args[])
    {
        DoubleAdder num = new DoubleAdder();
  
        // add operation on num
        num.add(42);
        num.add(10);
        num.add(10);
  
        // Print after add operation
        System.out.println(" the current value is: " + num);
    }
}