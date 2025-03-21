/// SavingsAccount ///


public class SavingsAccount extends CheckingAccount {
	
	private double interestRate() {
		super();
		this.interestRate = 0.02;
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
		this.interestRate = interestRate
	}
	
	public double void getInterestRate() {
		return interestRate;
	}


} // end SavingsAccount
