package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("peach");
		list.add("grapes");
		System.out.println(list);
		list.add(1, "cherry");
		list.add(2, "Banana");
		System.out.println(list);
		list.add(list.size(), "Melon");
		System.out.println(list + "\n");

// get(index number) : returns the object.
		ArrayList<String> names = new ArrayList<>();
		names.add("Homayra");
		names.add("Meri");
		names.add(1, "Mikrigul");
		names.add(1, "Tabriz");
		names.add(0, "Asiya");

		String str1 = names.get(1);
		System.out.println(str1);

		/* size(): returns the length of the list as an int value */
		int length = names.size();
		for (int i = 0; i < names.size(); i++) {
			String each = names.get(i);
			System.out.print(each + " ");
		}
		System.out.println();

		/* clear(): clears the entire AraayList */
		ArrayList<String> students = new ArrayList<>();
		students.add("Holy");
		students.add("Moly");
		students.add("Guacamoly");
		students.add("Adam");
		System.out.println(students);
		System.out.println(students.size());
		students.clear();
		System.out.println("students: " + students);
		System.out.println("students.size() " + students.size() + "\n");

		/* set(index number, object): the given object will replace the object at the */
		ArrayList<String> javengers = new ArrayList<>();
		javengers.add("Ferhat");
		javengers.add("Lexi");
		javengers.add("Asiya");
		javengers.add("Uzgen");
		javengers.add("Adamsho");
		System.out.println(javengers);
		javengers.set(0, javengers.get(javengers.size() - 1));
		System.out.println(javengers + "\n");

		/* contains(object): checks if the given object is contained in the ArrayList */
		ArrayList<String> goodGuys = new ArrayList<>();
		goodGuys.add("Adam");
		goodGuys.add("Zuhal");
		goodGuys.add("Alip");
		goodGuys.add("Marina");
		goodGuys.add("Zabi");
		goodGuys.add("Junhe");
		boolean result = goodGuys.contains("Adam");
		System.out.println(result + "\n");

		/* equals(object): checks if two arrays are equal */
		ArrayList<String> badGuys = new ArrayList<>();
		badGuys.add("Muhtar");
		badGuys.add("Asiya");
		badGuys.add("replit");

		boolean bool = badGuys.equals(goodGuys);
		System.out.println(bool + "\n");

		/* remove(): removes the given index */
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		System.out.println(nums);
		nums.remove(0);
		System.out.println(nums + "\n");

		/*
		 * remove(Integer): removes the first matching object, and at the same time
		 * returns boolean expression
		 */
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums2.add(1);
		nums2.add(2);
		nums2.add(3);
		nums2.add(4);
		nums2.add(5);
		System.out.println("before remove: " + nums2);
		Integer a = 2;
		boolean b = nums2.remove(a);
		System.out.println("after remove: " + nums2);
		System.out.println(b + "\n");

		/***********************************************/

		ArrayList<String> city = new ArrayList<String>();
		city.add("Miami");
		city.add("Dushanbe");
		city.add("Ashghabad");
		city.add("Tehran");
		boolean removed = city.remove("Miami");
		if (removed) {
			System.out.println(city + "\n");
		}

		ArrayList<Integer> price = new ArrayList<>();
		price.add(1); // auto-boxing
		price.add(2);
		price.add(3);
		price.add(4);
		price.add(5);
		price.remove(Integer.parseInt("2"));//returns primitive, hence index 2 removed.
		System.out.println(price); 	//[1, 2, 4, 5]
		price.remove(Integer.valueOf("3")); //returns Object, hence object 3 removed if exist. Returns false otherwise.
		
		
		
	}

}
