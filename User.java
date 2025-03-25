/// User ///

import java.io.*

public abstract class User implements Serializable, HasMenu{

	String userName = "";
	String PIN = "";

	public boolean login() {
		scanner input = new Scanner(System.in);
		boolean result = false;
		System.out.println("User name: ");
		String userName = input.nextLine();

		if (userNameIn.equals(this.userName )){
			System.out.println("PIN: ");
			String pinIn = input.nextLine();
			if (pinIn.equals(this.PIN)){
				System.out.println("Login Successful");
				result = true;
			} else {
				System.out.println("Incorrect PIN");
			} // end if
		} else {
			System.out.println("Incorrect User Name");
		} // end if
		return result;
	} // end login


	public boolean login(String userNameIn, String pinIn) {
		boolean result = false;
		if (userNameIn.equals(this.userName)){
			if (pinIn.equals(this.PIN)){
				result = true;

		return this.userName.equals(userName) && this.PIN.equals(PIN);
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setPIN(PIN) {
		this.PIN = PIN;
	}

	public String getPIN() {
		return PIN;
	}

	public (abstract) String getReport();

} // end User


} // end User
