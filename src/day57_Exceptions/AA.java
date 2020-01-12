package day57_Exceptions;
import day57_Exceptions.*;

public class AA {
	
	public static void main(String[] args) {
		ExceptionHandling ex = new ExceptionHandling();
		
		int[] arr = {1,2,3};
		
		try {
			System.out.println(arr[3]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("catch");
			e.printStackTrace();
		}
		System.out.println("Control flow");
		
		int x = 101;
		
		System.out.println(x);
	}

}
