package proj01;

public class BankAccount {
	
	public String name;
	public String number;
	
	public int balance;
	public int interest;

	

	public BankAccount() {
		
	}
	
	public BankAccount(String name) {
		this(name, null);
	}
	
	public BankAccount(String name, String number) {
		this(name, number, 0);
	}
	
	public BankAccount(String name, String number, int balance) {
		this(name, number, balance, 0);
	}
	
	public BankAccount(String name, String number, int balance, int interest) {
		this.name = name;
		this.number = number;
		this.balance = balance;
		this.interest = interest;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}
	
}
