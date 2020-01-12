package day48_methodOverriding;

class Holy{
	/*	final methods can't overridden	*/
	final public void printName() {
		System.out.println("Holy");
	}	
}

class Credentials {
	
	/*	final instance variables and static variables must be initialized before use.	*/
	private final String userName = "holyMoly";
	private final String passWord = "12345";	
	
  /* public void setUserName(String userName) {
		this.userName = userName;
	 }*/
	
	private String getUserName() {
		return userName;
	}
	private String getPassWord() {
		return passWord;
	}
	
	/*	We can overload private final methods but not override them	*/
	private final static void add(int x, int y) {
		System.out.println(x + y);
	}
	
	private final static double add(int x, int y, int z) {
		System.out.println(x + y + z);
		return (x + y + z);
	}
	
	final public static void main(String[] args) {
		Credentials cr =  new Credentials();
		System.out.println(cr.getUserName());
		System.out.println(cr.getPassWord());
		cr.add(2, 2);
		cr.add(1, 1, 1);
	}
	
}

public class FinalKeyword extends Holy{

	/*@Override
	public void printName() {
		System.out.println("Madya");  since it is final method
	}*/
	
	
	/*	final instance variables and static variables must be initialized before use.	*/
	final int age = 18;
	final static double num = 10;
	
	
	
	public static void main(String[] args) {
		
		final String SSN = "123456789";
		System.out.println(SSN);
		
		final String age;
		System.out.println();
		
		FinalKeyword fk = new FinalKeyword();
		System.out.println(fk.age);
		fk.printName(); //calls inherited final method
		
	}
}
