package day18_StringMethods_Cont;

public class StringMethods_Boolean {

	public static void main(String[] args) {
		/**
		 isEmpty(): returns boolean expression. Checks if the String is empty. if there is a space returns true.
		*/
	String str = "Cybertek";
	boolean b = str.isEmpty();
	System.out.println(b); // false
	
	if (!"".isEmpty()) {
		System.out.println("Empty");
	}else {
		System.out.println("Not empty");
	}
	System.out.println("-------------------------------------");
	
	
	/**
	 * equals(): checks if two strings values are equal or not
	 */
	String str2 = "Cybertek";
	String str3 = new String("Cybertek");
	System.out.println(str2 == str3); //false, different memory location.
	
	boolean a = str2.equals(str3); // true
	System.out.println(a);//true, because the value is same.
	
	System.out.println("java".equals("Java"));//false, because case sensetive
	System.out.println("-------------------------------------");
	
	
	/**
	 * equalsIgnoreCase(): checks if the two  
	 **/
	String str4 = "JAVA";
	String str5 = new String ("java");
	System.out.println(str4 == str5);//false, diff location and case sensitive
	System.out.println(str4.equals(str5));//false, case sensetive
	System.out.println("equalsIgnoreCase: "+str4.equalsIgnoreCase(str5));//true, ignores case sensitivity
	System.out.println("-------------------------------------");
	
	
	/**
	 * contains(): checks if the string contained  
	 **/
	String str6 = "Muhtar";
	boolean c = str6.contains("A");//false, because of casing.
	System.out.println("contains "+c);
	
	String str7 = "Marufjon";
	boolean d = str7.contains("m");//false, because of casing.
	System.out.println("contains: "+d);
	System.out.println("-------------------------------------");
	
	
	/**
	 * startsWith("str"): checks if the string started with str or not. returns boolean.
	 */
	String str8 = "Cybertek";
	boolean e = str8.startsWith("Cyn"); // false
	System.out.println("startsWith: "+e);
	
	String str9 = "Cybertek School is a great place to study";
	boolean f = str9.startsWith("Cybertek School");// true
	System.out.println("startsWith: "+f);
	System.out.println("-------------------------------------");
	
	
	/**
	 * endsWith("str"): checks if the string ends with str or not. returns boolean.
	 */
	String str10 = "Muhtar";
	boolean g = str10.endsWith("R"); // false
	System.out.println("endsWith: "+g);	//case sensitive
			
	
	
	}
}
