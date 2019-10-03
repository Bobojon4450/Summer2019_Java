package day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(100);
		list.add(10);
		list.add(20);
		System.out.println(list);
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}System.out.println();
		
		
		System.out.println(list.get(list.size()-1));
		list.clear();
		System.out.println(list);
		

	}
}
