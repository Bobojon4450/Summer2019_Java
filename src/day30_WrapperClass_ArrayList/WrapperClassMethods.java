package day30_WrapperClass_ArrayList;

public class WrapperClassMethods {

	public static void main(String[] args) {
		
		/**
		 * parse() method always returns you primitive from string
		 * valueOf() method always returns corresponding Wrapper class
		 */
		

		int maximum = Integer.MAX_VALUE; // returns max value of an int capacity.
		System.out.println("int MAX_VALUE: " + maximum);

		double maximum2 = Double.MAX_VALUE; // returns max value of a double capacity.
		System.out.println("double MAX_VALUE: " + maximum2);

		char chMax = Character.MAX_VALUE; // returns max value of a char capacity.
		System.out.println("char MAX_VALUE: "+chMax);

		// minValue(); returns minimum value of primitive.
		int minimum = Integer.MIN_VALUE;
		System.out.println("int MIN_VALUE: "+minimum);// returns min value of int capacity.

		byte bMin = Byte.MIN_VALUE;
		System.out.println("byte MAX_VALUE: "+bMin+"\n\n");

		
		/* parse() methods convert String into primitive value	always	*/
		String num = "123";
		int number = Integer.parseInt(num);// none {primitive to primitive} Unboxing
		System.out.println("int = Integer.parseInt: " + number);

		Integer a = Integer.parseInt("123");// auto-boxing {primitive to Wrapper class}
		System.out.println(a);

		int b = Byte.parseByte("12"); // none {primitive to primitive}
		System.out.println(b + 1);

		Byte c = Byte.parseByte("127"); // auto-boxing {primitive to Wrapper}
		System.out.println(c + 1);

		boolean A = Boolean.parseBoolean("CybertekBatch12");// returns false unless given true
		System.out.println(A);

		Boolean B = Boolean.parseBoolean("tRue");	// method ignores case sensitivity
		System.out.println(B);	// true, auto-boxing.

		/* Each wrapper class is dedicated to its coresponding primitive data-type. 
		 * Double d = Double.parseDouble("10");  compiles
		 * Short i = Byte.parseDouble("10"); will not compile. out of range
		 */

		/* ValueOf(): converts string to related Wrapper class	 */
		int z = Integer.valueOf("123"); // Unboxing
		Integer z1 = Integer.valueOf("144");	// NONE
		System.out.println("Integer:" + z1);
		System.out.println("int: " + z);

		//                    2nd        1st
		Integer e = Integer.valueOf("567" + 8); // NONE
		System.out.println("Integer e: " + e);

		boolean result = Boolean.valueOf("TrUe");// Unboxing
		System.out.println(result); // case sensitivity ignored.
	}
	
	
}
