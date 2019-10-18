package day38_customClassContinue;

public class Employee {
	String empName;
	int empId;
	int empAge;
	int SSN;
	String jobTitle;
	double salary;
	
	
	
	public Employee(String empName,int empId, int empAge,int SSN, String jobTitle,double salary) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.SSN = SSN;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	public void getInfo() {
		String temp = String.valueOf(SSN);
		System.out.println("Name: "+empName);
		System.out.println("ID: "+empId);
		System.out.println("Age: "+empAge);
		System.out.println("Last 4 digits of SSN: "+temp.substring(temp.length()-4));
		System.out.println("Title: "+jobTitle);
		System.out.println("Annual salary: $"+salary);
		
	}
	
	
}
