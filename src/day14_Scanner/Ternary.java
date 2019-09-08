package day14_Scanner;

public class Ternary {

	public static void main(String[] args) {
	
		/*
		 * if (condition) ==> (condition)?
		 * else           ==> :
		 * else if()      ==> (condition)?
		 */
		
		int num = 0;
		
		num = (true) ? 100 : 50;
		System.out.println(num);

		System.out.println("---------------------");
		
		String schoolName = "";
		boolean batch12 = true;
		
//		if (batch12) {
//			schoolName = "Cybertek";
//		}else {
//			schoolName = "Invalid";
//		}
		
		
		String school = "";
		school = (batch12) ? "Cybertek" : "No-Name";
		System.out.println(school);
		
		System.out.println("---------------------");
		
		int score = 90;
		char Final = ' ';
		
		Final = (score >= 90 && score <= 100) ? 'A'
				: (score >= 80 && score <= 89) ? 'B'
						: (score >= 70 && score <= 79) ? 'C'
								: (score >= 60 && score <= 69) ? 'D' 
										: (score >= 50 && score <= 59) ? 'F' 
												: ' ';
		
		System.out.println(Final);
		
		System.out.println("---------------------");
		
		int n1 = 100, n2 = 300, n3 = 400;
		
		int max = (n1 > n2 && n1 > n3) ? n1 
				: (n2 > n1 && n2 > n3) ? n2 
						: n3;

		System.out.println("max = "+max);
	}

}
