package day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(100);
		list.add(10);
		list.add(20);
		System.out.println("list: "+list);
		
		for (int each : list) {
			System.out.print(each+" ");
		}System.out.println();
		
		
		System.out.println(list.get(list.size()-1));// last element returned
		list.clear(); // cleans list
		System.out.println("list: "+list);
	}
}
