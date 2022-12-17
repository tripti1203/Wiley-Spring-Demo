package functional_interface;

public class RecordApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Records record = new Records() {

			@Override
			public void displayRecords(int x, int y) {
				System.out.println(x+y);
			}
			
		};
		record.displayRecords(10,20);
		
		//using lambda expression
		Records record2=(x,y)->System.out.println(x+y);
		record2.displayRecords(20,20);
		
		record2.displayDetails();
	}

}
