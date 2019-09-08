package day7_unary_shorthand;

public class Quiz {

	public static void main(String[] args) {
		
		//Q#1
		int num1 = 10;
		int num2 = (byte)num1;
		System.out.println(num2);//byte is still whole number.
		
		//Q#2
		System.out.println("Result B"+(1)+(2));//Result B12
		System.out.println("Result B"+(1+2));//Result B3
		
		//Q#4
		System.out.println("5 + 2 = " + 3 + 4);//5 + 2 = 34
		System.out.println("5 + 2 = " + (3 + 4));//5 + 2 = 7
		
		//Q#5
		float num3 = 100.98765432F;
		short num4 = (short)num3;
		System.out.println(num4);
		
		//Q#6
//		byte num5 = 200; won't compile
		
		System.out.println((3+2) * 2 / 3 % 2);//1
		 
//		int a = 9, num5 = 0, num6 = a / num5; compiles but throws at run time
//		System.out.println(num6); throws java.lang.ArithmeticException
		
		double dNum = 3_000L;
		int num8 = (int)dNum;
		
		int num7 = num8 % 1000;
		System.out.println(num7);//0
		System.out.println("--------------------------");
		
		
		double dNum2 = 10/3;
		System.out.println(dNum2);//3.0
		double dNum3 = 10.0/3;
		System.out.println(dNum3);//3.3333333333333335
		System.out.println("--------------------------");
		
		int num88 = 10, num9 = 20, num10 = 30;
		num88 = num88 % 5;
		num9 = num9 % 5;
		num10 = num88 * num9;
		System.out.println(num88+"\t"+num9+"\t"+num10);
		System.out.println("--------------------------");
		
		
		System.out.println(10 / 3L);//3
		System.out.println(10 / 3f);//3.3333333
		System.out.println(10 / 3D);//3.3333333333333335
		System.out.println(10.5 % 3);//1.5
		
		
		
	}

}
