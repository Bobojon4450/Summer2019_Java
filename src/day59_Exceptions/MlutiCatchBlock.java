package day59_Exceptions;

import java.util.NoSuchElementException;

public class MlutiCatchBlock {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };
		
		try {
			System.out.println(x[10]);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (ClassCastException e) {
			System.out.println("ClassCastException");
		} catch (NoSuchElementException e) {
			System.out.println("NoSuchElementException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
		}
	}
}
