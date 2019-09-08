package day12_switchStatement;

public class IfStatementNoCurlyBraces {

	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hi");
		}else {
			System.out.println("World");
		}

		System.out.println("-----------------------");
		
		// nested if()
		if (true) 
			if (true)
			System.out.println("Whats up?");
			else
				System.out.println("Bye");
		else
			System.out.println("Invalid");
		
		
		System.out.println("-----------------------");
		//multi-branch if():
		int grade = 290;
		
		if (grade >= 0 && grade <= 100) {
			if (grade >= 90) {
				System.out.println("A");
			} else if (grade >= 80) {
				System.out.println("B");
			} else if (grade >= 70) {
				System.out.println("C");
			}
		}else {
			System.out.println("Invalid input");
		}
		
		
		//without curly braces.
		if (grade >= 0 && grade <= 100)
			if (grade >= 90)
				System.out.println("A");
			else if (grade >= 80)
				System.out.println("B");
			else if (grade >= 70)
				System.out.println("C");
			else
				System.out.println();
		else
			System.out.println("Invalid input");

	}

}
