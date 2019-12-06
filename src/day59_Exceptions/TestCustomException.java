package day59_Exceptions;

import javax.management.RuntimeErrorException;

public class TestCustomException {

	public static void main(String[] args) {
		throw new NoBreakTimeException();//throws runtime exception since it extends Runtime
//		throw new RuntimeException("Too much breaks");
	}
}
