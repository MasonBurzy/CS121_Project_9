/// Bank ///

import java.io.*;


public class Bank implements HasMenu{

	private Admin admin;
	private ArrayList customers;

	public Bank() {
		// Uncomment the next two lines to refresh data

		
		//this.loadSampleCustomers();
		//this.saveCustomers();
		this.loadCustomers();
		this.start();
		this.saveCustomers();

	} // end constructor

	public void main() {
	
	}
	
	public void loadSampleCustomers() {
	
	}

	public void loadCustomers() {
	
	}
	
	public void saveCustomers() {
	
	}

	public void fullCustomerReport() {
	
	}

	public void addUser() {
	
	}x

	public void applyInterest() {
	
	}

	public void loginAsCustomer() {
		System.out.println("Customer Login");
                System.out.println("User name: ");
                String username = scanner.next();
                System.out.println("PIN: ");
                String username = scanner.next();
		currentCustomer = null;
		

                if (customer.login(userName, PIN)) {
                        startCustomer();
                } else
                        System.out.println("Invalid Login");
	
	}

	public void loginAsAdmin() {
		System.out.println("Admin Login");
		System.out.println("User name: ");
		String username = scanner.next();
		System.out.println("PIN: ");
		String username = scanner.next();

		if (admin.login(userName, PIN)) {
			startAdmin();
		} else
			System.out.println("Invalid Login");
	
	}

	public void menu() {
		System.out.println("0) Exit System\n 1) Login as Admin\n 2) Login as customer");
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
                                System.out.println("Action: Login as admin");
                                loginAsAdmin();
                        } else if (response.equals("2")) {
                                System.out.println("Action: Login as customer");
                                loginAsCustomer();
                        } else {
                                System.out.println("Invalid choice, please try again.");
                        }
                }
	
	}

	public void startAdmin() {
		while (true) {
			System.out.println(admin.menu)
	
	}


} // end Bank Class
