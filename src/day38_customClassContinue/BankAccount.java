package day38_customClassContinue;

public class BankAccount {

	String accounHolder;
	long accountNumber;
	double balance;
	
	public void deposit(double rss) {
		balance += rss; 
	}
	
	public void withdraw(double amount) {
		int charge = 35;
		
		if (balance == 0) {
			System.out.println("No funds available");
			return;
		}
		
		balance -= amount;
		
		if (balance < 0) {
			balance -= charge;
		}
		System.out.println("Balance: "+balance);
	}
	
	public void showBalance() {
		System.out.println("Account holder: "+accounHolder);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Available balance: "+balance);
	}
	
	public void setUp(long accountNum, String name) {
		accountNumber = accountNum;
		accounHolder = name;
	}
}


