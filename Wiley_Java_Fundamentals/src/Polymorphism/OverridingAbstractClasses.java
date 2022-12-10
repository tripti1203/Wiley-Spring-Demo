package Polymorphism;

abstract class ManageAccount{
	
	private static void welcome() {
		System.out.println("Private Message");
	}
	public static void welcomeMessage() {
		System.out.println("Welcome to ABC Bank!!");
	}
	public abstract void openAccount();
	public abstract void closeAccount();
	
}

abstract class BankAccount extends ManageAccount{
	public abstract void deposit();
	public abstract void withdraw();
	public abstract void balance();
}

class SavingAccount extends BankAccount {
	
	@Override
	public void openAccount() {
		System.out.println("Open account in savingsAccount.");
	}
	@Override
	public void closeAccount() {
		System.out.println("Close account in savingsAccount.");
	}
	public void deposit() {
		System.out.println("Deposit in savingAccount.");
	}
	public void withdraw() {
		System.out.println("Withdraw in savingAccount.");
	}
	@Override
	public void balance() {
		System.out.println("Balance in savingAccount.");
	}
}

class CurrentAccount extends BankAccount {
	@Override
	public void openAccount() {
		System.out.println("Open account in currentAccount.");
	}
	@Override
	public void closeAccount() {
		System.out.println("Close account in currentAccount.");
	}
	public void deposit() {
		System.out.println("Deposit in currentAccount.");
	}
	public void withdraw() {
		System.out.println("Withdraw in currentAccount.");
	}
	@Override
	public void balance() {
		System.out.println("Balance in currentAccount.");
	}
}


public class OverridingAbstractClasses {

	public static void main(String[] args) {
		ManageAccount.welcomeMessage();
		//ManageAccount.welcome();
		SavingAccount saving = new SavingAccount();
		saving.openAccount();
		saving.deposit();
		saving.withdraw();
		saving.balance();
		saving.closeAccount();
		
		System.out.println("----------------");
		
		CurrentAccount current = new CurrentAccount();
		current.openAccount();
		current.deposit();
		current.withdraw();
		current.balance();
		current.closeAccount();
	}

}
