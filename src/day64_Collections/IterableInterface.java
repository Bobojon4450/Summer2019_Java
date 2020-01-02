package day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IterableInterface {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5, 6, 7));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 1) {
				list.remove(i);
			}
		}
		System.out.println(list);
		System.out.println("--------------------------------------------------\n");
		
		List<Integer> list2 = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1, 1, 1));
		Iterator<Integer> iterator = list2.iterator();// returns the list of Iterator.
		boolean isEmpty = iterator.hasNext();
		System.out.println("isEmpty:\t" + isEmpty);
		System.out.println("--------------------------------------------------");
		
		/* Remove all data elements which equals to 1 
		 * The only legit way of removing the elements from the collection */
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1, 1, 1));
		System.out.println("list3:\t" + list3);

		Iterator<Integer> it3 = list3.iterator();// returns Iterator interface.
		while (it3.hasNext()) {
			int x = it3.next();
			if (x == 1) {
				it3.remove();
			}
		}
		System.out.println("list3:\t" + list3);
		System.out.println("--------------------------------------------------");

		String[] arr = { "Adam", "Nadira", "EHolly", "Tabriz", "Zuhal", "Erhan" };
		Set<String> names = new LinkedHashSet<String>();
		names.addAll(Arrays.asList(arr));
		System.out.println("Names:\t" + names);

		Iterator<String> removeE = names.iterator();
		while (removeE.hasNext()) {
			String str = removeE.next();
			/*
			 * if (str.contains("e") || str.contains("E")) { removeE.remove(); }
			 */
			if (str.toLowerCase().contains("e")) {
				removeE.remove();
			}
		}
		System.out.println("Names:\t" + names);
		System.out.println("--------------------------------------------------");
		
		List<Integer> myList = new ArrayList<Integer>();
		myList.addAll(Arrays.asList(110, 200, 99, 101, 78, 234, 456, 11, 100));

		/* In for loop initialization and condition is mandatory */
		for (Iterator<Integer> itr = myList.iterator(); itr.hasNext();) {
			int number = itr.next();
			if (number > 100) {
				itr.remove();
			}
		}
		System.out.println("myList:\t"+myList);
		System.out.println("--------------------------------------------------");
		
		String[] arr2 = { "Adam", "Erhan", "Madina", "Erhan", "Sawfan", "Jamal", "Erhan", "Zuhal", "Erhan" };
		List<String> duplNames = new ArrayList<String>();
		duplNames.addAll(Arrays.asList(arr2));
		System.out.println(duplNames);
		
		for (Iterator<String> itr = duplNames.iterator(); itr.hasNext(); ) {
			if (itr.next().equalsIgnoreCase("Erhan")) {
				itr.remove();
			}
		}
		System.out.println(duplNames);	
		System.out.println("--------------------------------------------------");
		
		List<String>list4 = new ArrayList<String>(Arrays.asList("Aza","Kaza","Oro","Pole","Sole","Merry","Sight"));
		System.out.println("list4:\t"+list4);
		
		for(Iterator<String>itr = list4.iterator(); itr.hasNext();) {
			if (itr.next().startsWith("S")) {
				itr.remove();
			}
		}
		System.out.println("list4:\t"+list4);
		System.out.println("--------------------------------------------------");
		
		
		List<Integer> list5 = new ArrayList<Integer>();
		list5.addAll(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11, 12, 13, 14, 15, 16));
		System.out.println(list5);

		for (Iterator<Integer> itr = list5.iterator(); itr.hasNext();) {
			int number = itr.next();
			if (number >= 10) {
				itr.remove();
			}
		}
		System.out.println(list5);
		Collections.sort(list5);
		System.out.println(list5);
		System.out.println("--------------------------------------------------");
		
		Integer[] arr3 = { 2, 4, 6, 8, 0, 8, 6, 4, 2, 1 };
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3); // Sort the array
		System.out.println(Arrays.toString(arr3));
		// remove the duplicates be assigning to a Set<>
		Set<Integer>set = new TreeSet<Integer>(Arrays.asList(arr3));
		System.out.println(set);
		
		
		
	}
}
