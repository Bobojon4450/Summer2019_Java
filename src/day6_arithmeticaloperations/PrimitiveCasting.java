package day6_arithmeticaloperations;

public class PrimitiveCasting {
	public static void main(String[] args) {
		
		int a = 15;
		byte b = 15;
		b = (byte) a;
		
		System.out.println(b);
		
		double d = 15.5;
		float f = (float) d;
		System.out.println(f);
		
		long lg = 500;
		int c = (int)lg;
		c = (short)lg;
//		c = (byte)lg; because range is 127 the rest will be cut.
		
		System.out.println(c);
		
		// Implicit casting
		byte bt = 100;
		short sh = 120;
		
		int in = bt;
		in = sh;
		long lg2 = in;
		/*******************************************************/
		
		double largestNumber =1000.8765;
		
		float fl2 = (short) largestNumber;
		float fl3 = (byte) largestNumber;//cut out the value.
		float fl4 = (long) largestNumber;
		float fl1 = (int)largestNumber;
		
		System.out.println(fl2);
		System.out.println(fl3);//cut out the value. it is out of the range.
		System.out.println(fl1);
		System.out.println(fl4);
		System.out.println(largestNumber);
		
		/*******************************************************/
		/*
		int num1 = 10;
		int num2 = 15;
		int num3 = 17;
		*/
		int num1 = 10, num2 = 15, num3 =17; //same as above mentioned.
		System.out.println(num1 +"\t"+ num2+"\t"+num3);
		
	}
}
