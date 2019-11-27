package day57_Exceptions;

public class ExceptionHandling {

	private static String str;
	
	public static void main(String[] args) {

		divisionException();
		throwsException();
		System.out.println("Done");
		
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

}
