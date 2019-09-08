package day12_switchStatement;

public class SwitchStatement {

	public static void main(String[] args) {


		int score =1;
		if (score == 1) {
			System.out.println("1");
		}else if (score == 2) {
			System.out.println("2");
		}
		
		//switch()
		switch (score) {
			case 1: System.out.println("1");break;
			case 2: System.out.println("2");break;
			default:
				System.out.println("Invalid input");;
		}
		System.out.println("---------------------\n\n");
		
		String java = "Java";
		
		switch (java) {
			default:
				System.out.println("Invalid");
			case "C#":
				System.out.println("C#");
			case "Python":
				System.out.println("Python");

		}
		
		System.out.println("---------------------\n\n");
		
		char ch = 'A';
		
		switch (ch) {
		
		case 'M':
			System.out.println("Passed with M");
		case 'C':
			System.out.println("Passed with C");
		default:
			System.out.println("Failed");
		}
		
		System.out.println("---------------------\n\n");
		
		
		int score2 = 0;

		if (score2 == 0) {
			score2 += 50;
		}
		if (score2 != 0) {
			score2 += 50;
		}

		System.out.println(score2);
		
		int x = 'a';
		System.out.println(x);
		char c = 121;
		System.out.println(c);
		
		//vote age: 
		/*
		 *age >= 18 eligible to vote
		 *age >= 70 can vote three times
		 *70 > age >= 50 can vote twice
		 *50 > age >=18 ==> can vote one time
		 */
		int age = -1;
		
		if (age >= 0) {
			if (age >= 18) {
				if (age >= 70) {
					System.out.println("Can vote three times");
				} else if (age >= 50) {
					System.out.println("Can vote two times");
				} else {
					System.out.println("Can vote one time");
				}
			} else {
				System.out.println("Not eligible to vote");
			}
		}else {
			System.out.println("Invalid Input!");
		}
	}

}
