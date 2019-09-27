package day27_Custom_Methods;

public class VoidMethodWithArgument {

	/*
	 * Ex: Remove Duplicates("aabbcccccddddaaa")
            output: abc
	 */
	
	public static void main(String[] args) {
		oddOrEven(23);
		sumOfTwoNumbers(15, 1);
		removeDuplicates("aabbcccccddddaaa");
	}

	public static void oddOrEven(int num) {

		if (num % 2 == 0) {
			System.out.println(num  +" is even");
		}else {
			System.out.println(num  +" is odd");
		}
	}
	
	
	public static void sumOfTwoNumbers(int a, int b) {
		System.out.println("The sum of numbers is: "+(a+b));
	}
	

	public static void removeDuplicates(String str) {
		String unique = "";
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (!unique.contains("" + ch[i])) {
				unique += ch[i];
			}
		}
		System.out.print(unique);

	}
	
	}
