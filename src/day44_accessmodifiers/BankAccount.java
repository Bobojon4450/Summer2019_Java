package day44_accessmodifiers;

public class BankAccount {

    /*
    WarmUp: create a custom class for bankaccount
   	The attributes/data that the class can have are: 
           AccountHolder, AccountNumber, AvailableBalance
   Actions the class can do are:
           deposit , withdraw, checking balance
   requirements:
           1. apply encapsulation  (done)
           2. user should be able to deposit, withdraw and check the balance
               2.1 if the withdrawing amount is greater than available balance, 
                       35$ penalty fee will be charger from the account
               2.2 if the available balance is less or equal to 0
                   account holder won't be able to withdraw money
    */
	
	private String accountHolder;
	private long accountNumber;
	private double availableBalance;
	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	
	public void deposit(double amount) {
		availableBalance += amount;
	}
	
	public void withdraw(double amount) {
		if (availableBalance <= 0) {
			System.out.println("Insafficient balance.");
			return;
		}
		if (amount > availableBalance) {
			availableBalance -= amount;
			availableBalance -= 35;
		}else {
			availableBalance -= amount;
		}
	}
	
	public void showBalance() {
		System.out.println("The balance is: $"+availableBalance);
	}

	public void getAccountInfo() {
        System.out.println("Name: " + getAccountHolder() );
        System.out.println( "Account Number: "+ getAccountNumber() );
        System.out.println("Available Balance: "+getAvailableBalance());
    }
}
