package day12_switchStatement;

public class WarmUp {

	public static void main(String[] args) {
		
		int a = 1, b = 10, c = 1;
		
//		if (a == b && a != c) {
//			System.out.println("a == b");
//		}else if (b == c && b != a) {
//			System.out.println("b == c");
//		}else if (c == a && a != b) {
//			System.out.println("c == a");
//		}else if (a == b && a == c && c == a) {
//			System.out.println("all equal");
//		}else {
//			System.out.println("non equal");
//		}
		
		
//		if (a == b && a == c) {
//			System.out.println("all equal");
//		}else if (a == b && a != c) {
//			System.out.println("a == b");
//		}else if (a == c && a != b) {
//			System.out.println("a == c");
//		}else if (b == c && b != a) {
//			System.out.println("b == c");
//		}

//		if (a == b && b == c) {
//			System.out.println("All equal");
//		}else if (a == b) {
//			System.out.println("a == b");
//		}else if (b == c) {
//			System.out.println("b == c");
//		}else if (c == a) {
//			System.out.println("c == a");
//		}
//		/*else if (a != b && b != c) {
//			System.out.println("None is equal.");
//		}*/
//		else {
//			System.out.println("None is equal.");
//		}
		
		
		//Nested if condition
//		int A = 10, B = 20, C = 30;
//		
//		if (A == B && B == C) {
//			System.out.println("All Equal.");
//		}else {
//			if (A == B) {
//				System.out.println("A == B");
//			}else if (A == C) {
//				System.out.println("A == C");
//			}else if (B == C) {
//				System.out.println("B == C");
//			}else {
//				System.out.println("None Is Equal");
//			}
//		}
		
		
		/*
		 *60 ~ 70 = D
		 *70 ~80 = C
		 *80 ~ 90 = B
		 *90 ~ 100 = A
		 * 0 ~ 59 = F
		 */
		
		int grade = 01;
		
		if (grade >= 0 && grade <= 100) {
			if (grade >= 60) {
				if (grade >= 90) {
					System.out.println("A");
				} else if (grade >= 80) {
					System.out.println("B");
				} else if (grade >= 70) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("Failed");
			}
		}else {
			System.out.println("Invalid input");
		}
		
		
		
		
		
		
		
	}

}
