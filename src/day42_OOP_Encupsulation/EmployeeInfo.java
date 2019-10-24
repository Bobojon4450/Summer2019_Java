package day42_OOP_Encupsulation;

public class EmployeeInfo {

	/*
	 * Name
	 * SSN
	 * Age
	 * Salary
	 */
	
	long total = 100;
	static String name ="Adam"; 
	
	public EmployeeInfo() {
		total -= 50;
	}
	
	public EmployeeInfo(int x) {
		this();
		this.total += total;
	}
	
	{
		total *= 2;
	}
	
	static {
		int total = 20;
		total /= 2;
	}
	
//	private String name;
//	private long SSN;
//	private int age;
//	private double salary;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public long getSSN() {
//		return SSN;
//	}
//	public void setSSN(long sSN) {
//		SSN = sSN;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	
	
}

