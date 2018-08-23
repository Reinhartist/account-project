package entity;

public class Account {
	private String firstName;
	private String surname;
	private String accountNumber;

	public Account(String firstName, String surname, String accountNumber) {
		this.firstName = firstName;
		this.surname = surname;
		this.accountNumber = accountNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		return "[firstName=" + firstName + ", surname=" + surname + 
				", accountNumber=" + accountNumber + "]";
	}
	
}
