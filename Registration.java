package featurefour;

public class Registration {

	private int id;
	private String username;
	private String password;
	private int cardNumber;
	private double cardBalance;
	
	
	Registration(){
		id = 0;
		username = "";
		password = "";
		cardNumber= 0;
		cardBalance= 0;
	}
	
	public Registration (int newId, String newUsername, String newPassword, int newCardNumber, int newCardBalance) {
		id = newId;
		username = newUsername;
		password = newPassword;
		cardNumber = newCardNumber;
		cardBalance = newCardBalance;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setUsername(String newUsername) {
		username = newUsername;
	}
	
	public void setPassword(String newPassword) {
		password = newPassword;
	}
	public void setCardNumber(int newCardNumber) {
		cardNumber= newCardNumber;
	}
	public void setBalance(double newCardBalance) {
		cardBalance = newCardBalance;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public double getCardBalance() {
		return cardBalance;
	}
	
	public String toString() {
		return "Account registered" + "\n" + "ID:" + getId() + "\n" + "Username:" + getUsername() + "\n" + "Password:" + getPassword()
		+ "\n" + "Card Number:" + getCardNumber()+ "\n" + "Card Balance:" + getCardBalance();
	}
}
