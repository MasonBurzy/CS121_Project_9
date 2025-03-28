/// Bank ///

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank implements HasMenu, Serializable {

	private Admin admin;
	private ArrayList customers;
	private Customer currentCustomer;

	public Bank() {
		// Uncomment the next two lines to refresh data

		
		//this.loadSampleCustomers();
		//this.saveCustomers();
		this.loadCustomers();
		this.start();
		this.saveCustomers();

	} // end constructor

	public void main() {
		new Bank();
	
	}
	
	public void loadSampleCustomers() {
		customer.add(new Customer("Alice", "1111"));
		customer.add(new Customer("Bob", "2222"));
		customer.add(new Customer("Cindy", "3333"));
	
	}

	public void loadCustomers() {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("customers.dat"))) {
            		customers = (CustomerList) in.readObject();
            		System.out.println("Customer data loaded.");
        	} catch (IOException | ClassNotFoundException e) {
            		System.out.println("No saved data found. Loading sample customers.");
            		loadSampleCustomers();
		}
	}
	
	public void saveCustomers() {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("customers.data"))) {
			out.writeObject(customers);
        		System.out.println("Customer data saved.");
        	} catch (IOException e) {
            		System.out.println("Error saving customers: " + e.getMessage());
		}
	}

	public void fullCustomerReport() {
		System.out.println("Full customer report:");
        	for (Customer customer : customers) {
            		System.out.println(customer.getReport());
		}
	}

	public void addUser() {
		System.out.print("Enter new username: ");
        	String username = scanner.next();
        	System.out.print("Enter new PIN: ");
        	String pin = scanner.next();

        	customers.add(new Customer(username, pin));
        	System.out.println("New customer added.");
	}

	public void applyInterest() {
		for (Customer customer : customers) {
           		customer.getSavings().calcInterest();
           		System.out.println("New balance for " + customer.getUserName() + ": " + customer.getSavings().getBalanceString());
		}
	}

	public void loginAsCustomer() {
		System.out.println("Customer Login");
                System.out.println("User name: ");
                String username = scanner.next();
                System.out.println("PIN: ");
                String username = scanner.next();
		currentCustomer = null;
		
		for (Customer customer : customers) {
            		if (customer.login(username, pin)) {
                		currentCustomer = customer;
                		customer.start();
                		return;
			}
		}

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
		} else {
			System.out.println("Invalid Login");
		}
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
				saveCustomers();
				return;
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
            		System.out.println(admin.menu());
            		System.out.print("Action: ");
            		String response = scanner.next();

			if (response.equals("0")) {
            			System.out.println("Exiting admin menu...");
            			break;
        		} else if (response.equals("1")) {
        			fullCustomerReport();
        		} else if (response.equals("2")) {
            			addUser();
        		} else if (response.equals("3")) {
            			applyInterest();
        		} else {
            System.out.println("Invalid choice, please try again.");
			}
		}
	}

} // end Bank Class
