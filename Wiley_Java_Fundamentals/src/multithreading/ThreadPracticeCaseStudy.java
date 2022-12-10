package multithreading;

class Bank {
	private  int balance;
	
	public Bank() {
		super();
		
	}
	
	public Bank(int balance) {
		
		this.balance = balance;
	}

	public synchronized void withdrawal(String name , int amount) throws InterruptedException {
		
		if(balance >= amount) {
			balance -= amount;
			System.out.println("Money Debited, Initial Balance Of "+ name + " : " + balance);
		}
		else {
			System.out.println("You do not have enough balance");
		}
		Thread.sleep(1000);
	}
	public synchronized void deposit(String name, int amount) throws InterruptedException {
		balance += amount;
		System.out.println("Amount deposited in the bank account , total balance Of " + name + " : " + balance);
		Thread.sleep(1000);
	}

}

class ThreadWithdrawal extends Thread{
	Bank account;
	String name;
	int amount;
	
	
	public ThreadWithdrawal(Bank account, String name, int amount) {
		this.account = account;
		this.name = name;
		this.amount = amount;
	}


	@Override
	public void run() {
		try {
			account.withdrawal(name,amount);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadDeposit extends Thread{
	Bank account;
	String name;
	int amount;
	
	
	
	public ThreadDeposit(Bank account, String name, int amount) {
		this.account = account;
		this.name = name;
		this.amount = amount;
	}



	@Override
	public void run() {
		try {
			account.deposit(name, amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThreadPracticeCaseStudy {

	public static void main(String[] args) throws InterruptedException {
		Bank bank = new Bank(50000);
		
		
		ThreadWithdrawal withdrawal1 = new ThreadWithdrawal(bank,"King",10000);
		ThreadWithdrawal withdrawal2 = new ThreadWithdrawal(bank,"Priyank",2000);
		ThreadDeposit deposit1 = new ThreadDeposit(bank,"Sarah",30000);
		ThreadWithdrawal withdrawal3 = new ThreadWithdrawal(bank,"Krish",3000);
		ThreadDeposit deposit2 = new ThreadDeposit(bank,"Harsh",2000);
		ThreadWithdrawal withdrawal4 = new ThreadWithdrawal(bank,"Priya",500);
		
		withdrawal1.start();
		
		withdrawal2.start();
		
		deposit1.start();
		
		withdrawal3.start();
		
		deposit2.start();
		
		withdrawal4.start();
		
		
		
	}

}
