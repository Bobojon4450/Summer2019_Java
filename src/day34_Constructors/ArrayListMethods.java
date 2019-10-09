package day34_Constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); // auto-boxing
		list.add(Integer.valueOf("33")); // none
		list.add(Integer.parseInt("100")); // auto-boxing
		list.add(Integer.valueOf("33")); // none

		/*
		 * indexOf(): returns the index of the first matching given object from the
		 * list. if it returns negative number, then it means the given object does not
		 * exist
		 */
		int a = list.indexOf(33); // auto-boxing
		System.out.println(a);

		/* lastIndexOf(): returns the last occurrance of the given object in the list */
		int lastIndex = list.lastIndexOf(33);
		System.out.println(lastIndex); // 3

		/* Arrays.asList(): converts object arrays to List interface. */
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr));
		list2.add(11);
		System.out.println(list2);

		String[] str = { "Java", "Python", "SQL", "C#" };
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList(str));
		System.out.println(list3.isEmpty()); // false
		
		int [] arr2 = {1,2,3,4,5,6,7,8,9};
		/*	Only object class arrays are converted		*/
//		ArrayList<Integer>list4 = new ArrayList<Integer>(Arrays.asList(arr2));	compile error!
		
/*	addAll(): */
		String [] names = {"Adam","Zuhal","Zabi","Alip"};
		
		ArrayList<String>list4 = new ArrayList<>();
		list4.addAll(Arrays.asList("Almaz", "Ibrahim", "Tabi"));
		System.out.println(list4);
		list4.addAll(Arrays.asList(names));
		System.out.println(list4 + "\n");

/*	removeAll(): 	removes all specified object from list	*/
		ArrayList<Integer> list5 = new ArrayList<>();
		list5.addAll(Arrays.asList(1, 1, 1, 1, 1, 2, 2, 2, 22, 3, 3, 3, 3, 34, 4, 4, 4));
		System.out.println(list5);
		list5.removeAll(Arrays.asList(1));
		System.out.println(list5 + "\n");
	
		/* remove() is not designed to apply within a loop	*/
		
/*	Collections.sort(): sorts arrayList in ascending order			*/
		
		Integer[] y = { 12, 345, 21, 678, 964, 3, 68, 9, 9008 };
		ArrayList<Integer> price = new ArrayList<>(Arrays.asList(y));
		System.out.println(price);
		Collections.sort(price);
		System.out.println(price);

		
		
	}
}
