package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz_9 {

	public static void main(String[] args) {
		String[] array = { "Rob", "Bran", "Rick", "Bran" };
		ArrayList<String>name = new ArrayList<String>(Arrays.asList(array));
		if (name.remove("Bran")) { //[Rob, Rick, Bran] remove(Object) returns true if it finds and removes Object
			name.remove("John");	//[ returns false bc John does not exist]
		}/*	[Rob, Rick, Bran]	*/
	
		 // q1 : 
	    //    ArrayList<Object> list = new ArrayList<Object>();

		// q3:
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1, 2, 3));
		// index: 0 1 2

		int a = 1;
		list.remove(a); // [1,3]

		System.out.println(list);

		// q4:
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(Arrays.asList(1, 2, 3));

		Integer A = 1;
		list2.remove(A); // [2,3]
		System.out.println(list2);

		// q5:
		String[] arr = { "Rob", "Bran", "Rick", "Bran" };
		ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));

		if (names.remove("Bran")) { // [Rob, Rick, Bran] , true
			names.remove("John"); // false
		}

		System.out.println(names); // [Rob, Rick, Bran]
	
	}
	
	
	
}
