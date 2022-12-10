package assignment1;
/*
 *Define a concrete class named as Vehicle with start and stop methods that defines the default functionality of any vehicle. 
 *Inherit Vehicle class into further subclass named as TwoWheeler and FourWheeler and override start and stop methods to 
 *redefine their functionality. Invoke all the methods from their respective class and test the program. 
 **/

class Vehicle{
	public void stop() {
		System.out.println("Vehicles stops..");
	}
	public void start() {
		System.out.println("Vehicles starts..");
	}
}

class  TwoWheeler extends Vehicle{
	@Override
	public void stop() {
		System.out.println("TwoWheeler stops..");
	}
	@Override
	public void start() {
		System.out.println("TwoWheeler starts..");
	}
}

class FourWheeler extends Vehicle{
	@Override
	public void stop() {
		System.out.println("FourWheeler stops..");
	}
	@Override
	public void start() {
		System.out.println("FourWheeler starts..");
	}
}

public class InheritanceAssignments {

	public static void main(String[] args) {
		
		FourWheeler four = new FourWheeler();
		four.start();
		four.stop();
		System.out.println("--------------------");
		
		TwoWheeler two = new TwoWheeler();
		two.start();
		two.stop();
		System.out.println("--------------------");
		
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		vehicle.stop();
	}

}
