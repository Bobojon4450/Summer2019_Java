package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9));
		ArrayList<String> str = new ArrayList<>(
				Arrays.asList("Adam", "Sayfo", "Denis", "Zuhal", "Nurzat", "Sayfo", "Denis"));
		
		String[] arr = { "Adam", "Sayfo", "Denis", "Zuhal", "Nurzat", "Sayfo", "Denis", "Zuhal" };
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(arr));

		System.out.println(list);
		System.out.println(removeDup(list));

		System.out.println(str);
		System.out.println(removeStringDuplicates(str) + "\n");

		System.out.println(Arrays.toString(arr));
		System.out.println(removeStringDuplicates(names));
	}
	
	/*	Removes Integer duplicates from Integer Array List	*/
	public static ArrayList<Integer>removeDuplicate(ArrayList<Integer>list){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int each : list) {
			if (!result.contains(each)) {
				result.add(each);
			}
		}
		return result;	
	}
	
	/*	Removes Integer duplicates from Integer Array List	*/
	public static ArrayList<Integer>removeDup(ArrayList<Integer>list){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (!result.contains(list.get(i))) {
				result.add(list.get(i));
			}
		}
		return result;
	}
	
	/*	Removes String duplicates from String Array List	*/
	public static ArrayList<String>removeStringDuplicates(ArrayList<String>list){
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!result.contains(list.get(i))) {
				result.add(list.get(i));
			}
		}
		return result;
	}

	
	
}
