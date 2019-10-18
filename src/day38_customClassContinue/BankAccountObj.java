package day38_customClassContinue;

public class BankAccountObj {

	public static void main(String[] args) {
		BankAccount bc = new BankAccount();
		bc.accounHolder = "Adamsho";
		bc.accountNumber = 1234_5678_2121_1111L;
		bc.showBalance();
		bc.deposit(19858.93); 
		bc.showBalance();
		bc.withdraw(19859.93);
		bc.showBalance();
		System.out.println("\n");
		
		BankAccount bc2 = new BankAccount();
		bc2.setUp(1234567898765432L, "Zanak");
		bc2.showBalance();
		bc2.deposit(125000);
		bc2.showBalance();
		bc2.withdraw(12000);
		bc2.showBalance();
	}

}
