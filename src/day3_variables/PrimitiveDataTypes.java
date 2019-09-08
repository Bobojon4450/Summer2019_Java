package day3_variables;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		//byte accepts 
		byte length = 3;
		byte widthLength = 4;
		byte area = (byte)(length * widthLength);
		System.out.println("The area of the square with width 4 and length 3 is: "+area);
		
		byte numHighest = 127;
		byte numLowest = -128;
		
		short shortNumHigh = 32767;
		short shortNumLow = -32768;
		
		int numIntHigh = 1000_000_000;
		
		long longNum = 10L;
		int x = (int)longNum;
		
		double doubleNum = 1234; // bigger than float.
		float decimalNum = 1234f;
		float floatNum = 1234.5f;
		
		
//		longNum = decimalNum; need to be casted.
//		byte < short < int < long
		
		
		System.out.println(doubleNum);
		System.out.println(decimalNum);
		System.out.println(numIntHigh);
		
		
	}
}
