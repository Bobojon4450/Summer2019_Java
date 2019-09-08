package day15_Scanner_String;
import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		String str = "Cybertek";//stored in String pool memory
		String A = "Cybertek";
		
		System.out.println(str == A);
		
		String str2 = new String("Cybertek");//stored in heap memory
		System.out.println(str == str2);
		
		String str3 = new String("Cybertek");
		System.out.println(str2 == str3);//in different location.
		System.out.println(str2.equals(str3)); //compares by value.
		
		String a = "Batch12";
		String b = "batch12";
		System.out.println(a == b);// returns false, case-sensitive.
		
		
		
	}
}
