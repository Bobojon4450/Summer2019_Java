package day44_accessmodifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {

	public static void main(String[] args) {
		BankAccount Sarah = new BankAccount();
		Sarah.setAccountHolder("Sarah Abdujappar");
		Sarah.setAccountNumber(123456789654312L);

		System.out.println("Name: " + Sarah.getAccountHolder());
		System.out.println("Account Number: " + Sarah.getAccountNumber());
		System.out.println("Available Balance: " + Sarah.getAvailableBalance());

		Sarah.deposit(2000);
		Sarah.showBalance(); // 2000

		Sarah.withdraw(2500); //
		Sarah.showBalance();
		Sarah.deposit(100000);
		Sarah.showBalance();

		BankAccount Serkan = new BankAccount();
		Serkan.setAccountHolder("Serkan");
		Serkan.setAccountNumber(9876543212321L);

		Serkan.getAccountInfo();

		Serkan.deposit(10000);
		Serkan.showBalance(); // 100000
		Serkan.withdraw(3000);

		Serkan.getAccountInfo();

		BankAccount[] accounts = { Sarah, Serkan };//has all bankAccounts

		ArrayList<BankAccount> Accounts = new ArrayList<>();
		// Accounts.add(Sarah);
		// Accounts.add(Serkan);
		Accounts.addAll(Arrays.asList(Sarah, Serkan));

	}
}
