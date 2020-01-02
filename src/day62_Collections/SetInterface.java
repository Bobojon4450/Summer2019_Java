package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		System.out.println("---------------Set<E> Interface----------------------\n");
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(100, 100, 101));
		System.out.println("List:\t" + list);// [100, 100, 101]
		System.out.print("-----------------------------------------------------\n");

		/* HashSet<E>: Unsorted, Unordered, not indexed, Duplicates not allowed. */
		Set<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(100);
		set.add(9);
		set.add(12);
		set.add(101);
		System.out.println("HashSet:\t" + set);// [100, 101, 12]
		System.out.print("-----------------------------------------------------\n");

		/*
		 * LinkedHashSet: Ordered, Not sorted, Not indexed , Duplicates not allowed, doubly
		 * linked
		 */
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(100);
		linkedHashSet.add(100);
		linkedHashSet.add(12);
		linkedHashSet.add(101);
		System.out.println("(C)LinkedHashSet:\t" + linkedHashSet);// [100, 12, 101]
		System.out.print("-----------------------------------------------------\n");

		/* TreeSet: Sorted, Not indexed, No Duplicates allowed */
		Set<Integer> set3 = new TreeSet<Integer>();
		set3.add(12);
		set3.add(12);
		set3.add(11);
		set3.add(2);
		System.out.println("(I)Set <-> (C)TreeSet:\t" + set3);
		System.out.print("-----------------------------------------------------\n");

		/* Sorted, Not indexed, No duplicates allowed */
		SortedSet<String> treeset = new TreeSet<>();
		treeset.add("Z");
		treeset.add("Y");
		treeset.add("X");
		treeset.add("W");
		treeset.add("W");
		System.out.println("(I)SortedSet <-> (C)TreeSet:\t"+treeset);
		System.out.print("-----------------------------------------------------\n");

		/* Task: remove duplicates from an ArrayList, and sort It. */
		List<Integer> lt = new ArrayList<>();
		lt.addAll(Arrays.asList(10, 9, 8, 7, 6, 10, 10, 10, 10));
		Collections.sort(lt); // sorting the List<E>
		System.out.println("Sorted List:\t" + lt);

		/* Solution: */
		List<Integer> list2 = lt;
		TreeSet<Integer> ts = new TreeSet<>(list2);
		System.out.println("TreeSet:\t" + ts);
		System.out.print("-----------------------------------------------------\n");

		/*
		 * String str="AAAABBBCCCDDD"; write program that can remove duplicates from
		 * String
		 */

		String str = "ZZZZYYYXXAAAABBBCCCDDD"; // ZYXABCD
		String[] arr = str.split("");
		System.out.println(Arrays.toString(arr));

		/* With TreeSet{} - Sorted */
		TreeSet<String> treeSet = new TreeSet<>( Arrays.asList(arr));
		System.out.println("treeSet:\t"+treeSet.toString().replace("[", "").replace("]", "").replace(", ", ""));

		/* With LinkedHashSet{} - Ordered/Not sorted */
		LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<>(Arrays.asList(arr));
		String result = linkedHashSet2.toString().replace("[", "").replace("]", "").replace(", ", "");
		System.out.println("LinkedHashSet:\t"+result);
		System.out.print("-----------------------------------------------------\n");

		/* Second solution */
		String str2 = new LinkedHashSet<String>(Arrays.asList(arr)).toString().replace(", ", "");
		System.out.println("Second solution:\t" + str2);
		System.out.print("-----------------------------------------------------\n");
	}

}
