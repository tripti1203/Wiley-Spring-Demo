package Polymorphism;

interface IManageAccount{
	void openAccount();
	void closeAccount();
}
interface IBankAccount{
	public static final int interest = 0;
	public static void welcomeMessage() {
		System.out.println("Welcome to ABC Bank !!");
	}
	public default void welcome() {
		System.out.println("Default Welcome Method ..");
	}
	void deposit();
	void withdraw();
	void balance();
}

class SavingsAccount implements IBankAccount, IManageAccount {
	@Override
	public void deposit() {
		System.out.println("Deposit in Savings Account.");
	}
	@Override
	public void withdraw() {
		System.out.println("Withdraw in Savings Account.");
	}
	@Override
	public void balance() {
		System.out.println("Balance in Savings Account.");
	}
	@Override
	public void openAccount() {
		System.out.println("Open Account in Savings Account.");
	}
	@Override
	public void closeAccount() {
		System.out.println("Close Account in Savings Account.");
	}
}

public class InterfaceOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBankAccount.welcomeMessage();
		System.out.println();
		SavingsAccount saving = new SavingsAccount();
		saving.welcome();
		saving.deposit();
		saving.withdraw();
		saving.balance();
		saving.openAccount();
		saving.closeAccount();
	}

}
