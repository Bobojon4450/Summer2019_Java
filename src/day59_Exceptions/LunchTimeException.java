package day59_Exceptions;

public class LunchTimeException extends Exception{

	public LunchTimeException() {
		super("It is a lunch time");
		System.err.println("Time to stop the class");//prints in red color
	}
	
}
