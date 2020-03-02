package day63_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import javax.sound.midi.Soundbank;

public class CollectionsReview {

	public static void main(String[] args) {
		
		/* Duplicates are allowed, ordered, size is dynamic */
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7, 7, 7));
		System.out.println("List:\t" + list);
		System.out.println("---------------------------------------");
		
		/* No duplicates are allowed, unordered, size is dynamic , Not indexed*/
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(Arrays.asList(2, 1, 5, 14, 3, 41, 3, 87, 7, 16, 8));
		System.out.println("Set <-> HashSet:\t" + set);
		System.out.println("---------------------------------------");
		
		
		/*	All collections Interfaces and Classes have dynamic size()	other then Array[] */
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);

		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.set(0, 2);
		System.out.println("Vector:\t" + vector);
		System.out.println("---------------------------------------");

		Stack<Integer> stack = new Stack<Integer>();
		stack.addAll(Arrays.asList(100, 200, 300));
		for (Integer integer : stack) {
			System.out.println(integer);
		}
		
		System.out.println("Stack:\t" + stack.pop());// 300 is no longer exist in stack.
		System.out.println("Stack:\t" + stack); // [100, 200]
		System.out.println(stack.get(0)); // 100
		System.out.println("---------------------------------------");
		
		/* List of lists */
		ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
		listOfLists.add(new ArrayList<Integer>());
		System.out.println("listOfLists.size():\t" + listOfLists.size());
		System.out.println("---------------------------------------");
		
		/* no duplicates are allowed, but order is not guaranteed */
		Set<Integer> setInt = new HashSet<Integer>();
		setInt.addAll(Arrays.asList(1, 2, 3, 4, 53, 32, 3, 2, 6));
		System.out.println("Set <-> HashSet:\t"+setInt);
		System.out.println("---------------------------------------");
		
		/* LinkedHashSet is ordered, NO duplicates allowed, Not indexed */
		Set<Integer> linkedhashset = new LinkedHashSet<Integer>();
		linkedhashset.addAll(Arrays.asList(1, 2, 3, 4, 53, 32, 3, 2, 6));
        System.out.println("Set <-> LinkedHashSet:\t"+linkedhashset);/*		[1, 2, 3, 4, 53, 32, 6]	*/
        System.out.println("---------------------------------------");
        
        
        List<Integer> lists = new ArrayList<Integer>( Arrays.asList(10, 9, 8, 7, 6));
        System.out.println("List:\t"+lists); //	[10, 9, 8, 7, 6]
        
        List<Integer> lists2 = new ArrayList<Integer>( Arrays.asList(10, 9, 8, 7, 6));
        Collections.sort(lists2) ;
        System.out.println("Sorted List:\t"+lists2); // [6, 7, 8, 9, 10]
        System.out.println("---------------------------------------");
        
        
        //The elements are ordered.
        SortedSet<Integer> sortedset = new TreeSet<Integer>( lists );   //10, 9, 8, 7, 6
        System.out.println("(I)SortedSet <-> (C)TreeSet:\t"+sortedset);// [6, 7, 8, 9, 10]
		
        /* No duplicates, not sorted */
		HashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.addAll(Arrays.asList(1, 3, 5, 2, 8, 0, 8, 6, 3, 2, 1));
		System.out.println("(C)HashSet <-> (C)LinkedHashSet:\t"+hs);
	}
}




