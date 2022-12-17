package functional_interface;

@FunctionalInterface
public interface Records {
	public void displayRecords(int x , int y);
	public default void displayDetails() {
		System.out.println("Default method inside functional interface!!!");
	}
}
