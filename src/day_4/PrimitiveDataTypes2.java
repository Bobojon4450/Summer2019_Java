package day_4;

public class PrimitiveDataTypes2 {

	/**
	 byte, short, int, long, float, double, boolean, char.
	 *
	 */
	public static void main(String[] args) {
		boolean bool = true;
		boolean bool2 = false;
		
		System.out.println(bool);
		System.out.println(bool2);
		
		//char data type
		char char1 = 'a'; //ASCII Table: 97
		
		char char2 = '9';// anything inside '' is just a character.
		char char3 = '#';
		
		
		System.out.println(char1);
		
		System.out.println(char2);
		System.out.println(char3);
		
		char char4 = '{';
		char char5 = 125;
		
		System.out.println(char4 +" "+char5);
		
		char ch = 'a';
        char ch2 = 62;
        System.out.println(ch+ch2);// prints 159
        
        byte b1 = 123;
        char char6 = (char)b1;
        System.out.println(char6);
        
        char char7 = 'V';// memory of char is 2-byte
        
        byte  b2 = (byte)char7; // memory of byte 1-byte
        //however
        	  b2 = 'V'; //compiles because 'V' converted into number, 86, without data type.
        	  
        	  
        //short s1 = char7; short data-type ranges -32768 to 32767
        // 	                char  data-type ranges 0 to 65000
        short s1 = (short)char7;

        short s2 = 'A';
        
        int num = char7;
        
        long longValue = char7;
        long longValue2 = 86;
        
        System.out.println(num);
        
        System.out.println(longValue);
        System.out.println(longValue2);
        
        float floatNum = char7;
        float floatNum2 = 86;
        System.out.println("float " + floatNum);
        System.out.println("float " + floatNum2+"\n");
        
        
        double doubleNum = char7;
        double doubleNum2 = 86;
        System.out.println("double " + doubleNum);
        System.out.println("double " + doubleNum2 + "\n");
        
        
        char myCharValue = 200;
        System.out.println(myCharValue);
        
        char myCharValue2 = 128;
        System.out.println(myCharValue2);
        
        
        
        float f = 12L;
        double a = 300L;
        
        int c = 'A';
        float e = 12;
        float h = 'A';
        long g = 12;
        
        System.out.println("For the github check-out only!");
          
	}

}
