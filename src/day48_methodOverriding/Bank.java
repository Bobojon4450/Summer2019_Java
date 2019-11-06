package day48_methodOverriding;

/*	Override happens only in the subclass. Inheritance should be there.	*/
/*	static methods cannot be overridden	at all */
public class Bank {

	public void interestRate() {
		System.out.println("9%");
	}

	public static void main(String[] args) {
		Bank bn = new Bank();
		BankOfAmerica bofa = new BankOfAmerica();
		Chase cs = new Chase();
		CapitalOne cp = new CapitalOne();
		bn.interestRate();
		bofa.interestRate();
		cs.interestRate();
		cp.interestRate();
	}
}

class BankOfAmerica extends Bank {
	@Override
	public void interestRate() {
		System.out.println("5%");
	}
}

class Chase extends Bank {
	@Override
	public void interestRate() {
		System.out.println("6%");
	}
}

class CapitalOne extends Bank {
	@Override
	public void interestRate() {
		System.out.println("4.5%");
	}
}