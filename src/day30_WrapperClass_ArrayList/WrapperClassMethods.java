package day30_WrapperClass_ArrayList;

public class WrapperClassMethods {

	public static void main(String[] args) {
		int maximum = Integer.MAX_VALUE; // returns max value of int capacity.
		System.out.println(maximum);

		double maximum2 = Double.MAX_VALUE; // returns max value of double capacity.
		System.out.println(maximum2);

		char chMax = Character.MAX_VALUE; // returns max value of char capacity.
		System.out.println(chMax);

		// minValue(); returns minimum value of primitive.
		int minimum = Integer.MIN_VALUE;
		System.out.println(minimum);// returns min value of int capacity.

		byte bMin = Byte.MIN_VALUE;
		System.out.println(bMin);

		// parse methods convert string into primitive value.
		String num = "123";
		int number = Integer.parseInt(num);// none {primitive to primitive}
		System.out.println(number);

		Integer a = Integer.parseInt("123");// auto-boxing {primitive to Wrapper class}
		System.out.println(a);
		
		
		int b = Byte.parseByte("12");	// none {primitive to primitive}
		System.out.println(b+1);
		
		Byte c = Byte.parseByte("121");	// auto-boxing {primitive to Wrapper}
		System.out.println(c+1);
		
		boolean A = Boolean.parseBoolean("CybertekBatch12");// returns false unless given true
		System.out.println(A);
		
		Boolean B = Boolean.parseBoolean("tRue");//method ignores case sensitivity 
		System.out.println(B);//true, auto-boxing
		
		/*
		 Each wrapper class is dedicated to its primitive data-type.
		 Double d = Double.parseDouble("10"); compiles
		 Short i = Byte.parseDouble("10"); will not compile.
		 */
		
	//  ValueOf(): converts string to related Wrapper class.
		int z = Integer.valueOf("123"); // unboxing
		Integer z1 = Integer.valueOf("144");// none
		System.out.println(z1);
		
		Integer e = Integer.valueOf("567"+8);
		System.out.println(e);
		
		boolean result = Boolean.valueOf("TrUe");// unboxing
		System.out.println(result); //case sensitivity ignored.
		
		
		
	}
}
