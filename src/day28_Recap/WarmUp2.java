package day28_Recap;

public class WarmUp2 {
	/*
	 * 3. write a method that accepts 3 parameters: 2 numbers and one operator, and
		  prints out the calculation if operator is not between [-, +, *, /, %] output
		  should be Invalid Operator Ex: calculate(10,2, "*") ==> 20;
	 * 
	 * 4. write a method that can calculate grade 
	 * 		if score is 100 ~ 90 ==> A 
	 *		if score is 89 ~ 80 ==> B 
	 * 		if score is 79 ~ 70 ==> C 
	 * 		if score is 69 ~ 60 ==> D 
	 * 		if score is 0 ~ 59 ==> F 
	 * 		otherwise ==> Invalid Score
	 */
	public static void main(String[] args) {
		calculator(2, 3, "*");
		calculator(2, 0, "/");
		calculator(33, 7, "+");
		calculator2(3, 2, "-");
		gradeCalculator(45);
		gradeCalculator(67);
		gradeCalculator(79);
	}
	
	public static void calculator(int x, int y, String operator) {
		switch (operator) {
		case "+": System.out.println(x+y);break;
		case "-": System.out.println(x-y);break;
		case "*": System.out.println(x*y);break;
		case "/": if(y != 0) {System.out.println(x+y);break;}
				  else {System.out.println("Division by zero Not Allowed!!!");break;}
		case "%": System.out.println(x % y);break;
		default:
			System.out.println("Invalid Operator!");
		}
	}
	
	public static void calculator2(int x, int y, String operator) {
		String result ="";
		result += (operator.equals("+")) ? (x+y):
							(operator.equals("-")) ? (x-y):
								(operator.equals("*")) ? (x*y):
									(operator.equals("/")) ? (x/y):
										(operator.equals("%")) ? (x % y) : "Invalid Operator";
		System.out.println(result);
	}
	
	public static void gradeCalculator(int score) {
		char grade = (score >= 90 && score <= 100) ? 'A' :
			               (score >= 80 && score <= 89) ? 'B' :
			            	   (score >= 70 && score <= 79) ? 'C':
			            		   (score >= 60 && score <= 69) ? 'D':
			            			   (score >= 0 && score <= 59) ? 'F':
			            				   'I';
		if (grade == 'I') {
			System.out.println("Invalid grade!!!");
		}
		System.out.println(grade);

	}
	
}
