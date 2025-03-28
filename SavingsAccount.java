/// SavingsAccount ///

import java.io.*;

public class SavingsAccount extends CheckingAccount {
		
	private double interestRate;

	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(500.00, 0.03);
		savings.calcInterest();
	}

	public void calcInterest() {
		double interest = getBalance() * interestRate;
		setBalance(getBalance() + interest);
		System.out.println("Interest added: " + String.format("$%.2f", interest));
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}


} // end SavingsAccount
