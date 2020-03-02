package day57_Exceptions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExceptionHandling /* extends Exception */ {
	
	/*
	 * public ExceptionHandling() { super("Bal"); }
	 */

	private static String str;
	
	public static void main(String[] args) {

		divisionException();        // java.lang.ArithmeticException: / by zero
		throwsException();	        // java.lang.ArrayIndexOutOfBoundsException
		System.out.println("Done"); // Done printed
		
		int x[] = { 1, 2, 3 };
		try {
			System.out.println(x[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}catch (Throwable e) {
			e.printStackTrace();
		}	
		System.out.println("Control flow continues...... <^^>");
	}

	public static void divisionException() {
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Unchecked Exception");
			e.printStackTrace();
		}
	}

	public static void throwsException() {
		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[5]);
			System.out.println("Work done");
		} catch (ArrayIndexOutOfBoundsException anyname) {
			System.out.println("Unchecked Exception");
			anyname.printStackTrace();
		}
	}
	
	public void test() {
		throw new RuntimeException();
	}
	
}

abstract class Abs extends ExceptionHandling{
	

}
	


/*
 * class Test{ public static void main(String[] args) { String bla =
 * "bla  dsdg"; if (bla.contains("bla" )|| bla.contains("asdhfclb")) { throw new
 * ExceptionHandling(); } } }
 */