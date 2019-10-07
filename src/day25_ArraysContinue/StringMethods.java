package day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		/*
		 * split():	returns each as array separated with comma.
		 */
		String sentence = "Today is great day to learn java";
		String arr[] = sentence.split(" ");//returns each as array separated with comma
		System.out.println(Arrays.toString(arr));
		
//		String arr2[] = {sentence};
//		System.out.println(Arrays.toString(arr2));
		String email = "FirstName_LastName";
		String arr3 [] = email.split("_");
		System.out.println(Arrays.toString(arr3));
		//Also we can assign it to String data type
		String str = Arrays.toString(arr3);
		//getting rid of []
		System.out.println(str.replace("[", "").replace("]", ""));
		System.out.println("--------------------------");
		
		String fullName = "Cybertek School Batch12";
		String arr5 [] = fullName.split(" ");//returns new string array
		System.out.println(Arrays.toString(arr5));
		System.out.println("--------------------------");
		
		String java = "I love Java and Java is fun, Java is Life";
//					   I love  |   and   |  is fun,   |  is Life  --> 3 indexes
		String arr6 [] = java.split("Java");
		System.out.println(Arrays.toString(arr6));
		System.out.println(arr6.length-1);
		System.out.println("--------------------------");
		

		String Python =" Python is good, I love Python, Python is life ";
//					   [    |   is good, I love   |   ,    |   is life  ]
		String arr7 [] = Python.split("Python");
		System.out.println(Arrays.toString(arr7));
		System.out.println(arr7.length-1);
		System.out.println("--------------------------");
		
		String emailAddress = "cybertek.school.batch12@gmail.com";
		String fullemail = emailAddress.substring(0, emailAddress.indexOf("@"));
		System.out.println(fullemail);
		
		String allNames [] = fullemail.split("\\.");//need to use double slash with split method
		System.out.println(allNames[0]);
		System.out.println("--------------------------");
		
		String word = "ABCDEFG";
		String wordArr [] = word.split("");//splits string char by char returns it as an array.
		System.out.println(Arrays.toString(wordArr));
		System.out.println(wordArr.length);
		System.out.println("--------------------------");
		
		/*
		 * toCharArray(): returns a char array from the String
		 */
		String str3 = "Java";
		char [] ch = str3.toCharArray();//returns a string value into a char array.
		System.out.println(Arrays.toString(ch));
		System.out.println("--------------------------");
		
		
		
	}

}
