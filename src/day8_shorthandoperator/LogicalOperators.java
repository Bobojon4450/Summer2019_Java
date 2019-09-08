package day8_shorthandoperator;

public class LogicalOperators {

	/**
	 * && : and logic || : or logic
	 * 
	 */

	public static void main(String[] args) {

		boolean result = 9 == 0 && "Muhtar" == "good";
		System.out.println(result);

		boolean resultb = (8 > 5) && 7 == (8 - 2 + 1);
		System.out.println(resultb);

		boolean resultc = !false != true && !false == !(!true);// false
		System.out.println(resultc);

		boolean resultd = false && false;
		System.out.println(resultd);// false

		/****************************************************/

		boolean A = "Monday" == "fun-day" || 6 == 6;
		System.out.println(A);

		boolean B = true || false;
		System.out.println(B);

		boolean C = !(8 > 5) || !("Today" != "Friday");// false && false == false;
		System.out.println(C);

		boolean D = true && true || false;
		System.out.println(D); // true

		boolean E = !(7 > 5 && 6 != 5) && (9 > 5 || 10 > 4);
		// false && true; ==> false
		System.out.println(E);

		byte b = 30;
//		int c2 = c2 += b; won't compile. must be initialized.

		isEven(198);
	}

	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
			return true;
		}
		else {
			System.out.println("Odd");
			return false;
		}
	}

}
