package day58_Exception;

final public class Exceptions {

	public static void main(String[] args){
		
		try {
			System.out.println(0 / 1);
		} catch (RuntimeException e) {
			System.out.println("ArithmeticException: division / by zero");
		} finally {
			System.out.println("finally block");
		}
		
		System.out.println("----------------------------------\n");
		try {
			Thread.sleep(1000);
		}catch(RuntimeException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally block");
		}
		
		
		/* 	Interesting stuff	*/
		if (5 > 0 || 5 / 0 == 0) {
			System.out.println("HI");
		} else if (5 > 6 && 5 / 0 == 0) {
			System.out.println("Hello");
		} else {
			System.out.println("SilkRoad");
		}
		
	}
	
	
}
