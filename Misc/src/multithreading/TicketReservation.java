package multithreading;

/*Problem Statement : Design a ticket reservation system such that one user at a time can book a ticket till their is not ticket left */

class Booking{
	 int ticket=5;
	 public void bookTicket(int userId) {
		 synchronized(this) {
			 if(ticket > 0) {
				 ticket--;
			 	 System.out.println("Current Thread Running : "+Thread.currentThread().getName());
			 	 System.out.println("Ticket booked for customer -->" + userId);
			 	 System.out.println();
			 }
		 }
		 try {
			Thread.sleep(1000);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
		 
	}
}

class User extends Thread{
	Booking book;
	int userId;
	User(Booking book, int userId){
		this.book=book;
		this.userId = userId;
	}
	@Override
	public void run() {
		for(int i=0 ; i<5; i++) {
			book.bookTicket(userId);
		}
	}
}


public class TicketReservation {

	public static void main(String[] args) {
		 Booking p = new Booking();
		 User user1 = new User(p,101);
		 User user2 = new User(p,102);
		 User user3 = new User(p,103);
		 // create threads
	     Thread t1 = new Thread(user1);
		 Thread t2 = new Thread(user2);
		 Thread t3 = new Thread(user3);
		 // start threads
		 t1.start();
		 t2.start();
		 t3.start();
	}

}
