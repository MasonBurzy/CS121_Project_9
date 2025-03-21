/// User ///



public class User implements HasMenu() {

	private String userName;
	private String PIN;

	public boolean login() {
		return login(userName, PIN);
	}

	public boolean login(String userName, String PIN) {
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
