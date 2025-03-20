/// CheckingAccount ///

import java.util.Scanner;


class CheckingAccount implements HasMenu {
	private double balance;
	private Scanner scanner;

	public CheckingAccount() {
		this.balance = 0.0;
	}

	public CheckingAccount(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		CheckingAccount account = new CheckingAccount(100.00);
		account.start();
	}


	public String menu() {
		System.out.println("0) quit\n 1) check balance\n 2) make a deposit\n 3) make a withdrawal");
		String response = scanner.nextLine();
		System.out.println(response);
		return response;
	}

	public void start() {
		while (true) {
			String response = menu();

			if (response.equals("0")) {
				break;
			} else if (response.equals("1")) {
				System.out.println("Checking balance...");
				checkBalance();
			} else if (response.equals("2")) {
				System.out.println("Making a deposit...");
				makeDeposit();
			} else if (response.equals("3")) {
				System.out.println("Making a withdrawal");
				makeWithdrawal();
			} else {
				System.out.println("Invalid choice, please try again.");
			}
		}
	} // end Start

	public double getBalance() {
		return balance;
	} 

	public String getBalanceString() {
		String result = String.format("$%.2f", this.balance);
		return result;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void checkBalance() {
		System.out.println("Current Balance: " + this.getBalanceString());
	}	
	
	private double getDouble() {
		Scanner input = new Scanner(System.in);
		try {
           		return scanner.nextDouble();
		} catch (Exception e) {
            		System.out.println("Invalid input. Defaulting to 0.");
            		return 0.0;
		}
	}

	public void makeDeposit() {
		System.out.println("How much to deposit? ");
		double amount = getDouble();
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit Successful");
		} else {
			System.out.println("Invalid or insufficient funds.");
	}

	}

	public void makeWithdrawal() {
		System.out.println("How much to withdrawal? ");
		double amount = getDouble();
		if (amount > 0) {
			balance -= amount;
			System.out.println("Withdrawal Successful");
		} else {
			System.out.println("Invalid or insufficient funds.");
	}

	}



} // end CheckingAccount
