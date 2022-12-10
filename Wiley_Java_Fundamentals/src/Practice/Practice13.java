package Practice;
//overriding abstract class

abstract class Account{
	protected int accountNumber;
	protected String accountName;
	
	Account(int accountNumber , String accountName){
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	abstract void display(); 
}
class Deposit extends Account{
	private String openingDate;
	private String maturityDate;
	private int balance;
	
	Deposit(int accountNumber , String accountName , String openingDate , String maturityDate , int balance){
		super(accountNumber,accountName);
		this.openingDate = openingDate;
		this.maturityDate = maturityDate;
		this.balance = balance;
	}
	@Override
	void display() {
		System.out.println("Account Holder Name : " + this.accountName);
		System.out.println("Account Number : " + this.accountNumber);
		System.out.println("Account Opening Date : " + this.openingDate);
		System.out.println("Account Maturity Date : " + this.maturityDate);
		System.out.println("Balance : " + this.balance);
	}
}
class ShortTerm extends Deposit{
	private int months;
	ShortTerm(int accountNumber , String accountName , String openingDate , String maturityDate , int balance,int months){
		super(accountNumber,accountName,openingDate,maturityDate,balance);
		this.months = months;
	}
	@Override
	void display() {
		super.display();
		System.out.println("No. of months: " + this.months);
	}
}
class LongTerm extends ShortTerm{
	private int years;
	LongTerm(int accountNumber , String accountName , String openingDate , String maturityDate , int balance,int months, int years){
		super(accountNumber,accountName,openingDate,maturityDate,balance,months);
		this.years = years;
	}
	@Override
	void display() {
		super.display();
		System.out.println("No. of years: " + this.years);
	}
}
public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposit save = new Deposit(123456789,"Tripti","27 October","04 Febuary",50000 );
		save.display();
		
		System.out.println("-----------------");
		
		ShortTerm st = new ShortTerm(12368853,"Vikram","13 Febuary","30 November",55000,12);
		st.display();
		
		System.out.println("-----------------");
		
		LongTerm lt = new LongTerm(987235437,"Kajal","15 August","15 June",75000,11,2027);
		lt.display();
	}

}
