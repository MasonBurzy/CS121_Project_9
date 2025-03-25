/// Customer ///

import java.io.*

public class Customer extends Serializable, User {

	private CheckingAccount checking;
	private SavingsAccount savings;

	public static void main(String[] args) {
		Customer customer = new Customer("user123", "1234");
		customer.start();
	}

	public Customer(userName, PIN) {
		super(userName, PIN);
		this.checking = new CheckingAccount (0.0);
		this.savings = new SavingsAccount (0.0, 0.02);
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
                                System.out.println("Savings Account");
                                makeDeposit();
                        } else if (response.equals("3")) {1
                                System.out.println("Making a withdrawal");
                                makeWithdrawal();
                        } else {
                                System.out.println("Invalid choice, please try again.");
                        }
                }	
	}

	public String menu() {
 		System.out.println("0) Exit\n 1) Manage Checking Account\n 2) Manage Savings Account\n 3) change PIN");
                String response = scanner.nextLine();
                System.out.println(response);
                return response;	
	}
	
	public void changePIN() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter new PIN: ");
		String newPin = scanner.next();
		setPIN(newPin);
		System.out.println("PIN successfully changed.");
	}

	public String getReport() {
		return "User: " + userName + "\nChecking Balance: " + checking.getBalanceString() + "\nSavings Balance: " + savings.getBalanceString();
	}


} // end Customer
