package day10_if_statement;

public class If_Else_Statement {

	public static void main(String[] args) {
		
		int angle1 = 20;
		int angle2 = 111;
		int angle3 = 49;
		
		boolean valid = (angle1 + angle2 + angle3) == 180;
		
		if ((angle1 == 0 || angle1 <= 0) || (angle2 == 0 || angle2 <= 0)|| (angle3 == 0 || angle3<=0)) {
			System.out.println("Invalid input, input can't be zero or negative");
		}else if (valid) {
			System.out.println("Valid triangle");
		}
		else {
			System.out.println("Invalid triangle, the sum of the angles less then 180");
		}
		
		
	}

}
