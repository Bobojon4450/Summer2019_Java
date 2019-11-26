package day55_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class BOA {

	public static void main(String[] args) {
		
		Testers ts = new Testers("Adam", "SDET", 125631);
		Testers ts2 = new Testers("Zuhal", "Team Lead", 123456);
		Testers ts3 = new Testers("Erhan", "Manual tester", 101234);

		Testers[] testers = { ts, ts2, ts3 };
		for (Testers each : testers) {
			each.getEmployeeInfo();
			System.out.println("----------------------");
		}
		
		Developers dev = new Developers("Adamsho", "Back-End Developer", 134556);
		Developers dev2 = new Developers("Nadire", "Back-End Developer", 133456);
		Developers dev3 = new Developers("Adamsho", "Front-End Developer", 75679);
		Developers dev4 = new Developers("Parsa", "Junior  Developer", 67890);
		
		Developers[] devs = { dev, dev2, dev3, dev4 };
		for(Developers each : devs) {
			each.getEmployeeInfo();
			System.out.println("=======================");
		}
		
		/*	Here the polymorphism occurred. The reference type 
		    is super class and the Object type is any sub-class of 
		    the parent class. Important: 
		    The overridden method is called first, compile error otherwise.	*/
		ScrumTeam sc =  new Developers("Adamsho", "Back-End Developer", 134556);
		ScrumTeam sc2 = new Developers("Nadire", "Back-End Developer", 133456);
		ScrumTeam sc3 = new Developers("Adamsho", "Front-End Developer", 75679);
		ScrumTeam sc4 = new Developers("Parsa", "Junior  Developer", 67890);
	
		ScrumTeam scts =  new Testers("Adam", "SDET", 125631);
		ScrumTeam scts2 = new Testers("Zuhal", "Team Lead", 123456);
		ScrumTeam scts3 = new Testers("Erhan", "Manual tester", 101234);
		
		ScrumTeam[] scTesters = { scts, scts2, scts3 };
		ScrumTeam[] scrDevs = { sc, sc2, sc3, sc4 };
		
		
		/*Here we added all arrays into a arrayList	*/
		ArrayList<ScrumTeam> list = new ArrayList<ScrumTeam>();
		list.addAll(Arrays.asList(scrDevs));
		list.addAll(Arrays.asList(scTesters));
		
		for(ScrumTeam each: list ) {
            each.getEmployeeInfo();
            System.out.println("\n");
        }
	}
	
}

abstract class ScrumTeam {

	public String name, jobTitle;
	public double salary;

	public abstract void dailyStandUp();

	public abstract void demo();

	public void getEmployeeInfo() {
		System.out.println("Employee name: " + name);
		System.out.println("Job title: " + jobTitle);
		System.out.println("Employee salary: " + salary);
	}
}


class Developers extends ScrumTeam{
/*	name, jobTitle and salary already inherited	*/
	
	public Developers(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	@Override
	public void demo() {
		
	}
	
	@Override
	public void dailyStandUp() {
		System.out.println(name+" is talking.");
	}
	
	
}


class Testers extends ScrumTeam {

	/* Here we implicitly have all inherited instance variables */
	public Testers(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	@Override
	public void dailyStandUp() {
		System.out.println("Tester " + name + " is disscussing");
	}

	@Override
	public void demo() {
		System.out.println("Tester " + name + " is doing demo");
	}
}

	/*	Advantage of the polymorohism is we can store many subclasses 
	 * of IS A relationship into arrayList 	*/

//abstract, polymrphism, encapsulation