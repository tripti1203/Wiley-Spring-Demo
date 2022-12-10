package assignment1;

/*
 * Define an interface IAccount and declared the methods getBalance, deposit and withdraw. 
 * Create two concrete classes named as HDFCAccount and StateBankAccount that implements IAccount interface. 
 * There is difference between implementation of these classes, HDFCAccount uses member variables deposits and 
 * withdrawals for maintaining the balance, where as StateBankAccount uses only balance to maintain the balance. 
 * Test your application with creating objects of HDFCAccount and StateBankAccount.
 *  Don't forget to assigned them to the reference of the interface IAccount. 
 *  The methods transactOnAccount and printBalance only know about the interface IAccount and does not getting 
 *  impacted on which class's object is passed.
*/

interface IAccount{
	public void getBalance();
	public void deposit();
	public void withdraw();
}
class HDFCAccount implements IAccount{
	private double deposits;
	private double withdrawals;
	@Override
	public void getBalance() {
		double currBalance = this.deposits-this.withdrawals;
		System.out.println("Current Balance : " + currBalance);
	}

	@Override
	public void deposit() {
		System.out.println("Total deposits : " + this.deposits);
	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawal : " +  this.withdrawals);
	}
	
}
class StateBankAccount implements IAccount{
	
	private double balance;
	
	@Override
	public void getBalance() {
		System.out.println("Current Balance : " + balance);
	}

	@Override
	public void deposit() {
		
	}

	@Override
	public void withdraw() {
		
	}
	
}

public class InterfaceAssignment {

	public static void main(String[] args) {
		
	}

}
