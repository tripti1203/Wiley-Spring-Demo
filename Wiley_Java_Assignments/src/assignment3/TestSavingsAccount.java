package assignment3;

class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount() {
		super();
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public double calculateMonthlyInterest() {
		this.savingsBalance += (this.savingsBalance*this.annualInterestRate)/12;
		return this.savingsBalance;
	}
	public static void modifyInterestRate(double newAnnualInterestRate) {
		SavingsAccount.annualInterestRate = newAnnualInterestRate;
	}
	
}

public class TestSavingsAccount {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		saver1.setAnnualInterestRate(4);
		saver2.setAnnualInterestRate(4);
		
		double newBalance1 = saver1.calculateMonthlyInterest();
		double newBalance2 = saver2.calculateMonthlyInterest();
		
		System.out.println("New Balance At 4% Annual Interest Rate of Saver1 : " + newBalance1);
		System.out.println("New Balance At 4% Annual Interest Rate of Saver2 : " + newBalance2);
		System.out.println("--------------------------------------------------------------------");
		
		saver1.modifyInterestRate(5);
		saver2.modifyInterestRate(5);
		
		newBalance1 = saver1.calculateMonthlyInterest();
		newBalance2 = saver2.calculateMonthlyInterest();
		
		System.out.println("New Balance At 5% Annual Interest Rate of Saver1 : " + newBalance1);
		System.out.println("New Balance At 5% Annual Interest Rate of Saver2 : " + newBalance2);
		
	}

}
