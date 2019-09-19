package day20_Recap_Strings;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		/*
		 * subdtring(), indexOf(), lastIndexOf(), replace(), replaceFirsta(), equals(), equalsIgnoreCase(),
		 * contains, startsWith(), endsWith(), charAt(), trim(), length(),isEmpty(), toUpperCase(), toLowerCase()
		 * lastIndexOf(strValue): returns the last occurrence of the charSequence' first char' index number:
		 */

		String st = "Cybertek School";
		st = st.substring(st.indexOf("School"));
		System.out.println(st);
		
		st = st.substring(0, st.indexOf("k")+1);
		System.out.println(st);
		
		//indexOf()
		String s1 = "Java is a fun language, I love java";
		System.out.println(s1.indexOf("age"));//19
		
		//lastIndexOf() -> returns last occurred char's index number
		System.out.println(s1.lastIndexOf("a"));//34
		
		//replace(): replaces old value with new one
		String name = "Cbertek School Batch 12";
		String name2 = name.replace(" ", "");
		System.out.println(name);
		System.out.println(name2);
		
		String name3 = name.replace("e", "a");//replaces all e with a
		System.out.println(name3+"\n");
		
		//replaceFirst() -> replaces the first occurred character 
		String A = "Java is a fun, Java is object oriented";
		String A1 = A.replaceFirst("Java", "C++");
		System.out.println(A1);
		String A2 = A.replaceAll("Java", "Python");
		System.out.println(A2+"\n");
		
		String B = "Java is a fun, Java is object oriented, Java is cool";
		System.out.println(B);
		String B1 = B.replace("d, Java", "d, C#");
		System.out.println(B1+"\n");
		
		//trim(); removes spaces
		String C = "      N      ";
		String C1 = C.trim();
		System.out.println(C);
		System.out.println("C1 "+C1+"\n");
		
		String CC = "      ";
		int len = CC.length();
		System.out.println(len);
		String CC1 = CC.trim();//removes all spaces
		System.out.println(CC1.length());
		System.out.println(CC1.isEmpty());
		
		
		
/*****************************************Muhtar's notes******************************************************/
		/*
 		Methods: 
 			substring , indexOf, lastIndexOf, replace, replaceFirst(),	equals(), equalIgnoreCase(),
 			contains, startsWith, endsWith,	charAt(), trim(), length, concat(), isEmpty, toUpperCase, toLowercase	
	   */
	
		
		/*
		 subString:
		 			creating the sub value of the String
		 			ending index is excluded
		 */
			String str = "Cybertek School"; // String literals
			str.substring(0, str.indexOf("k") + 1);
			System.out.println(str); // cybertek school, String is immutable
			str = str.substring(0, str.indexOf("k") + 1);
			System.out.println(str); // Cybertek
			String str2 = "Cybertek School";
			str2 = str2.substring(str2.indexOf("S"));
			System.out.println(str2); // school
			
			
			
			
		// index of: returns the first occurred value's index number
			String s2 ="Java is a fun language, I Love java, java,";
			System.out.println( s2.indexOf("a") );  //1
			System.out.println( s2.indexOf("ag"));  //19
			
		// lastIndexOf(): returns the last occurred char's index num
			System.out.println(s2.lastIndexOf("a")); //40
			System.out.println(s2.lastIndexOf("ava")); // 38
			System.out.println(s2.indexOf("ava,"));  //32
			
			
		// replace: replaces all the occurred old value with the new one
			String names = "Cybertek School Batch 12";
			int length = names.length();
			System.out.println(length);
				
		// names = names.replace(" ", "");
			System.out.println(names.length());
			names = names.replace("e", "a"); // replace all e with a
			System.out.println(names);
			names = names.replace("School", "Family");
			System.out.println(names);
			
			
	// replaceFirst: replaces the ifrst occured old character with the new one		
			String A3 = "Java is Fun, Java is object oriented, Java is cool";
			A3 = A3.replaceFirst("Java is o", "C++ is o");
			A3 = A3.replaceFirst("d, Java", "d, C#");
			System.out.println(A3);
				
				
		/*
		        == , equals,  equalIgnoreCase		
		 */
			String R1 = "Cybertek"; // String pool
			String R2 = new String("Cybertek"); // heap
			String R3 = new String("cybertek"); // heap
	
			System.out.println(R1 == R2); // false, different location
			System.out.println(R1.equals(R2)); // true, visibile texts are same
			System.out.println(R1.equals(R3)); // false, case sensitivity
			System.out.println(R1.equalsIgnoreCase(R3));// true, it checks the visible text without case sensitivity
			
				
				
		/*
		 	trim(): remove the unused spaces
		 */
			String spaces = "         M       ";
			spaces = spaces.trim(); //"M"
			System.out.println(spaces);
			
			String N1 ="    ";
			N1 = N1.trim();
			System.out.println( N1.isEmpty() );
			
			String N2 ="Tomorrow is gonna be  a great day to do repl.its";
			N2 =N2.trim();
			System.out.println(N2);
			
			N2 = N2.replace(" ", "");
			System.out.println(N2);
			
			
		// charAt(index): returns a specific character from the String
			String C3 ="Cybertek";
			//			01234567
			char ch = C3.charAt(4); // 'r'
			System.out.println(ch);
	
			String C2 ="Please do more and more java practices tomorrow";
			char ch2 = C2.charAt( C2.lastIndexOf("o") +1 );
			System.out.println(ch2);
			
				
			String sentences = "Tomorrow we do not hace class";
			System.out.println(sentences.charAt(0));
			System.out.println(sentences.charAt( sentences.length()-1 ));
			
			String  result = ""+sentences.charAt(0) + sentences.charAt(sentences.length()-1);
			System.out.println(result);	
			
			
		// startsWith & endsWith:  returns boolean, checks the starting and ending values
			
			String Gmail ="cybertekSchool@gmail.com";
			boolean R = Gmail.endsWith("@gmail.com");
			System.out.println(R);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter your email address");
			 String GmailAddress = scan.nextLine().toLowerCase();
			 
			 if(GmailAddress.endsWith("@gmail.com")) {
				 System.out.println("It's a valid gmail address ");
			 } else {
				 System.out.println("Invalid gmail address");
			 }
				
			 // starts with www.   and ends with .com
			 System.out.println("Enter a web Address");
			 String URL = scan.nextLine().toLowerCase();
			 
			 if(URL.startsWith("www.") && URL.endsWith(".com")) {
				 System.out.println("it's a valid web address");
			 } else {
				 System.out.println("it's invalid web address");
			 }
			 
	// contains: checks if the given value is contained in
			 //		the String or not then returns boolean
			 
			 String salary = "10$00";
			 boolean result2 = salary.contains("$");   //true
			 System.out.println(result2);
			 
		
	// concat: concates two String values:
			 String SchoolName ="Cybertek";
			 SchoolName = SchoolName.concat(" School");  
			 //"Cybertek School
			 System.out.println(SchoolName); 
			 String schoolName2 ="Cybertek "+123;  
			 // "+" concates any value to the String
			 System.out.println(schoolName2);
		
		
		
	}

}
