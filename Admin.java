/// Admin ///

public class Admin extends User {

	public Admin() {
		this.userName = "admin";
		this.PIN = "0000";
	}

	public String menu() {
		System.out.println("0) Exit this menu\n 1) Full customer report\n 2) Add user\n 3) Apply interest to savings accounts");
                String response = scanner.nextLine();
                System.out.println(response);
                return response;
	}

	public String getReport() {
		return userName;
		return PIN;
       	}
}
