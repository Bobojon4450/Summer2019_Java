package day10_if_statement;

public class Nested_If {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		if (true) {
			System.out.println("Before the inner");
			if (false) {
				System.out.println("Hello from inner");
			} else
				System.out.println("else() of the inner");
		}
		/******************************************************/

		int grade = 105;
		if (grade >= 60 && grade <= 100) {
			System.out.print("Passed ");
			if (grade >= 90 && grade <= 100) {
				System.out.print(" with A ");
			} else if (grade >= 80 && grade < 90) {
				System.out.print(" with a B");
			} else if (grade >= 70 && grade < 80) {
				System.out.print(" with a C");
			} else {
				System.out.print(" with a D");
			}
		} else {
			if (grade < 60 && grade >= 50) {
				System.out.println("Failed with a grade of F");
			} else if (grade >= 30 && grade <= 40) {
				System.out.println("Graded H");
			} else if (grade >= 20 && grade < 20) {
				System.out.println("Graded I");
			} else
				System.out.println("Invalid score number, error 404");
		}

	}
}
