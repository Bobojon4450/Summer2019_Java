package day20_JavaRecap;

public class StringMethods {

	public static void main(String[] args) {
		/*
		 * subdtring(), indexOf(), lastIndexOf(), replace(), replaceFirsta(), equals(), equalsIgnoreCase(),
		 * contains, startsWith(), endsWith(), charAt(), trim(), length(),isEmpty(), toUpperCase(), toLowerCase()
		 */

		String str = "Cybertek School";
		str = str.substring(str.indexOf("School"));
		System.out.println(str);
		
		str = str.substring(0, str.indexOf("k")+1);
		System.out.println(str);
		
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
		System.out.println(C1+"\n");
		
		String CC = "      ";
		int len = CC.length();
		System.out.println(len);
		String CC1 = CC.trim();//removes all spaces
		System.out.println(CC1.length());
		System.out.println(CC1.isEmpty());
		
		
	}

}
