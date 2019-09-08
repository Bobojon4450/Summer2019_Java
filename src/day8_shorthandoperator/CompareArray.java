package day8_shorthandoperator;

public class CompareArray {

	public static void main(String[] args) {
		
		int first [] = {1,2,3,4,5,6,1};
		int second [] = {1,2,3,4,5,6};
		
		
		if (equals(first, second)) {
			System.out.println("Arrays are equal");
		}
		else
			System.out.println("Arrays are not equal");

	}

	public static boolean equals (int a [], int b []) {
		
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

}
